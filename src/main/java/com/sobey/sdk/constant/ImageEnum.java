package com.sobey.sdk.constant;

public enum ImageEnum {

	CentOS6_3("Centos 6.3 MOD 25G"),

	Windows_2008_R2("Windows 2008 R2 Mod"),

	Windows_7("Windows 7  64  40G MOD");

	private String value;

	private ImageEnum(String value) {

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