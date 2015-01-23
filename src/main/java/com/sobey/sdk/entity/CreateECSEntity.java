package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.ECSImageEnum;

public class CreateECSEntity {

	private String accessKey;
	private Integer cpuNumber;
	private ECSImageEnum ecsImageEnum;
	private String ecsName;
	private IDCEnum idcEnum;
	private Integer memoryMB;
	private String remark;
	private String subnetCode;

	public CreateECSEntity(String accessKey, Integer cpuNumber, ECSImageEnum ecsImageEnum, String ecsName,
			IDCEnum idcEnum, Integer memoryMB, String remark, String subnetCode) {
		super();
		this.accessKey = accessKey;
		this.cpuNumber = cpuNumber;
		this.ecsImageEnum = ecsImageEnum;
		this.ecsName = ecsName;
		this.idcEnum = idcEnum;
		this.memoryMB = memoryMB;
		this.remark = remark;
		this.subnetCode = subnetCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public Integer getCpuNumber() {
		return cpuNumber;
	}

	public ECSImageEnum getEcsImageEnum() {
		return ecsImageEnum;
	}

	public String getEcsName() {
		return ecsName;
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

	public String getSubnetCode() {
		return subnetCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setCpuNumber(Integer cpuNumber) {
		this.cpuNumber = cpuNumber;
	}

	public void setEcsImageEnum(ECSImageEnum ecsImageEnum) {
		this.ecsImageEnum = ecsImageEnum;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
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

	public void setSubnetCode(String subnetCode) {
		this.subnetCode = subnetCode;
	}

}
