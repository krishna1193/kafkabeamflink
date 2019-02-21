package com.hsbc.ctu.demo.inflow;

public class GCDUCustomerBusinessRecord {
	private String recType;
	private String dataType;
	private String ctuRolId;
	private String custIdNum;
	private String accntCtryCde;
	private String custName;
	private String lobCde;
	private String clntTypeCde;
	private String hsbcEntryCde;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM yyyy HH:mm:ss zzz")
	private String acctOpenDt;
	
	public GCDUCustomerBusinessRecord(){
		
	}
	public GCDUCustomerBusinessRecord(String recType, String dataType, String ctuRolId,
			String custIdNum, String accntCtryCde, String custName,
			String lobCde, String clntTypeCde, String hsbcEntryCde,
			String acctOpenDt) {
		super();
		this.recType = recType;
		this.dataType = dataType;
		this.ctuRolId = ctuRolId;
		this.custIdNum = custIdNum;
		this.accntCtryCde = accntCtryCde;
		this.custName = custName;
		this.lobCde = lobCde;
		this.clntTypeCde = clntTypeCde;
		this.hsbcEntryCde = hsbcEntryCde;
		this.acctOpenDt = acctOpenDt;
	}
	public String getRecType() {
		return recType;
	}
	public void setRecType(String recType) {
		this.recType = recType;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	
	public String getCtuRolId() {
		return ctuRolId;
	}
	public void setCtuRolId(String ctuRolId) {
		this.ctuRolId = ctuRolId;
	}
	public String getCustIdNum() {
		return custIdNum;
	}
	public void setCustIdNum(String custIdNum) {
		this.custIdNum = custIdNum;
	}
	public String getAccntCtryCde() {
		return accntCtryCde;
	}
	public void setAccntCtryCde(String accntCtryCde) {
		this.accntCtryCde = accntCtryCde;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getLobCde() {
		return lobCde;
	}
	public void setLobCde(String lobCde) {
		this.lobCde = lobCde;
	}
	public String getClntTypeCde() {
		return clntTypeCde;
	}
	public void setClntTypeCde(String clntTypeCde) {
		this.clntTypeCde = clntTypeCde;
	}
	public String getHsbcEntryCde() {
		return hsbcEntryCde;
	}
	public void setHsbcEntryCde(String hsbcEntryCde) {
		this.hsbcEntryCde = hsbcEntryCde;
	}
	public String getAcctOpenDt() {
		return acctOpenDt;
	}
	public void setAcctOpenDt(String acctOpenDt) {
		this.acctOpenDt = acctOpenDt;
	}
	
	
	
	
	
	

}
