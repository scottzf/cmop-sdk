package com.sobey.sdk.entity;

public class UpdateSubnetEntity {

	private String accessKey;
	private String subnetCode;
	private String subnetName;

	public UpdateSubnetEntity(String accessKey, String subnetCode, String subnetName) {
		super();
		this.accessKey = accessKey;
		this.subnetCode = subnetCode;
		this.subnetName = subnetName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSubnetCode() {
		return subnetCode;
	}

	public void setSubnetCode(String subnetCode) {
		this.subnetCode = subnetCode;
	}

	public String getSubnetName() {
		return subnetName;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
	}

}
