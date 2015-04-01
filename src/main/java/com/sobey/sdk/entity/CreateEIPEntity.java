package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ISPEnum;

/**
 * protocols sourcePorts targetPorts用","区分
 * 
 * @author Administrator
 *
 */
public class CreateEIPEntity {

	private String accessKey;
	private String bandwidth;
	private ISPEnum ispEnum;
	private String protocols;
	private String sourcePorts;
	private String targetPorts;

	public CreateEIPEntity(String accessKey, String bandwidth, ISPEnum ispEnum, String protocols, String sourcePorts,
			String targetPorts) {
		super();
		this.accessKey = accessKey;
		this.bandwidth = bandwidth;
		this.ispEnum = ispEnum;
		this.protocols = protocols;
		this.sourcePorts = sourcePorts;
		this.targetPorts = targetPorts;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getBandwidth() {
		return bandwidth;
	}

	public ISPEnum getIspEnum() {
		return ispEnum;
	}

	public String getProtocols() {
		return protocols;
	}

	public String getSourcePorts() {
		return sourcePorts;
	}

	public String getTargetPorts() {
		return targetPorts;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public void setIspEnum(ISPEnum ispEnum) {
		this.ispEnum = ispEnum;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

	public void setSourcePorts(String sourcePorts) {
		this.sourcePorts = sourcePorts;
	}

	public void setTargetPorts(String targetPorts) {
		this.targetPorts = targetPorts;
	}

}
