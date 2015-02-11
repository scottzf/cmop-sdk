package com.sobey.sdk.constant;

public enum ECSImageEnum {

	CentOS6_3("Centos 6.3 MOD 25G"),

	Windows_2008_R2("Windows 2008 R2 Mod"),

	Windows_7("Windows 7  64  40G MOD"),

	MediaInstance("Windows 7 GPU"),

	MediaInstance_Application("Windows 7 GPU Application");

	private String value;

	private ECSImageEnum(String value) {

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
