package com.sobey.sdk.constant;

public enum GPUImageEnum {

	MediaInstance("Windows 7 GPU"),

	MediaInstance_Application("Windows 7 GPU Application");

	private String value;

	private GPUImageEnum(String value) {

		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value;
	}

}
