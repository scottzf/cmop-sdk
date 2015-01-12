package com.sobey.sdk.constant;

public enum RouterSpecEnum {

	Default_Router("vRouter_MOD");

	private String value;

	private RouterSpecEnum(String value) {

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
