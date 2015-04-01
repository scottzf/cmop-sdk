package com.sobey.sdk.entity;

public class CreateELBRuleEntity {

	private String accessKey;
	private String ecsCodes;
	private String elbCode;
	private String elbRuleName;
	private String protocols;

	public CreateELBRuleEntity(String accessKey, String ecsCodes, String elbCode, String elbRuleName, String protocols) {
		super();
		this.accessKey = accessKey;
		this.ecsCodes = ecsCodes;
		this.elbCode = elbCode;
		this.elbRuleName = elbRuleName;
		this.protocols = protocols;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCodes() {
		return ecsCodes;
	}

	public String getElbCode() {
		return elbCode;
	}

	public String getElbRuleName() {
		return elbRuleName;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCodes(String ecsCodes) {
		this.ecsCodes = ecsCodes;
	}

	public void setElbCode(String elbCode) {
		this.elbCode = elbCode;
	}

	public void setElbRuleName(String elbRuleName) {
		this.elbRuleName = elbRuleName;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

}
