package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.entity.AssociateESGEntity;
import com.sobey.sdk.entity.CreateESGEntity;
import com.sobey.sdk.entity.DeleteESGEntity;
import com.sobey.sdk.entity.DescribeESGEntity;
import com.sobey.sdk.entity.DissociateESGEntity;

/**
 * @author Administrator
 *
 */
public class ESGTest {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void describeESG() {
		DescribeESGEntity entity = new DescribeESGEntity(access_key, "默认策略");
		System.out.println(SDKClient.describeESG(entity));
	}

	@Test
	public void createESG() {
		CreateESGEntity entity = new CreateESGEntity(access_key, "云生产", "Permit,Deny", "10.10.100.1,10.10.101.1",
				"10.10.100.1,10.10.101.1");
		System.out.println(SDKClient.createESG(entity));
	}

	@Test
	public void deleteDNS() {
		DeleteESGEntity entity = new DeleteESGEntity(access_key, "云生产");
		System.out.println(SDKClient.deleteESG(entity));
	}

	@Test
	public void associateESG() {
		AssociateESGEntity entity = new AssociateESGEntity(access_key, "云生产", "云生产-1");
		System.out.println(SDKClient.associateESG(entity));
	}

	@Test
	public void dissociateESG() {
		DissociateESGEntity entity = new DissociateESGEntity(access_key, "云生产", "云生产-1");
		System.out.println(SDKClient.dissociateESG(entity));
	}

}
