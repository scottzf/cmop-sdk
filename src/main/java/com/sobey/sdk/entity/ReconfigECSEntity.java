package com.sobey.sdk.entity;

public class ReconfigECSEntity {

	private String accessKey;
	private String ecsName;
	private String ecsSpec;

	public ReconfigECSEntity(String accessKey, String ecsName, String ecsSpec) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.ecsSpec = ecsSpec;
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

	public String getEcsSpec() {
		return ecsSpec;
	}

	public void setEcsSpec(String ecsSpec) {
		this.ecsSpec = ecsSpec;
	}

}
