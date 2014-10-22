package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.SpecEnum;

public class CreateECSEntity {

	private String accessKey;
	private String ecsName;
	private String remark;
	private SpecEnum specEnum;
	private IDCEnum idcEnum;

	public CreateECSEntity(String accessKey, String ecsName, String remark, SpecEnum specEnum, IDCEnum idcEnum) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.remark = remark;
		this.specEnum = specEnum;
		this.idcEnum = idcEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEcsName() {
		return ecsName;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public SpecEnum getSpecEnum() {
		return specEnum;
	}

	public void setSpecEnum(SpecEnum specEnum) {
		this.specEnum = specEnum;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

}
