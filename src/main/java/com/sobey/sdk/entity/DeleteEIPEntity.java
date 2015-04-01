package com.sobey.sdk.entity;

public class DeleteEIPEntity {

	private String accessKey;
	private String eipCode;

	public DeleteEIPEntity(String accessKey, String eipCode) {
		super();
		this.accessKey = accessKey;
		this.eipCode = eipCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEipCode() {
		return eipCode;
	}

	public void setEipCode(String eipCode) {
		this.eipCode = eipCode;
	}

}
