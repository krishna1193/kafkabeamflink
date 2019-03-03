package com.hsbc.ctu.demo.IT4Dataflow;

import java.util.HashMap;
import java.util.Map;

import org.apache.beam.runners.flink.FlinkRunner;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.io.kafka.KafkaIO;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.transforms.Values;
import org.apache.beam.sdk.transforms.DoFn.ProcessContext;
import org.apache.beam.sdk.transforms.DoFn.ProcessElement;
import org.apache.beam.sdk.transforms.windowing.FixedWindows;
import org.apache.beam.sdk.transforms.windowing.Window;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.joda.time.Duration;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class KafkaConsumerBeam {

    private static final DateTimeFormatter FORMATTER = ISODateTimeFormat.hourMinute();

    static final String OUTPUT_PATH = "BEAM";  // Default output path
    static final String BOOTSTRAP_SERVERS = "localhost:9092";  // Default bootstrap kafka servers
    static final String TOPIC = "odd";  // Default kafka topic name

    /**
     * Specific pipeline options.
     */
    private interface Options extends PipelineOptions {
        @Description("Kafka bootstrap servers")
        @Default.String(BOOTSTRAP_SERVERS)
        String getBootstrap();

        void setBootstrap(String value);

        @Description("Output Path")
        @Default.String(OUTPUT_PATH)
        String getOutput();

        void setOutput(String value);

        @Description("Kafka topic name")
        @Default.String(TOPIC)
        String getTopic();

        void setTopic(String value);
    }

    public final static void main(String args[]) throws Exception {
        final Options options = PipelineOptionsFactory.fromArgs(args).withValidation().as(Options.class);
        options.setRunner(FlinkRunner.class);
        Pipeline pipeline = Pipeline.create(options);
        Map<String, Object> props = new HashMap<>();
        props.put("auto.offset.reset", "latest");
        props.put("group.id", "test-group");
        
        pipeline
                .apply(KafkaIO.<String, String>read()
                        .withBootstrapServers(options.getBootstrap())
                        .withTopic(options.getTopic())
                        .withKeyDeserializer(StringDeserializer.class)
                        .withValueDeserializer(StringDeserializer.class)
                        .updateConsumerProperties(props)

                        .withoutMetadata())
                .apply(Values.<String>create())
                .apply(Window.<String>into(FixedWindows.of(Duration.standardSeconds(3)))
                        
                )
                .apply("First DoFn", ParDo.of(new DoFn<String, String>() {
					private static final long serialVersionUID = 1L;

					@ProcessElement
					public void processElement(ProcessContext c) {
						String line = c.element().toString();
						System.out.println("this message is from first data");
						System.out.println(line);
						c.output(line);
					}
				}))
                .apply("second DoFn", ParDo.of(new DoFn<String, String>() {
					private static final long serialVersionUID = 1L;

					@ProcessElement
					public void processElement(ProcessContext c) {
						String line = c.element().toString();
						System.out.println("this message is from first data");
						System.out.println(line);
						c.output(line);
					}
				})).
                //apply("storage",TextIO.write().to("output").withWindowedWrites().withNumShards(1));
                apply(KafkaIO.<Void, String>write().withBootstrapServers("localhost:9092").withTopic("BEAM").withValueSerializer(StringSerializer.class).values());
        pipeline.run().waitUntilFinish();
    }


}
