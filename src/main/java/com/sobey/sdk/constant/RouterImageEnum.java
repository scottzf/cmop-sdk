package com.sobey.sdk.constant;

public enum RouterImageEnum {

	Standard_Router("vRouter_Telnet");

	private String value;

	private RouterImageEnum(String value) {

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
