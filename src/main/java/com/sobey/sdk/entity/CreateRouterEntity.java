package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.RouterSpecEnum;

public class CreateRouterEntity {

	private String accessKey;
	private String firewallServiceCode;
	private IDCEnum idcEnum;
	private String remark;
	private String routerName;
	private RouterSpecEnum routerSpecEnum;

	public CreateRouterEntity(String accessKey, String firewallServiceCode, IDCEnum idcEnum, String remark,
			String routerName, RouterSpecEnum routerSpecEnum) {
		super();
		this.accessKey = accessKey;
		this.firewallServiceCode = firewallServiceCode;
		this.idcEnum = idcEnum;
		this.remark = remark;
		this.routerName = routerName;
		this.routerSpecEnum = routerSpecEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getFirewallServiceCode() {
		return firewallServiceCode;
	}

	public void setFirewallServiceCode(String firewallServiceCode) {
		this.firewallServiceCode = firewallServiceCode;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRouterName() {
		return routerName;
	}

	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}

	public RouterSpecEnum getRouterSpecEnum() {
		return routerSpecEnum;
	}

	public void setRouterSpecEnum(RouterSpecEnum routerSpecEnum) {
		this.routerSpecEnum = routerSpecEnum;
	}

}
