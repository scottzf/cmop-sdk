package com.sobey.sdk.entity;

public class AssociateEIPEntity {

	private String accessKey;
	private String eipName;
	private String serviceId;

	public AssociateEIPEntity(String accessKey, String eipName, String serviceId) {
		super();
		this.accessKey = accessKey;
		this.eipName = eipName;
		this.serviceId = serviceId;
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

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
