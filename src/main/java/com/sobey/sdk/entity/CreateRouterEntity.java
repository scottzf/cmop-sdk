package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.RouterSpecEnum;

public class CreateRouterEntity {

	private String accessKey;
	private IDCEnum idcEnum;
	private String remark;
	private String routerName;
	private RouterSpecEnum routerSpecEnum;
	private String subnetCode;

	public CreateRouterEntity(String accessKey, IDCEnum idcEnum, String remark, String routerName,
			RouterSpecEnum routerSpecEnum, String subnetCode) {
		super();
		this.accessKey = accessKey;
		this.idcEnum = idcEnum;
		this.remark = remark;
		this.routerName = routerName;
		this.routerSpecEnum = routerSpecEnum;
		this.subnetCode = subnetCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
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

	public String getSubnetCode() {
		return subnetCode;
	}

	public void setSubnetCode(String subnetCode) {
		this.subnetCode = subnetCode;
	}

}
