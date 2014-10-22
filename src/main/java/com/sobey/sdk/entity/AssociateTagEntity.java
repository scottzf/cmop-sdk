package com.sobey.sdk.entity;

public class AssociateTagEntity {

	private String accessKey;
	private String tagName;
	private String serviceId;

	public AssociateTagEntity(String accessKey, String tagName, String serviceId) {
		super();
		this.accessKey = accessKey;
		this.tagName = tagName;
		this.serviceId = serviceId;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
