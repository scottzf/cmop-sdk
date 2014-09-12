package com.sobey.sdk.entity;

public class DeleteELBEntity {

	private String accessKey;
	private String elbName;

	public DeleteELBEntity(String accessKey, String elbName) {
		super();
		this.accessKey = accessKey;
		this.elbName = elbName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getElbName() {
		return elbName;
	}

	public void setElbName(String elbName) {
		this.elbName = elbName;
	}

}
