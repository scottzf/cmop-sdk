package com.sobey.sdk.entity;

import com.sobey.sdk.constant.IDCEnum;

public class CreateDNSEntity {

	private String accessKey;
	private String domainName;
	private String eipCodes;
	private String protocols;
	private String remark;
	private IDCEnum idcEnum;

	public CreateDNSEntity(String accessKey, String domainName, String eipCodes, String protocols, String remark,
			IDCEnum idcEnum) {
		super();
		this.accessKey = accessKey;
		this.domainName = domainName;
		this.eipCodes = eipCodes;
		this.protocols = protocols;
		this.remark = remark;
		this.idcEnum = idcEnum;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getEipCodes() {
		return eipCodes;
	}

	public void setEipCodes(String eipCodes) {
		this.eipCodes = eipCodes;
	}

	public String getProtocols() {
		return protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

}
