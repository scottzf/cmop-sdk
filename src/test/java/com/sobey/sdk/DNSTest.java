package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.entity.CreateDNSEntity;
import com.sobey.sdk.entity.DeleteDNSEntity;
import com.sobey.sdk.entity.DescribeDNSEntity;

/**
 * @author Administrator
 *
 */
public class DNSTest {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void describeEIP() {
		DescribeDNSEntity entity = new DescribeDNSEntity(access_key, "cmoptest.sobeycache.com");
		System.out.println(SDKClient.describeDNS(entity));
	}

	@Test
	public void createDNS() {
		CreateDNSEntity entity = new CreateDNSEntity(access_key, "cmoptest.sobeycache.com", "119.6.200.202", "HTTP",
				"sdk test");
		System.out.println(SDKClient.createDNS(entity));
	}

	@Test
	public void deleteDNS() {
		DeleteDNSEntity entity = new DeleteDNSEntity(access_key, "cmoptest.sobeycache.com");
		System.out.println(SDKClient.deleteDNS(entity));
	}

}
