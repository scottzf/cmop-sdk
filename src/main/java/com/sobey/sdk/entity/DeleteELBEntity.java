package com.sobey.sdk.entity;

public class DeleteELBEntity {

	private String accessKey;
	private String elbCode;

	public DeleteELBEntity(String accessKey, String elbCode) {
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
