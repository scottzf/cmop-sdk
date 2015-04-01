package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;

public class CreateDNSEntity {

	private String accessKey;
	private String domainName;
	private String eipCodes;
	private IDCEnum idcEnum;
	private String protocols;

	public CreateDNSEntity(String accessKey, String domainName, String eipCodes, IDCEnum idcEnum, String protocols) {
		super();
		this.accessKey = accessKey;
		this.domainName = domainName;
		this.eipCodes = eipCodes;
		this.idcEnum = idcEnum;
		this.protocols = protocols;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getDomainName() {
		return domainName;
	}

	public String getEipCodes() {
		return eipCodes;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public void setEipCodes(String eipCodes) {
		this.eipCodes = eipCodes;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

}
