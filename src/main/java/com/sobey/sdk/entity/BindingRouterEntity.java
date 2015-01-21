package com.sobey.sdk.entity;

public class BindingRouterEntity {

	private String accessKey;
	private String routerCode;
	private String subnetCodes;

	public BindingRouterEntity(String accessKey, String routerCode, String subnetCodes) {
		super();
		this.accessKey = accessKey;
		this.routerCode = routerCode;
		this.subnetCodes = subnetCodes;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getRouterCode() {
		return routerCode;
	}

	public void setRouterCode(String routerCode) {
		this.routerCode = routerCode;
	}

	public String getSubnetCodes() {
		return subnetCodes;
	}

	public void setSubnetCodes(String subnetCodes) {
		this.subnetCodes = subnetCodes;
	}

}
