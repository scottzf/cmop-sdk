package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.RouterImageEnum;

public class CreateRouterEntity {

	private String accessKey;
	private Integer cpuNumber;
	private String firewallServiceCode;
	private IDCEnum idcEnum;
	private Integer memoryMB;
	private String remark;
	private RouterImageEnum routerImageEnum;
	private String routerName;

	public CreateRouterEntity(String accessKey, Integer cpuNumber, String firewallServiceCode, IDCEnum idcEnum,
			Integer memoryMB, String remark, RouterImageEnum routerImageEnum, String routerName) {
		super();
		this.accessKey = accessKey;
		this.cpuNumber = cpuNumber;
		this.firewallServiceCode = firewallServiceCode;
		this.idcEnum = idcEnum;
		this.memoryMB = memoryMB;
		this.remark = remark;
		this.routerImageEnum = routerImageEnum;
		this.routerName = routerName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public Integer getCpuNumber() {
		return cpuNumber;
	}

	public String getFirewallServiceCode() {
		return firewallServiceCode;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public Integer getMemoryMB() {
		return memoryMB;
	}

	public String getRemark() {
		return remark;
	}

	public RouterImageEnum getRouterImageEnum() {
		return routerImageEnum;
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

	public void setFirewallServiceCode(String firewallServiceCode) {
		this.firewallServiceCode = firewallServiceCode;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setMemoryMB(Integer memoryMB) {
		this.memoryMB = memoryMB;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setRouterImageEnum(RouterImageEnum routerImageEnum) {
		this.routerImageEnum = routerImageEnum;
	}

	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}

}
