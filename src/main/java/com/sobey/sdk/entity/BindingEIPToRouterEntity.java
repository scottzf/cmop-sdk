package com.sobey.sdk.entity;

public class BindingEIPToRouterEntity {

	private String accessKey;
	private String eipCode;
	private String routerCode;

	public BindingEIPToRouterEntity(String accessKey, String eipCode, String routerCode) {
		super();
		this.accessKey = accessKey;
		this.eipCode = eipCode;
		this.routerCode = routerCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEipCode() {
		return eipCode;
	}

	public String getRouterCode() {
		return routerCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEipCode(String eipCode) {
		this.eipCode = eipCode;
	}

	public void setRouterCode(String routerCode) {
		this.routerCode = routerCode;
	}

}
