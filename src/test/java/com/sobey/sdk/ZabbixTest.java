package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.ECSMonitorItemEnum;
import com.sobey.sdk.entity.MonitorECSEntity;

/**
 * @author Administrator
 *
 */
public class ZabbixTest {

	private static String access_key = "YWNjZXNza2V5NzU2NA=1";

	@Test
	public void monitorHistoryECS() {
		MonitorECSEntity entity = new MonitorECSEntity(access_key, "liukai02@sobey.com-10.10.101.1",
				ECSMonitorItemEnum.CPU使用情况);
		System.out.println(SDKClient.monitorHistoryECS(entity));
	}

	@Test
	public void monitorECS() {
		MonitorECSEntity entity = new MonitorECSEntity(access_key, "liukai02@sobey.com-10.10.101.1",
				ECSMonitorItemEnum.CPU使用情况);
		System.out.println(SDKClient.monitorECS(entity));
	}

}
