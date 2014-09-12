package com.sobey.sdk.entity;

public class DestroyECSEntity {

	private String accessKey;
	private String ecsName;

	public DestroyECSEntity(String accessKey, String ecsName) {
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
