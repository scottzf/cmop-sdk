package com.sobey.sdk.entity;

public class UpdateRouterEntity {

	private String accessKey;
	private String routerCode;
	private String routerName;

	public UpdateRouterEntity(String accessKey, String routerCode, String routerName) {
		super();
		this.accessKey = accessKey;
		this.routerCode = routerCode;
		this.routerName = routerName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getRouterCode() {
		return routerCode;
	}

	public String getRouterName() {
		return routerName;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setRouterCode(String routerCode) {
		this.routerCode = routerCode;
	}

	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}

}
