package com.sobey.sdk.entity;

/**
 * ecsNames,protocols用","来区分多个
 * 
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class CreateELBEntity {

	private String accessKey;
	private String ecsCodes;
	private String protocols;

	/**
	 * ecsCodes,protocols用","来区分多个
	 * 
	 * @param accessKey
	 * @param ecsCodes
	 * @param protocols
	 */

	public CreateELBEntity(String accessKey, String ecsCodes, String protocols) {
		super();
		this.accessKey = accessKey;
		this.ecsCodes = ecsCodes;
		this.protocols = protocols;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCodes() {
		return ecsCodes;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCodes(String ecsCodes) {
		this.ecsCodes = ecsCodes;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

}
