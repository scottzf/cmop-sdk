package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ECSMonitorItemEnum;

public class MonitorECSEntity {

	private String accessKey;
	private String ecsCode;
	private ECSMonitorItemEnum ecsMonitorItemEnum;

	public MonitorECSEntity(String accessKey, String ecsCode, ECSMonitorItemEnum ecsMonitorItemEnum) {
		super();
		this.accessKey = accessKey;
		this.ecsCode = ecsCode;
		this.ecsMonitorItemEnum = ecsMonitorItemEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCode() {
		return ecsCode;
	}

	public ECSMonitorItemEnum getEcsMonitorItemEnum() {
		return ecsMonitorItemEnum;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCode(String ecsCode) {
		this.ecsCode = ecsCode;
	}

	public void setEcsMonitorItemEnum(ECSMonitorItemEnum ecsMonitorItemEnum) {
		this.ecsMonitorItemEnum = ecsMonitorItemEnum;
	}

}
