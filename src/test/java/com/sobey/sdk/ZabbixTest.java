package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.ECSMonitorItemEnum;
import com.sobey.sdk.constant.ES3MonitorItemEnum;
import com.sobey.sdk.entity.MonitorECSEntity;
import com.sobey.sdk.entity.MonitorES3Entity;

/**
 * @author Administrator
 *
 */
public class ZabbixTest {

	private static String access_key = "YWNjZXNza2V5NzU2NA=1";

	@Test
	public void monitorHistoryECS() {
		MonitorECSEntity entity = new MonitorECSEntity(access_key, "liukai02@sobey.com-10.10.101.1",
				ECSMonitorItemEnum.硬盘可用空间);
		System.out.println(SDKClient.monitorHistoryECS(entity));
	}

	@Test
	public void monitorECS() {
		MonitorECSEntity entity = new MonitorECSEntity(access_key, "liukai02@sobey.com-10.10.101.1",
				ECSMonitorItemEnum.硬盘可用空间);
		System.out.println(SDKClient.monitorECS(entity));
	}

	@Test
	public void monitorHistoryES3() {
		MonitorES3Entity entity = new MonitorES3Entity(access_key, "data_gdsyxh", ES3MonitorItemEnum.存储状态);
		System.out.println(SDKClient.monitorHistoryES3(entity));
	}

	@Test
	public void monitorES3() {
		MonitorES3Entity entity = new MonitorES3Entity(access_key, "data_gdsyxh", ES3MonitorItemEnum.存储状态);
		System.out.println(SDKClient.monitorES3(entity));
	}

}
