package com.sobey.sdk.entity;

public class DeleteDNSEntity {

	private String accessKey;
	private String domain;

	public DeleteDNSEntity(String accessKey, String domain) {
		super();
		this.accessKey = accessKey;
		this.domain = domain;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
