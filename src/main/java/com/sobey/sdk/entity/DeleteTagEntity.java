package com.sobey.sdk.entity;

public class DeleteTagEntity {

	private String accessKey;
	private String tagName;

	public DeleteTagEntity(String accessKey, String tagName) {
		super();
		this.accessKey = accessKey;
		this.tagName = tagName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
