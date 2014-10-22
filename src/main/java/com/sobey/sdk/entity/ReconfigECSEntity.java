package com.sobey.sdk.entity;

import com.sobey.sdk.constant.SpecEnum;

public class ReconfigECSEntity {

	private String accessKey;
	private String ecsName;
	private SpecEnum specEnum;

	public ReconfigECSEntity(String accessKey, String ecsName, SpecEnum specEnum) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.specEnum = specEnum;
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

	public SpecEnum getSpecEnum() {
		return specEnum;
	}

	public void setSpecEnum(SpecEnum specEnum) {
		this.specEnum = specEnum;
	}

}
