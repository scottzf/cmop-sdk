package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.ISPEnum;
import com.sobey.sdk.entity.BindingEIPEntity;
import com.sobey.sdk.entity.CreateEIPEntity;
import com.sobey.sdk.entity.DeleteEIPEntity;
import com.sobey.sdk.entity.DescribeEIPEntity;
import com.sobey.sdk.entity.UnbindingEIPEntity;

public class EIPTest {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void describeEIP() {
		DescribeEIPEntity entity = new DescribeEIPEntity(access_key, "119.6.200.202");
		System.out.println(SDKClient.describeEIP(entity));
	}

	@Test
	public void createEIP() {
		CreateEIPEntity entity = new CreateEIPEntity(access_key, ISPEnum.中国联通, "TCP", "80", "80", "sdk_test", "1");
		System.out.println(SDKClient.createEIP(entity));
	}

	@Test
	public void deleteEIP() {
		DeleteEIPEntity entity = new DeleteEIPEntity(access_key, "119.6.200.201");
		System.out.println(SDKClient.deleteEIP(entity));
	}

	@Test
	public void bindingEIP() {
		BindingEIPEntity entity = new BindingEIPEntity(access_key, "119.6.200.202", "10.10.2.54");
		System.out.println(SDKClient.bindingEIP(entity));
	}

	@Test
	public void unbindingEIP() {
		UnbindingEIPEntity entity = new UnbindingEIPEntity(access_key, "119.6.200.202", "10.10.2.54");
		System.out.println(SDKClient.unbindingEIP(entity));
	}

}
