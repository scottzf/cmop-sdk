package com.sobey.sdk.entity;

public class CreateES3Entity {

	private String accessKey;
	private String es3Name;
	private Double es3Size;
	private String remark;
	private String es3Type;
	private String idc;

	public CreateES3Entity(String accessKey, String es3Name, Double es3Size, String remark, String es3Type, String idc) {
		super();
		this.accessKey = accessKey;
		this.es3Name = es3Name;
		this.es3Size = es3Size;
		this.remark = remark;
		this.es3Type = es3Type;
		this.idc = idc;
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

	public Double getEs3Size() {
		return es3Size;
	}

	public void setEs3Size(Double es3Size) {
		this.es3Size = es3Size;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEs3Type() {
		return es3Type;
	}

	public void setEs3Type(String es3Type) {
		this.es3Type = es3Type;
	}

	public String getIdc() {
		return idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

}
