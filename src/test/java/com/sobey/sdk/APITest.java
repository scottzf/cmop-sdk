package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.DNSProtocolEnum;
import com.sobey.sdk.constant.EIPProtocolEnum;
import com.sobey.sdk.constant.ES3TypeEnum;
import com.sobey.sdk.constant.FirewallDirectionEnum;
import com.sobey.sdk.constant.FirewallPolicyActionEnum;
import com.sobey.sdk.constant.FirewallProtocolEnum;
import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.ISPEnum;
import com.sobey.sdk.constant.RouterSpecEnum;
import com.sobey.sdk.constant.SpecEnum;
import com.sobey.sdk.entity.AllocateEIPEntity;
import com.sobey.sdk.entity.AssociateEIPEntity;
import com.sobey.sdk.entity.BindingFirewallServiceEntity;
import com.sobey.sdk.entity.BindingRouterEntity;
import com.sobey.sdk.entity.CreateDNSEntity;
import com.sobey.sdk.entity.CreateECSEntity;
import com.sobey.sdk.entity.CreateES3Entity;
import com.sobey.sdk.entity.CreateFirewallServiceEntity;
import com.sobey.sdk.entity.CreateRouterEntity;
import com.sobey.sdk.entity.CreateSubnetEntity;
import com.sobey.sdk.entity.CreateTenantsEntity;
import com.sobey.sdk.entity.DescribeVMRCEntity;

public class APITest {

	private static String accessKey = "cHZsaGJNYzc5cmRLbTJ2Ug==";

	@Test
	public void createTenants() {
		CreateTenantsEntity entity = new CreateTenantsEntity("Sobey", "liukai@sobey.com", "liukai", "13880473384");
		System.out.println(SDKClient.createTenants(entity));
	}

	@Test
	public void createSubnet() {
		CreateSubnetEntity entity = new CreateSubnetEntity(accessKey, "192.168.200.1", IDCEnum.成都核心数据中心,
				"255.255.255.0", "192.168.200.0", "200网段");
		System.out.println(SDKClient.createSubnet(entity));
	}

	@Test
	public void createECS() {
		CreateECSEntity entity = new CreateECSEntity(accessKey, "200网段主机B", IDCEnum.成都核心数据中心, "", SpecEnum.CentOS6_3,
				"Subnet-RDQ3RbV1");
		System.out.println(SDKClient.createECS(entity));

	}

	@Test
	public void createES3() {
		CreateES3Entity entity = new CreateES3Entity(accessKey, "ECS-GZflgBIc", "存储A", 50, ES3TypeEnum.高IOPS,
				IDCEnum.成都核心数据中心, "");
		System.out.println(SDKClient.createES3(entity));
	}

	@Test
	public void createFirewallService() {
		CreateFirewallServiceEntity entity = new CreateFirewallServiceEntity(accessKey,
				FirewallPolicyActionEnum.Allow.toString(), FirewallDirectionEnum.上行.toString(), "80", "电信防火墙",
				IDCEnum.成都核心数据中心, "0.0.0.0", FirewallProtocolEnum.TCP.toString(), "默认规则", "80");

		System.out.println(SDKClient.createFirewallService(entity));
	}

	@Test
	public void createRouter() {
		CreateRouterEntity entity = new CreateRouterEntity(accessKey, "FirewallService-mNqiGnn3", IDCEnum.成都核心数据中心, "",
				"自定义路由", RouterSpecEnum.Default_Router);
		System.out.println(SDKClient.createRouter(entity));
	}

	@Test
	public void bindingRouter() {
		BindingRouterEntity entity = new BindingRouterEntity(accessKey, "Router-o2sI8m1y",
				"Subnet-RDQ3RbV1,Subnet-x2GBNRw6");
		System.out.println(SDKClient.bindingRouter(entity));
	}

	@Test
	public void bindingFirewallService() {
		BindingFirewallServiceEntity entity = new BindingFirewallServiceEntity(accessKey, "Router-o2sI8m1y",
				"FirewallService-cSQGvrHl");
		System.out.println(SDKClient.bindingFirewallService(entity));
	}

	@Test
	public void allocateEIP() {
		AllocateEIPEntity entity = new AllocateEIPEntity(accessKey, ISPEnum.中国电信, EIPProtocolEnum.TCP.toString(), "80",
				"80", "", "1");
		System.out.println(SDKClient.allocateEIP(entity));
	}

	@Test
	public void associateEIP() {
		AssociateEIPEntity entity = new AssociateEIPEntity(accessKey, "EIP-oNRIYmcW", "ECS-GZflgBIc");
		System.out.println(SDKClient.associateEIP(entity));
	}

	@Test
	public void createDNS() {
		CreateDNSEntity entity = new CreateDNSEntity(accessKey, "www.sobey.com", "EIP-oNRIYmcW",
				DNSProtocolEnum.HTTP.toString(), "", IDCEnum.成都核心数据中心);
		System.out.println(SDKClient.createDNS(entity));
	}

	@Test
	public void ddd() {
		DescribeVMRCEntity entity = new DescribeVMRCEntity(accessKey, "Tenants-zOw0lt4c");
		System.out.println(SDKClient.VMRCResult(entity));
	}

}
