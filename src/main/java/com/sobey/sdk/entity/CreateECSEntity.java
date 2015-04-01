package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.ImageEnum;

public class CreateECSEntity {

	private String accessKey;
	private Integer cpuNumber;
	private String ecsName;
	private IDCEnum idcEnum;
	private ImageEnum imageEnum;
	private Integer memoryMB;
	private String subnetCode;

	public CreateECSEntity(String accessKey, Integer cpuNumber, String ecsName, IDCEnum idcEnum, ImageEnum imageEnum,
			Integer memoryMB, String subnetCode) {
		super();
		this.accessKey = accessKey;
		this.cpuNumber = cpuNumber;
		this.ecsName = ecsName;
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

	public String getEcsName() {
		return ecsName;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public ImageEnum getImageEnum() {
		return imageEnum;
	}

	public void setImageEnum(ImageEnum imageEnum) {
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
