package com.sobey.sdk.entity;

public class DescribeEIPEntity {

	private String accessKey;
	private String code;

	public DescribeEIPEntity(String accessKey, String code) {
		super();
		this.accessKey = accessKey;
		this.code = code;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getCode() {
		return code;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
