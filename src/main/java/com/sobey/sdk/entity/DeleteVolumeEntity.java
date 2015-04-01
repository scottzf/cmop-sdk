package com.sobey.sdk.entity;

public class DeleteVolumeEntity {

	private String accessKey;
	private String volumeCode;

	public DeleteVolumeEntity(String accessKey, String volumeCode) {
		super();
		this.accessKey = accessKey;
		this.volumeCode = volumeCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getVolumeCode() {
		return volumeCode;
	}

	public void setVolumeCode(String volumeCode) {
		this.volumeCode = volumeCode;
	}

}
