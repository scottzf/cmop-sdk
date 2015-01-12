package com.sobey.sdk.constant;

public enum SpecEnum {

	CentOS6_3("Centos 6.3 MOD 25G");

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
