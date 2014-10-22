package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.ISPEnum;
import com.sobey.sdk.entity.AllocateEIPEntity;
import com.sobey.sdk.entity.AssociateEIPEntity;
import com.sobey.sdk.entity.DescribeEIPEntity;
import com.sobey.sdk.entity.DissociateEIPEntity;
import com.sobey.sdk.entity.RecoverEIPEntity;

public class EIPTest {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void describeEIP() {
		DescribeEIPEntity entity = new DescribeEIPEntity(access_key, "119.6.200.202");
		System.out.println(SDKClient.describeEIP(entity));
	}

	@Test
	public void allocateEIP() {
		AllocateEIPEntity entity = new AllocateEIPEntity(access_key, ISPEnum.中国联通, "TCP", "80", "80", "sdk_test", "1");
		System.out.println(SDKClient.allocateEIP(entity));
	}

	@Test
	public void recoverEIP() {
		RecoverEIPEntity entity = new RecoverEIPEntity(access_key, "119.6.200.201");
		System.out.println(SDKClient.recoverEIP(entity));
	}

	@Test
	public void associateEIP() {
		AssociateEIPEntity entity = new AssociateEIPEntity(access_key, "119.6.200.202", "10.10.2.54");
		System.out.println(SDKClient.associateEIP(entity));
	}

	@Test
	public void dissociateEIP() {
		DissociateEIPEntity entity = new DissociateEIPEntity(access_key, "119.6.200.202", "10.10.2.54");
		System.out.println(SDKClient.dissociateEIP(entity));
	}

}
