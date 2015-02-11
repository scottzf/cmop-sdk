package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.ECSMonitorItemEnum;
import com.sobey.sdk.entity.MonitorECSEntity;

/**
 * @author Administrator
 *
 */
public class ZabbixTest {

	private static String access_key = "cnp4RFViRVNTQzl4UWJFRA==";

	@Test
	public void monitorHistoryECS() {
		MonitorECSEntity entity = new MonitorECSEntity(access_key, "ECS-JygamE6a", ECSMonitorItemEnum.CPU);
		System.out.println(SDKClient.monitorHistoryECS(entity));
	}

	@Test
	public void monitorECS() {
		MonitorECSEntity entity = new MonitorECSEntity(access_key, "Tenants-7Io6mxdH-172.16.0.6",
				ECSMonitorItemEnum.CPU);
		System.out.println(SDKClient.monitorECS(entity));
	}

}
