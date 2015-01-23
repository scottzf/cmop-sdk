package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ECSImageEnum;

public class ReconfigECSEntity {

	private String accessKey;
	private String code;
	private ECSImageEnum specEnum;

	public ReconfigECSEntity(String accessKey, String code, ECSImageEnum specEnum) {
		super();
		this.accessKey = accessKey;
		this.code = code;
		this.specEnum = specEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ECSImageEnum getSpecEnum() {
		return specEnum;
	}

	public void setSpecEnum(ECSImageEnum specEnum) {
		this.specEnum = specEnum;
	}

}
