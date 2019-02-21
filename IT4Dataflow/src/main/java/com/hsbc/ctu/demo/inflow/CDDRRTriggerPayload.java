package com.hsbc.ctu.demo.inflow;

import java.sql.Date;

public class CDDRRTriggerPayload {
	
	private String accntCtryCde;
	private String trigType;
	private String trigText;
	private String trigCode;
	private String trigSrce;
	private String lobCde;
	private String clntType;
	private String hsbcEntryCde;
	private String recType;
	private String dataType;
	private String ctuRolId;
	private String custIdNum;
	private String custName;
	private String clntTypeCde;
	private Date acctOpenDt;
	
	public CDDRRTriggerPayload(){
		
	}
	public CDDRRTriggerPayload(String accntCtryCde, String trigType,
			String trigText, String trigCode, String trigSrce, String lobCde,
			String clntType, String hsbcEntryCde, String recType,
			String dataType, String ctuRolId, String custIdNum,
			String custName, String clntTypeCde, Date acctOpenDt) {
		super();
		this.accntCtryCde = accntCtryCde;
		this.trigType = trigType;
		this.trigText = trigText;
		this.trigCode = trigCode;
		this.trigSrce = trigSrce;
		this.lobCde = lobCde;
		this.clntType = clntType;
		this.hsbcEntryCde = hsbcEntryCde;
		this.recType = recType;
		this.dataType = dataType;
		this.ctuRolId = ctuRolId;
		this.custIdNum = custIdNum;
		this.custName = custName;
		this.clntTypeCde = clntTypeCde;
		this.acctOpenDt = acctOpenDt;
	}
	public String getAccntCtryCde() {
		return accntCtryCde;
	}
	public void setAccntCtryCde(String accntCtryCde) {
		this.accntCtryCde = accntCtryCde;
	}
	public String getTrigType() {
		return trigType;
	}
	public void setTrigType(String trigType) {
		this.trigType = trigType;
	}
	public String getTrigText() {
		return trigText;
	}
	public void setTrigText(String trigText) {
		this.trigText = trigText;
	}
	public String getTrigCode() {
		return trigCode;
	}
	public void setTrigCode(String trigCode) {
		this.trigCode = trigCode;
	}
	public String getTrigSrce() {
		return trigSrce;
	}
	public void setTrigSrce(String trigSrce) {
		this.trigSrce = trigSrce;
	}
	public String getLobCde() {
		return lobCde;
	}
	public void setLobCde(String lobCde) {
		this.lobCde = lobCde;
	}
	public String getClntType() {
		return clntType;
	}
	public void setClntType(String clntType) {
		this.clntType = clntType;
	}
	public String getHsbcEntryCde() {
		return hsbcEntryCde;
	}
	public void setHsbcEntryCde(String hsbcEntryCde) {
		this.hsbcEntryCde = hsbcEntryCde;
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
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getClntTypeCde() {
		return clntTypeCde;
	}
	public void setClntTypeCde(String clntTypeCde) {
		this.clntTypeCde = clntTypeCde;
	}
	public Date getAcctOpenDt() {
		return acctOpenDt;
	}
	public void setAcctOpenDt(Date acctOpenDt) {
		this.acctOpenDt = acctOpenDt;
	}
	@Override
	public String toString() {
		return " {accntCtryCde=" + accntCtryCde + ", trigType=" + trigType + ", trigText=" + trigText
				+ ", trigCode=" + trigCode + ", trigSrce=" + trigSrce + ", lobCde=" + lobCde + ", clntType=" + clntType
				+ ", hsbcEntryCde=" + hsbcEntryCde + ", recType=" + recType + ", dataType=" + dataType + ", ctuRolId="
				+ ctuRolId + ", custIdNum=" + custIdNum + ", custName=" + custName + ", clntTypeCde=" + clntTypeCde
				+ ", acctOpenDt=" + acctOpenDt + "}";
	}
	
	
	

}
