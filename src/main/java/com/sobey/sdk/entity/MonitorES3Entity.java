package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ES3MonitorItemEnum;

public class MonitorES3Entity {

	private String accessKey;
	private String es3Name;
	private ES3MonitorItemEnum es3MonitorItemEnum;

	public MonitorES3Entity(String accessKey, String es3Name, ES3MonitorItemEnum es3MonitorItemEnum) {
		super();
		this.accessKey = accessKey;
		this.es3Name = es3Name;
		this.es3MonitorItemEnum = es3MonitorItemEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEs3Name() {
		return es3Name;
	}

	public void setEs3Name(String es3Name) {
		this.es3Name = es3Name;
	}

	public ES3MonitorItemEnum getEs3MonitorItemEnum() {
		return es3MonitorItemEnum;
	}

	public void setEs3MonitorItemEnum(ES3MonitorItemEnum es3MonitorItemEnum) {
		this.es3MonitorItemEnum = es3MonitorItemEnum;
	}

}
