package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.PowerEnum;
import com.sobey.sdk.constant.SpecEnum;
import com.sobey.sdk.entity.CreateTenantsEntity;
import com.sobey.sdk.entity.DestroyECSEntity;
import com.sobey.sdk.entity.PowerOpsECSEntity;
import com.sobey.sdk.entity.ReconfigECSEntity;

public class ECSTest {

	private static String access_key = "YWNjZXNza2V5MjIyMw=1";

	@Test
	public void createTenants() {
		CreateTenantsEntity entity = new CreateTenantsEntity("Sobey", "1234@sobeyl.com", "xman", "tel");
		System.out.println(SDKClient.createTenants(entity));
	}

	@Test
	public void createECS() {
		// CreateECSEntity entity = new CreateECSEntity();
		// System.out.println(SDKClient.createECS(entity));
	}

	@Test
	public void powerOpsECS() {
		PowerOpsECSEntity entity = new PowerOpsECSEntity(access_key, "云生产-3", PowerEnum.poweroff);
		System.out.println(SDKClient.powerOpsECS(entity));
	}

	@Test
	public void reconfigECS() {
		ReconfigECSEntity entity = new ReconfigECSEntity(access_key, "云生产-3", SpecEnum.CentOS6_3);
		System.out.println(SDKClient.reconfigECS(entity));
	}

	@Test
	public void destroyECS() {
		DestroyECSEntity entity = new DestroyECSEntity(access_key, "云生产-3");
		System.out.println(SDKClient.destroyECS(entity));
	}

}
