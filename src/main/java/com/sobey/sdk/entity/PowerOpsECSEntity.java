package com.sobey.sdk.entity;

import com.sobey.sdk.constant.PowerEnum;

public class PowerOpsECSEntity {

	private String accessKey;
	private String ecsCode;
	private PowerEnum powerEnum;

	public PowerOpsECSEntity(String accessKey, String ecsCode, PowerEnum powerEnum) {
		super();
		this.accessKey = accessKey;
		this.ecsCode = ecsCode;
		this.powerEnum = powerEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCode() {
		return ecsCode;
	}

	public PowerEnum getPowerEnum() {
		return powerEnum;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCode(String ecsCode) {
		this.ecsCode = ecsCode;
	}

	public void setPowerEnum(PowerEnum powerEnum) {
		this.powerEnum = powerEnum;
	}

}
