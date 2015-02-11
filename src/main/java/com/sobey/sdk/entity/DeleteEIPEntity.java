package com.sobey.sdk.entity;

public class DeleteEIPEntity {

	private String accessKey;
	private String code;

	public DeleteEIPEntity(String accessKey, String code) {
		super();
		this.accessKey = accessKey;
		this.code = code;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
