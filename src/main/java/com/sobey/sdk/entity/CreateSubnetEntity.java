package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;

public class CreateSubnetEntity {

	private String accessKey;
	private String gateway;
	private IDCEnum idcEnum;
	private String netmask;
	private String segment;
	private String subnetName;

	public CreateSubnetEntity(String accessKey, String gateway, IDCEnum idcEnum, String netmask, String segment,
			String subnetName) {
		super();
		this.accessKey = accessKey;
		this.gateway = gateway;
		this.idcEnum = idcEnum;
		this.netmask = netmask;
		this.segment = segment;
		this.subnetName = subnetName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getGateway() {
		return gateway;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public String getNetmask() {
		return netmask;
	}

	public String getSegment() {
		return segment;
	}

	public String getSubnetName() {
		return subnetName;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
	}

}
