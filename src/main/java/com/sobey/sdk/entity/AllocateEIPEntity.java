package com.sobey.sdk.entity;

public class AllocateEIPEntity {

	private String accessKey;
	private String isp;
	private String protocols;
	private String sourcePorts;
	private String targetPorts;

	public AllocateEIPEntity(String accessKey, String isp, String protocols, String sourcePorts, String targetPorts) {
		super();
		this.accessKey = accessKey;
		this.isp = isp;
		this.protocols = protocols;
		this.sourcePorts = sourcePorts;
		this.targetPorts = targetPorts;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
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

}
