package com.sobey.sdk.entity;

public class BindingFirewallServiceEntity {

	private String accessKey;
	private String routerCode;
	private String firewallServiceCode;

	public BindingFirewallServiceEntity(String accessKey, String routerCode, String firewallServiceCode) {
		super();
		this.accessKey = accessKey;
		this.routerCode = routerCode;
		this.firewallServiceCode = firewallServiceCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getRouterCode() {
		return routerCode;
	}

	public void setRouterCode(String routerCode) {
		this.routerCode = routerCode;
	}

	public String getFirewallServiceCode() {
		return firewallServiceCode;
	}

	public void setFirewallServiceCode(String firewallServiceCode) {
		this.firewallServiceCode = firewallServiceCode;
	}

}
