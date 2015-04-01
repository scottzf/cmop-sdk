package com.sobey.sdk.entity;

public class DeleteRouterEntity {

	private String accessKey;
	private String routerCode;

	public DeleteRouterEntity(String accessKey, String routerCode) {
		super();
		this.accessKey = accessKey;
		this.routerCode = routerCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getRouterCode() {
		return routerCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setRouterCode(String routerCode) {
		this.routerCode = routerCode;
	}

}
