package com.sobey.sdk.entity;

public class BindingVolumeEntity {

	private String accessKey;
	private String ecsCode;
	private String volumeCode;

	public BindingVolumeEntity(String accessKey, String ecsCode, String volumeCode) {
		super();
		this.accessKey = accessKey;
		this.ecsCode = ecsCode;
		this.volumeCode = volumeCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCode() {
		return ecsCode;
	}

	public String getVolumeCode() {
		return volumeCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCode(String ecsCode) {
		this.ecsCode = ecsCode;
	}

	public void setVolumeCode(String volumeCode) {
		this.volumeCode = volumeCode;
	}

}
