package com.sobey.sdk.constant;

public enum ECSMonitorItemEnum {

	系统盘可用空间("vfs.fs.size[/,free]"), CPU占用率("vfs.fs.size[/,free]"), 系统占用率("vfs.fs.size[/,free]"), 网络流量Out(
			"vfs.fs.size[/,free]"), 网络流量In("vfs.fs.size[/,free]");

	private String value;

	private ECSMonitorItemEnum(String value) {

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
