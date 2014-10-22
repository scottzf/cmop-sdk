package com.sobey.sdk.entity;

/**
 * ecsNames,protocols用","来区分多个
 * 
 * @author Administrator
 *
 */
public class CreateELBEntity {

	private String accessKey;
	private String ecsNames;
	private String protocols;

	/**
	 * ecsNames,protocols用","来区分多个
	 * 
	 * @param accessKey
	 * @param ecsNames
	 * @param protocols
	 */
	public CreateELBEntity(String accessKey, String ecsNames, String protocols) {
		super();
		this.accessKey = accessKey;
		this.ecsNames = ecsNames;
		this.protocols = protocols;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getEcsNames() {
		return ecsNames;
	}

	public void setEcsNames(String ecsNames) {
		this.ecsNames = ecsNames;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

}
