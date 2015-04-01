package com.sobey.sdk.entity;

public class DeleteELBRuleEntity {

	private String accessKey;
	private String elbRuleCode;

	public DeleteELBRuleEntity(String accessKey, String elbRuleCode) {
		super();
		this.accessKey = accessKey;
		this.elbRuleCode = elbRuleCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getElbRuleCode() {
		return elbRuleCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setElbRuleCode(String elbRuleCode) {
		this.elbRuleCode = elbRuleCode;
	}

}
