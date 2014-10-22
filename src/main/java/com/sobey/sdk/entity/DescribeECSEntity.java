package com.sobey.sdk.entity;

public class DescribeECSEntity {

	private String accessKey;
	private String ecsName;

	public DescribeECSEntity(String accessKey, String ecsName) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEcsName() {
		return ecsName;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

}
