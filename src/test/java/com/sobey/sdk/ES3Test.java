package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.entity.AttachES3Entity;
import com.sobey.sdk.entity.DeleteES3Entity;
import com.sobey.sdk.entity.DescribeES3Entity;
import com.sobey.sdk.entity.DetachES3Entity;

public class ES3Test {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void describeES3() {
		DescribeES3Entity entity = new DescribeES3Entity(access_key, "sobey");
		System.out.println(SDKClient.describeES3(entity));
	}

	@Test
	public void deleteES3() {
		DeleteES3Entity entity = new DeleteES3Entity(access_key, "sobey");
		System.out.println(SDKClient.deleteES3(entity));
	}

	@Test
	public void createES3() {
		// CreateES3Entity entity = new CreateES3Entity(accessKey, ecsId, es3Name, es3Size, es3TypeEnum, idcEnum,
		// remark);
		// System.out.println(SDKClient.createES3(entity));
	}

	@Test
	public void attachES3() {
		AttachES3Entity entity = new AttachES3Entity(access_key, "sobey", "云生产-1");
		System.out.println(SDKClient.attachES3(entity));
	}

	@Test
	public void detachES3() {
		DetachES3Entity entity = new DetachES3Entity(access_key, "sobey", "云生产-1");
		System.out.println(SDKClient.detachES3(entity));
	}

}
