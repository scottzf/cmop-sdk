package com.sobey.sdk.entity;

public class DeleteDNSEntity {

	private String accessKey;
	private String dnsCode;

	public DeleteDNSEntity(String accessKey, String dnsCode) {
		super();
		this.accessKey = accessKey;
		this.dnsCode = dnsCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getDnsCode() {
		return dnsCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setDnsCode(String dnsCode) {
		this.dnsCode = dnsCode;
	}

}
