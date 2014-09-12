package com.sobey.sdk.entity;

public class CreateTagEntity {

	private String accessKey;
	private String tagName;
	private String parentTag;

	public CreateTagEntity(String accessKey, String tagName, String parentTag) {
		super();
		this.accessKey = accessKey;
		this.tagName = tagName;
		this.parentTag = parentTag;
	}

	public CreateTagEntity(String accessKey, String tagName) {
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

	public String getParentTag() {
		return parentTag;
	}

	public void setParentTag(String parentTag) {
		this.parentTag = parentTag;
	}

}
