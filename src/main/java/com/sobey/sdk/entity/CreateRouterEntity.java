package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.RouterImageEnum;

public class CreateRouterEntity {

	private String accessKey;
	private Integer cpuNumber;
	private String firewallCode;
	private IDCEnum idcEnum;
	private RouterImageEnum imageEnum;
	private Integer memoryMB;
	private String routerName;

	public CreateRouterEntity(String accessKey, Integer cpuNumber, String firewallCode, IDCEnum idcEnum,
			RouterImageEnum imageEnum, Integer memoryMB, String routerName) {
		super();
		this.accessKey = accessKey;
		this.cpuNumber = cpuNumber;
		this.firewallCode = firewallCode;
		this.idcEnum = idcEnum;
		this.imageEnum = imageEnum;
		this.memoryMB = memoryMB;
		this.routerName = routerName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public Integer getCpuNumber() {
		return cpuNumber;
	}

	public String getFirewallCode() {
		return firewallCode;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public RouterImageEnum getImageEnum() {
		return imageEnum;
	}

	public Integer getMemoryMB() {
		return memoryMB;
	}

	public String getRouterName() {
		return routerName;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setCpuNumber(Integer cpuNumber) {
		this.cpuNumber = cpuNumber;
	}

	public void setFirewallCode(String firewallCode) {
		this.firewallCode = firewallCode;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setImageEnum(RouterImageEnum imageEnum) {
		this.imageEnum = imageEnum;
	}

	public void setMemoryMB(Integer memoryMB) {
		this.memoryMB = memoryMB;
	}

	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}

}
