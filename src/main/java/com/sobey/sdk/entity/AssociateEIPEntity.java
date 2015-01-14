package com.sobey.sdk.entity;

public class AssociateEIPEntity {

	private String accessKey;
	private String code;
	private String serviceCode;

	public AssociateEIPEntity(String accessKey, String code, String serviceCode) {
		super();
		this.accessKey = accessKey;
		this.code = code;
		this.serviceCode = serviceCode;
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

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
