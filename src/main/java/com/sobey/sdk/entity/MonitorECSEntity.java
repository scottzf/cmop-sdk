package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ECSMonitorItemEnum;

public class MonitorECSEntity {

	private String accessKey;
	private String ecsName;
	private ECSMonitorItemEnum ecsMonitorItemEnum;

	public MonitorECSEntity(String accessKey, String ecsName, ECSMonitorItemEnum ecsMonitorItemEnum) {
		super();
		this.accessKey = accessKey;
		this.ecsName = ecsName;
		this.ecsMonitorItemEnum = ecsMonitorItemEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEcsName() {
		return ecsName;
	}

	public void setEcsName(String ecsName) {
		this.ecsName = ecsName;
	}

	public ECSMonitorItemEnum getEcsMonitorItemEnum() {
		return ecsMonitorItemEnum;
	}

	public void setEcsMonitorItemEnum(ECSMonitorItemEnum ecsMonitorItemEnum) {
		this.ecsMonitorItemEnum = ecsMonitorItemEnum;
	}

}
