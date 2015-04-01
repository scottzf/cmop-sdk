package com.sobey.sdk.constant;

public enum ELBImageEnum {

	Standard_Router("vRouter_Telnet");

	private String value;

	private ELBImageEnum(String value) {

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
