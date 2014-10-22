package com.sobey.sdk.entity;

import com.sobey.sdk.constant.ES3TypeEnum;
import com.sobey.sdk.constant.IDCEnum;

public class CreateES3Entity {

	private String accessKey;
	private String es3Name;
	private Integer es3Size;
	private String remark;
	private ES3TypeEnum es3TypeEnum;
	private IDCEnum idcEnum;

	public CreateES3Entity(String accessKey, String es3Name, Integer es3Size, String remark, ES3TypeEnum es3TypeEnum,
			IDCEnum idcEnum) {
		super();
		this.accessKey = accessKey;
		this.es3Name = es3Name;
		this.es3Size = es3Size;
		this.remark = remark;
		this.es3TypeEnum = es3TypeEnum;
		this.idcEnum = idcEnum;
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

	public Integer getEs3Size() {
		return es3Size;
	}

	public void setEs3Size(Integer es3Size) {
		this.es3Size = es3Size;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public ES3TypeEnum getEs3TypeEnum() {
		return es3TypeEnum;
	}

	public void setEs3TypeEnum(ES3TypeEnum es3TypeEnum) {
		this.es3TypeEnum = es3TypeEnum;
	}

	public IDCEnum getIdcEnum() {
		return idcEnum;
	}

	public void setIdcEnum(IDCEnum idcEnum) {
		this.idcEnum = idcEnum;
	}

}
