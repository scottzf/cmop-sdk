package com.sobey.sdk.constant;

public enum ECSImageEnum {

	CentOS6_3("Centos 6.3 MOD 25G"), Windows_2008_R2("Windows 2008 R2 Mod");

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
