package com.sobey.sdk.constant;

public enum SpecEnum {

	CentOS6_5("CentOS6.5");

	private String value;

	private SpecEnum(String value) {

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
