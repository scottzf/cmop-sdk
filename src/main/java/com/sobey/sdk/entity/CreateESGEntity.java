package com.sobey.sdk.entity;

public class CreateESGEntity {

	private String accessKey;
	private String esgName;
	private String policyTypes;
	private String targetIPs;
	private String remark;

	public CreateESGEntity(String accessKey, String esgName, String policyTypes, String targetIPs, String remark) {
		super();
		this.accessKey = accessKey;
		this.esgName = esgName;
		this.policyTypes = policyTypes;
		this.targetIPs = targetIPs;
		this.remark = remark;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEsgName() {
		return esgName;
	}

	public void setEsgName(String esgName) {
		this.esgName = esgName;
	}

	public String getPolicyTypes() {
		return policyTypes;
	}

	public void setPolicyTypes(String policyTypes) {
		this.policyTypes = policyTypes;
	}

	public String getTargetIPs() {
		return targetIPs;
	}

	public void setTargetIPs(String targetIPs) {
		this.targetIPs = targetIPs;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
