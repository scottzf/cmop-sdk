package com.sobey.sdk.entity;

public class DissociateESGEntity {

	private String accessKey;
	private String esgName;
	private String ecsName;

	public DissociateESGEntity(String accessKey, String esgName, String ecsName) {
		super();
		this.accessKey = accessKey;
		this.esgName = esgName;
		this.ecsName = ecsName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEsgName() {
		return esgName;
	}

	public void setEsgName(String esgName) {
		this.esgName = esgName;
	}

	public String getEcsName() {
		return ecsName;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

}
