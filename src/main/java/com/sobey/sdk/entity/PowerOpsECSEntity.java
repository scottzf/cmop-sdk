package com.sobey.sdk.entity;

import com.sobey.sdk.constant.PowerEnum;

public class PowerOpsECSEntity {

	private String accessKey;
	private String code;
	private PowerEnum powerEnum;

	public PowerOpsECSEntity(String accessKey, String code, PowerEnum powerEnum) {
		super();
		this.accessKey = accessKey;
		this.code = code;
		this.powerEnum = powerEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getCode() {
		return code;
	}

	public PowerEnum getPowerEnum() {
		return powerEnum;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setPowerEnum(PowerEnum powerEnum) {
		this.powerEnum = powerEnum;
	}

}
