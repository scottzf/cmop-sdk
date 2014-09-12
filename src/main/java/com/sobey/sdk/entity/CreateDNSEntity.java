package com.sobey.sdk.entity;

public class CreateDNSEntity {

	private String accessKey;
	private String domain;
	private String eipNames;
	private String protocols;

	public CreateDNSEntity(String accessKey, String domain, String eipNames, String protocols) {
		super();
		this.accessKey = accessKey;
		this.domain = domain;
		this.eipNames = eipNames;
		this.protocols = protocols;
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

	public String getEipNames() {
		return eipNames;
	}

	public void setEipNames(String eipNames) {
		this.eipNames = eipNames;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

}
