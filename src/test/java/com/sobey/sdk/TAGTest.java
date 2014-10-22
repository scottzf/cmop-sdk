package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.entity.AssociateTagEntity;
import com.sobey.sdk.entity.CreateTagEntity;
import com.sobey.sdk.entity.DeleteTagEntity;
import com.sobey.sdk.entity.DescribeTagEntity;
import com.sobey.sdk.entity.DissociateTagEntity;

/**
 * @author Administrator
 *
 */
public class TAGTest {

//	private static String access_key = "YWNjZXNza2V5MjIyMw=1";
	private static String access_key = "YWNjZXNza2V5NzU2NA==";

	@Test
	public void describeTag() {
		DescribeTagEntity entity = new DescribeTagEntity(access_key, "云生产");
		System.out.println(SDKClient.describeTag(entity));
	}

	@Test
	public void createTag() {
		CreateTagEntity entity = new CreateTagEntity(access_key, "云生产1");
		System.out.println(SDKClient.createTag(entity));
	}

	@Test
	public void deleteTag() {
		DeleteTagEntity entity = new DeleteTagEntity(access_key, "云生产");
		System.out.println(SDKClient.deleteTag(entity));
	}

	@Test
	public void associateTag() {
		String serviceId = "100";
		AssociateTagEntity entity = new AssociateTagEntity(access_key, "云生产", serviceId);
		System.out.println(SDKClient.associateTag(entity));
	}

	@Test
	public void dissociateTag() {
		String serviceId = "100";
		DissociateTagEntity entity = new DissociateTagEntity(access_key, "云生产", serviceId);
		System.out.println(SDKClient.dissociateTag(entity));
	}

}
