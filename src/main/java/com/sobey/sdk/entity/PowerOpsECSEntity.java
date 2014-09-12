package com.sobey.sdk.entity;

public class PowerOpsECSEntity {

	private String accessKey;
	private String ecsName;
	private String powerOperation;

	public PowerOpsECSEntity(String accessKey, String ecsName, String powerOperation) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.powerOperation = powerOperation;
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

	public String getPowerOperation() {
		return powerOperation;
	}

	public void setPowerOperation(String powerOperation) {
		this.powerOperation = powerOperation;
	}

}
