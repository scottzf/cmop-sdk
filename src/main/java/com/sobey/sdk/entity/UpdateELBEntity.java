package com.sobey.sdk.entity;

public class UpdateELBEntity {

	private String accessKey;
	private String elbCode;
	private String elbName;

	public UpdateELBEntity(String accessKey, String elbCode, String elbName) {
		super();
		this.accessKey = accessKey;
		this.elbCode = elbCode;
		this.elbName = elbName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getElbCode() {
		return elbCode;
	}

	public String getElbName() {
		return elbName;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setElbCode(String elbCode) {
		this.elbCode = elbCode;
	}

	public void setElbName(String elbName) {
		this.elbName = elbName;
	}

}
