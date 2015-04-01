package com.sobey.sdk.entity;

public class UpdateFirewallEntity {

	private String accessKey;
	private String firewallCode;
	private String firewallName;

	public UpdateFirewallEntity(String accessKey, String firewallCode, String firewallName) {
		super();
		this.accessKey = accessKey;
		this.firewallCode = firewallCode;
		this.firewallName = firewallName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getFirewallCode() {
		return firewallCode;
	}

	public String getFirewallName() {
		return firewallName;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setFirewallCode(String firewallCode) {
		this.firewallCode = firewallCode;
	}

	public void setFirewallName(String firewallName) {
		this.firewallName = firewallName;
	}

}
