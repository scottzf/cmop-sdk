package com.sobey.sdk.entity;

import com.sobey.sdk.constant.SpecEnum;

public class ReconfigECSEntity {

	private String accessKey;
	private String code;
	private SpecEnum specEnum;

	public ReconfigECSEntity(String accessKey, String code, SpecEnum specEnum) {
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

	public SpecEnum getSpecEnum() {
		return specEnum;
	}

	public void setSpecEnum(SpecEnum specEnum) {
		this.specEnum = specEnum;
	}

}
