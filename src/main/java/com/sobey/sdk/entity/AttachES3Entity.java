package com.sobey.sdk.entity;

public class AttachES3Entity {

	private String accessKey;
	private String es3Name;
	private String ecsName;

	public AttachES3Entity(String accessKey, String es3Name, String ecsName) {
		super();
		this.accessKey = accessKey;
		this.es3Name = es3Name;
		this.ecsName = ecsName;
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

	public String getEcsName() {
		return ecsName;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

}
