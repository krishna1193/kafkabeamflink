package com.hsbc.ctu.demo.inflow;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConverstionUtil {

	public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static Date stringToDate(final String stringValue) {
		if ("".equalsIgnoreCase(stringValue) || stringValue == null)
			return null;

		Date dateValue = new Date();
		try {
			dateValue = DATE_FORMAT.parse(stringValue);
		} catch (ParseException e) {
			System.out.println("unable to parse date" + e.getMessage());
		}

		return dateValue;
	}

	public static GCDUCustomerBusinessRecordValidationBean convert(final GCDUCustomerBusinessRecord inputBean) {
		GCDUCustomerBusinessRecordValidationBean outputBean = new GCDUCustomerBusinessRecordValidationBean();
		outputBean.setRecType(inputBean.getRecType());
		outputBean.setDataType(inputBean.getDataType());
		outputBean.setCtuRolId(inputBean.getCtuRolId());
		outputBean.setCustIdNum(inputBean.getCustIdNum());
		outputBean.setAccntCtryCde(inputBean.getAccntCtryCde());
		outputBean.setCustName(inputBean.getCustName());
		outputBean.setLobCde(inputBean.getLobCde());
		outputBean.setClntTypeCde(inputBean.getClntTypeCde());
		outputBean.setHsbcEntryCde(inputBean.getHsbcEntryCde());

		outputBean.setAcctOpenDt(stringToDate(inputBean.getAcctOpenDt()));
		return outputBean;
	}

}
