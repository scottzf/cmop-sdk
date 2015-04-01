package com.sobey.sdk.entity;

public class DescribeEIPEntity {

	private String accessKey;
	private String eipCode;

	public DescribeEIPEntity(String accessKey, String eipCode) {
		super();
		this.accessKey = accessKey;
		this.eipCode = eipCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEipCode() {
		return eipCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEipCode(String eipCode) {
		this.eipCode = eipCode;
	}

}
