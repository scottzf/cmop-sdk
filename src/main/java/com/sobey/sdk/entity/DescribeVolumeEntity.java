package com.sobey.sdk.entity;

public class DescribeVolumeEntity {

	private String accessKey;
	private String volumeCode;

	public DescribeVolumeEntity(String accessKey, String volumeCode) {
		super();
		this.accessKey = accessKey;
		this.volumeCode = volumeCode;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getVolumeCode() {
		return volumeCode;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setVolumeCode(String volumeCode) {
		this.volumeCode = volumeCode;
	}

}
