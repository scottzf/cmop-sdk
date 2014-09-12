package com.sobey.sdk.entity;

public class CreateECSEntity {

	private String accessKey;
	private String ecsName;
	private String remark;
	private String ecsSpec;
	private String idc;

	public CreateECSEntity(String accessKey, String ecsName, String remark, String ecsSpec, String idc) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.remark = remark;
		this.ecsSpec = ecsSpec;
		this.idc = idc;
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

	public String getEcsSpec() {
		return ecsSpec;
	}

	public void setEcsSpec(String ecsSpec) {
		this.ecsSpec = ecsSpec;
	}

	public String getIdc() {
		return idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

}
