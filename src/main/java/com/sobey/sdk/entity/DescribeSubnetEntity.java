package com.sobey.sdk.entity;

public class DescribeSubnetEntity {

	private String accessKey;
	private String subnetCode;

	public DescribeSubnetEntity(String accessKey, String subnetCode) {
		super();
		this.accessKey = accessKey;
		this.subnetCode = subnetCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getSubnetCode() {
		return subnetCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setSubnetCode(String subnetCode) {
		this.subnetCode = subnetCode;
	}

}
