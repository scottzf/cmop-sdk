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
	private ISPEnum ispEnum;
	private String protocols;
	private String sourcePorts;
	private String targetPorts;
	private String remark;
	private String bandwidth;

	public CreateEIPEntity(String accessKey, ISPEnum ispEnum, String protocols, String sourcePorts, String targetPorts,
			String remark, String bandwidth) {
		super();
		this.accessKey = accessKey;
		this.ispEnum = ispEnum;
		this.protocols = protocols;
		this.sourcePorts = sourcePorts;
		this.targetPorts = targetPorts;
		this.remark = remark;
		this.bandwidth = bandwidth;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public ISPEnum getIspEnum() {
		return ispEnum;
	}

	public void setIspEnum(ISPEnum ispEnum) {
		this.ispEnum = ispEnum;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

	public String getSourcePorts() {
		return sourcePorts;
	}

	public void setSourcePorts(String sourcePorts) {
		this.sourcePorts = sourcePorts;
	}

	public String getTargetPorts() {
		return targetPorts;
	}

	public void setTargetPorts(String targetPorts) {
		this.targetPorts = targetPorts;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

}
