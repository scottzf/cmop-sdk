package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ES3TypeEnum;
import com.sobey.sdk.constant.IDCEnum;

public class CreateES3Entity {

	private String accessKey;
	private String ecsCode;
	private String es3Name;
	private Integer es3Size;
	private ES3TypeEnum es3TypeEnum;
	private IDCEnum idcEnum;
	private String remark;

	public CreateES3Entity(String accessKey, String ecsCode, String es3Name, Integer es3Size, ES3TypeEnum es3TypeEnum,
			IDCEnum idcEnum, String remark) {
		super();
		this.accessKey = accessKey;
		this.ecsCode = ecsCode;
		this.es3Name = es3Name;
		this.es3Size = es3Size;
		this.es3TypeEnum = es3TypeEnum;
		this.idcEnum = idcEnum;
		this.remark = remark;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getEcsCode() {
		return ecsCode;
	}

	public String getEs3Name() {
		return es3Name;
	}

	public Integer getEs3Size() {
		return es3Size;
	}

	public ES3TypeEnum getEs3TypeEnum() {
		return es3TypeEnum;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public String getRemark() {
		return remark;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setEcsCode(String ecsCode) {
		this.ecsCode = ecsCode;
	}

	public void setEs3Name(String es3Name) {
		this.es3Name = es3Name;
	}

	public void setEs3Size(Integer es3Size) {
		this.es3Size = es3Size;
	}

	public void setEs3TypeEnum(ES3TypeEnum es3TypeEnum) {
		this.es3TypeEnum = es3TypeEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
