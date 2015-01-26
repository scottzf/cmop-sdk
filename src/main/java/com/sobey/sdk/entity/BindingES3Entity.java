package com.sobey.sdk.entity;

public class BindingES3Entity {

	private String accessKey;
	private String ecsCode;
	private String es3Code;

	public BindingES3Entity(String accessKey, String ecsCode, String es3Code) {
		super();
		this.accessKey = accessKey;
		this.ecsCode = ecsCode;
		this.es3Code = es3Code;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCode() {
		return ecsCode;
	}

	public String getEs3Code() {
		return es3Code;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCode(String ecsCode) {
		this.ecsCode = ecsCode;
	}

	public void setEs3Code(String es3Code) {
		this.es3Code = es3Code;
	}

}
