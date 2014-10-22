package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.entity.CreateELBEntity;
import com.sobey.sdk.entity.DeleteELBEntity;
import com.sobey.sdk.entity.DescribeELBEntity;

public class ELBTest {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void describeECS() {
		DescribeELBEntity entity = new DescribeELBEntity(access_key, "10.10.2.52");
		System.out.println(SDKClient.describeELB(entity));
	}

	@Test
	public void createELB() {
		CreateELBEntity entity = new CreateELBEntity(access_key, "云生产-1,云生产-2", "HTTP,HTTP");
		System.out.println(SDKClient.createELB(entity));
	}

	@Test
	public void deleteELB() {
		DeleteELBEntity entity = new DeleteELBEntity(access_key, "10.10.2.52");
		System.out.println(SDKClient.deleteELB(entity));
	}

}
