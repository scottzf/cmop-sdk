package com.sobey.sdk.entity;

public class DescribeELBEntity {

	private String accessKey;
	private String elbCode;

	public DescribeELBEntity(String accessKey, String elbCode) {
		super();
		this.accessKey = accessKey;
		this.elbCode = elbCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getElbCode() {
		return elbCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setElbCode(String elbCode) {
		this.elbCode = elbCode;
	}

}
