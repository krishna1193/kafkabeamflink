package com.hsbc.ctu.demo.inflow;

public class TriggerDescription {
	private String accntCtryCde;
	private String trigType;
	private String trigText;
	private String trigCode;
	private String trigSrce;
	private String lobCde;
	private String clntType;
	private String hsbcEntryCde;
	
	public TriggerDescription(){
		
	}
	public TriggerDescription(String accntCtryCde, String trigType,
			String trigText, String trigCode, String trigSrce, String lobCde,
			String clntType, String hsbcEntryCde) {
		super();
		this.accntCtryCde = accntCtryCde;
		this.trigType = trigType;
		this.trigText = trigText;
		this.trigCode = trigCode;
		this.trigSrce = trigSrce;
		this.lobCde = lobCde;
		this.clntType = clntType;
		this.hsbcEntryCde = hsbcEntryCde;
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
	
	

}
