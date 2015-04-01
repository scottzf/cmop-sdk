package com.sobey.sdk.entity;

public class BindingFirewallEntity {

	private String accessKey;
	private String routerCode;
	private String firewallCode;

	public BindingFirewallEntity(String accessKey, String routerCode, String firewallCode) {
		super();
		this.accessKey = accessKey;
		this.routerCode = routerCode;
		this.firewallCode = firewallCode;
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

	public String getFirewallCode() {
		return firewallCode;
	}

	public void setFirewallCode(String firewallCode) {
		this.firewallCode = firewallCode;
	}

}
