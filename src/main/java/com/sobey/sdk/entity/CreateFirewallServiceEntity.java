package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;

public class CreateFirewallServiceEntity {

	private String accessKey;
	private String actions;
	private String directions;
	private String endPorts;
	private String firewallServiceName;
	private IDCEnum idcEnum;
	private String ipaddresses;
	private String protocols;
	private String rulesNames;
	private String startPorts;

	public CreateFirewallServiceEntity(String accessKey, String actions, String directions, String endPorts,
			String firewallServiceName, IDCEnum idcEnum, String ipaddresses, String protocols, String rulesNames,
			String startPorts) {
		super();
		this.accessKey = accessKey;
		this.actions = actions;
		this.directions = directions;
		this.endPorts = endPorts;
		this.firewallServiceName = firewallServiceName;
		this.idcEnum = idcEnum;
		this.ipaddresses = ipaddresses;
		this.protocols = protocols;
		this.rulesNames = rulesNames;
		this.startPorts = startPorts;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getEndPorts() {
		return endPorts;
	}

	public void setEndPorts(String endPorts) {
		this.endPorts = endPorts;
	}

	public String getFirewallServiceName() {
		return firewallServiceName;
	}

	public void setFirewallServiceName(String firewallServiceName) {
		this.firewallServiceName = firewallServiceName;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public String getIpaddresses() {
		return ipaddresses;
	}

	public void setIpaddresses(String ipaddresses) {
		this.ipaddresses = ipaddresses;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

	public String getRulesNames() {
		return rulesNames;
	}

	public void setRulesNames(String rulesNames) {
		this.rulesNames = rulesNames;
	}

	public String getStartPorts() {
		return startPorts;
	}

	public void setStartPorts(String startPorts) {
		this.startPorts = startPorts;
	}

}
