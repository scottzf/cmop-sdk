package com.sobey.sdk.entity;

public class BindingEIPEntity {

	private String accessKey;
	private String eipCode;
	private String iaasCode;

	public BindingEIPEntity(String accessKey, String eipCode, String iaasCode) {
		super();
		this.accessKey = accessKey;
		this.eipCode = eipCode;
		this.iaasCode = iaasCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEipCode() {
		return eipCode;
	}

	public String getIaasCode() {
		return iaasCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEipCode(String eipCode) {
		this.eipCode = eipCode;
	}

	public void setIaasCode(String iaasCode) {
		this.iaasCode = iaasCode;
	}

}
