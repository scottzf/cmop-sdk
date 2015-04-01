package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ELBImageEnum;
import com.sobey.sdk.constant.IDCEnum;

public class CreateELBEntity {

	private String accessKey;
	private Integer cpuNumber;
	private String elbName;
	private IDCEnum idcEnum;
	private ELBImageEnum imageEnum;
	private Integer memoryMB;
	private String subnetCode;

	public CreateELBEntity(String accessKey, Integer cpuNumber, String elbName, IDCEnum idcEnum,
			ELBImageEnum imageEnum, Integer memoryMB, String subnetCode) {
		super();
		this.accessKey = accessKey;
		this.cpuNumber = cpuNumber;
		this.elbName = elbName;
		this.idcEnum = idcEnum;
		this.imageEnum = imageEnum;
		this.memoryMB = memoryMB;
		this.subnetCode = subnetCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public Integer getCpuNumber() {
		return cpuNumber;
	}

	public void setCpuNumber(Integer cpuNumber) {
		this.cpuNumber = cpuNumber;
	}

	public String getElbName() {
		return elbName;
	}

	public void setElbName(String elbName) {
		this.elbName = elbName;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public ELBImageEnum getImageEnum() {
		return imageEnum;
	}

	public void setImageEnum(ELBImageEnum imageEnum) {
		this.imageEnum = imageEnum;
	}

	public Integer getMemoryMB() {
		return memoryMB;
	}

	public void setMemoryMB(Integer memoryMB) {
		this.memoryMB = memoryMB;
	}

	public String getSubnetCode() {
		return subnetCode;
	}

	public void setSubnetCode(String subnetCode) {
		this.subnetCode = subnetCode;
	}

}
