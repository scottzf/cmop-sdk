package com.sobey.sdk.entity;

public class DeleteES3Entity {

	private String accessKey;
	private String es3Name;

	public DeleteES3Entity(String accessKey, String es3Name) {
		super();
		this.accessKey = accessKey;
		this.es3Name = es3Name;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEs3Name() {
		return es3Name;
	}

	public void setEs3Name(String es3Name) {
		this.es3Name = es3Name;
	}

}
