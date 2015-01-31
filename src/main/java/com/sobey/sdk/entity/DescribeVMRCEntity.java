package com.sobey.sdk.entity;

public class DescribeVMRCEntity {

	private String accessKey;
	private String ecsCode;

	public DescribeVMRCEntity(String accessKey, String ecsCode) {
		super();
		this.accessKey = accessKey;
		this.ecsCode = ecsCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCode() {
		return ecsCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCode(String ecsCode) {
		this.ecsCode = ecsCode;
	}

}
