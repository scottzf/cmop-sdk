package com.sobey.sdk.entity;

public class DescribeDNSEntity {

	private String accessKey;
	private String dnsName;

	public DescribeDNSEntity(String accessKey, String dnsName) {
		super();
		this.accessKey = accessKey;
		this.dnsName = dnsName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getDnsName() {
		return dnsName;
	}

	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}

}
