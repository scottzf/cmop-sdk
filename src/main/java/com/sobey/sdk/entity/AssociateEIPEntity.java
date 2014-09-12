package com.sobey.sdk.entity;

public class AssociateEIPEntity {

	private String accessKey;
	private String eipName;
	private String serviceName;

	public AssociateEIPEntity(String accessKey, String eipName, String serviceName) {
		super();
		this.accessKey = accessKey;
		this.eipName = eipName;
		this.serviceName = serviceName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEipName() {
		return eipName;
	}

	public void setEipName(String eipName) {
		this.eipName = eipName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
