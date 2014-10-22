package com.sobey.sdk.entity;

public class DescribeEIPEntity {

	private String accessKey;
	private String eipName;

	public DescribeEIPEntity(String accessKey, String eipName) {
		super();
		this.accessKey = accessKey;
		this.eipName = eipName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEipName() {
		return eipName;
	}

	public void setEipName(String eipName) {
		this.eipName = eipName;
	}

}
