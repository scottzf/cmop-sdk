package com.sobey.sdk.entity;

public class AssociateTagEntity {

	private String accessKey;
	private String tagName;
	private String serviceName;

	public AssociateTagEntity(String accessKey, String tagName, String serviceName) {
		super();
		this.accessKey = accessKey;
		this.tagName = tagName;
		this.serviceName = serviceName;
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

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
