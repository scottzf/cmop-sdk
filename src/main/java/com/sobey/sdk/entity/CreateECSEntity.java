package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.SpecEnum;

public class CreateECSEntity {

	private String accessKey;
	private String ecsName;
	private IDCEnum idcEnum;
	private String remark;
	private SpecEnum specEnum;
	private String subnetCode;

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsName() {
		return ecsName;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public String getRemark() {
		return remark;
	}

	public SpecEnum getSpecEnum() {
		return specEnum;
	}

	public String getSubnetCode() {
		return subnetCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setSpecEnum(SpecEnum specEnum) {
		this.specEnum = specEnum;
	}

	public void setSubnetCode(String subnetCode) {
		this.subnetCode = subnetCode;
	}

}
