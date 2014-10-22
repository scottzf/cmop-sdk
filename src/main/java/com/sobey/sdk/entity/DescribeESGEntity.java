package com.sobey.sdk.entity;

public class DescribeESGEntity {

	private String accessKey;
	private String esgName;

	public DescribeESGEntity(String accessKey, String esgName) {
		super();
		this.accessKey = accessKey;
		this.esgName = esgName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEsgName() {
		return esgName;
	}

	public void setEsgName(String esgName) {
		this.esgName = esgName;
	}

}
