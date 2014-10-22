package com.sobey.sdk.entity;

import com.sobey.sdk.constant.PowerEnum;

public class PowerOpsECSEntity {

	private String accessKey;
	private String ecsName;
	private PowerEnum powerEnum;

	public PowerOpsECSEntity(String accessKey, String ecsName, PowerEnum powerEnum) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.powerEnum = powerEnum;
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

	public PowerEnum getPowerEnum() {
		return powerEnum;
	}

	public void setPowerEnum(PowerEnum powerEnum) {
		this.powerEnum = powerEnum;
	}

}
