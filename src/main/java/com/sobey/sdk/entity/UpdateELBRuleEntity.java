package com.sobey.sdk.entity;

public class UpdateELBRuleEntity {

	private String accessKey;
	private String elbRuleCode;
	private String elbRuleName;

	public UpdateELBRuleEntity(String accessKey, String elbRuleCode, String elbRuleName) {
		super();
		this.accessKey = accessKey;
		this.elbRuleCode = elbRuleCode;
		this.elbRuleName = elbRuleName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getElbRuleCode() {
		return elbRuleCode;
	}

	public String getElbRuleName() {
		return elbRuleName;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setElbRuleCode(String elbRuleCode) {
		this.elbRuleCode = elbRuleCode;
	}

	public void setElbRuleName(String elbRuleName) {
		this.elbRuleName = elbRuleName;
	}

}
