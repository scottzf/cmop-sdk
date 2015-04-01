package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.VolumeTypeEnum;

public class CreateVolumeEntity {

	private String accessKey;
	private IDCEnum idcEnum;
	private Double size;
	private String volumeName;
	private VolumeTypeEnum volumeTypeEnum;

	public CreateVolumeEntity(String accessKey, IDCEnum idcEnum, Double size, String volumeName,
			VolumeTypeEnum volumeTypeEnum) {
		super();
		this.accessKey = accessKey;
		this.idcEnum = idcEnum;
		this.size = size;
		this.volumeName = volumeName;
		this.volumeTypeEnum = volumeTypeEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public Double getSize() {
		return size;
	}

	public String getVolumeName() {
		return volumeName;
	}

	public VolumeTypeEnum getVolumeTypeEnum() {
		return volumeTypeEnum;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public void setVolumeTypeEnum(VolumeTypeEnum volumeTypeEnum) {
		this.volumeTypeEnum = volumeTypeEnum;
	}

}
