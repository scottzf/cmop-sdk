package com.sobey.sdk.entity;

public class DeleteFirewallEntity {

	private String accessKey;
	private String firewallCode;

	public DeleteFirewallEntity(String accessKey, String firewallCode) {
		super();
		this.accessKey = accessKey;
		this.firewallCode = firewallCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getFirewallCode() {
		return firewallCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setFirewallCode(String firewallCode) {
		this.firewallCode = firewallCode;
	}

}
