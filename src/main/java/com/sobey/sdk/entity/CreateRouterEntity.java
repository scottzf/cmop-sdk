package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.SpecEnum;

public class CreateRouterEntity {

	private String accessKey;
	private IDCEnum idcEnum;
	private String remark;
	private String routerName;
	private SpecEnum specEnum;
	public CreateRouterEntity(String accessKey, IDCEnum idcEnum, String remark, String routerName, SpecEnum specEnum) {
		super();
		this.accessKey = accessKey;
		this.idcEnum = idcEnum;
		this.remark = remark;
		this.routerName = routerName;
		this.specEnum = specEnum;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public IDCEnum getIdcEnum() {
		return idcEnum;
	}
	public String getRemark() {
		return remark;
	}
	public String getRouterName() {
		return routerName;
	}
	public SpecEnum getSpecEnum() {
		return specEnum;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}
	public void setSpecEnum(SpecEnum specEnum) {
		this.specEnum = specEnum;
	}

	 

}
