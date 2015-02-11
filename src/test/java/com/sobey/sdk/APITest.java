package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.DNSProtocolEnum;
import com.sobey.sdk.constant.ECSImageEnum;
import com.sobey.sdk.constant.EIPProtocolEnum;
import com.sobey.sdk.constant.ES3TypeEnum;
import com.sobey.sdk.constant.FirewallDirectionEnum;
import com.sobey.sdk.constant.FirewallPolicyActionEnum;
import com.sobey.sdk.constant.FirewallProtocolEnum;
import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.ISPEnum;
import com.sobey.sdk.constant.RouterImageEnum;
import com.sobey.sdk.entity.BindingEIPEntity;
import com.sobey.sdk.entity.BindingEIPToRouterEntity;
import com.sobey.sdk.entity.BindingES3Entity;
import com.sobey.sdk.entity.BindingFirewallServiceEntity;
import com.sobey.sdk.entity.BindingRouterEntity;
import com.sobey.sdk.entity.CreateDNSEntity;
import com.sobey.sdk.entity.CreateECSEntity;
import com.sobey.sdk.entity.CreateEIPEntity;
import com.sobey.sdk.entity.CreateELBEntity;
import com.sobey.sdk.entity.CreateES3Entity;
import com.sobey.sdk.entity.CreateFirewallServiceEntity;
import com.sobey.sdk.entity.CreateRouterEntity;
import com.sobey.sdk.entity.CreateSubnetEntity;
import com.sobey.sdk.entity.CreateTenantsEntity;
import com.sobey.sdk.entity.DescribeVMRCEntity;

public class APITest {

	private static String accessKey = "ejg0NlVTMldEWE9NaGRBUw==";

	@Test
	public void createTenants() {
		CreateTenantsEntity entity = new CreateTenantsEntity("Sobey", "liukai@sobey.com", "liukai", "13880473384");
		System.out.println(SDKClient.createTenants(entity));
	}

	@Test
	public void createSubnet() {
		CreateSubnetEntity entity = new CreateSubnetEntity(accessKey, "172.16.200.254", IDCEnum.成都核心数据中心,
				"255.255.255.0", "172.16.200.0", "200网段");
		System.out.println(SDKClient.createSubnet(entity));
	}

	@Test
	public void createECS() {
		CreateECSEntity entity = new CreateECSEntity(accessKey, 4, ECSImageEnum.CentOS6_3, "200网段主机A",
				IDCEnum.成都核心数据中心, 4096, "", "Subnet-DSm67IID");
		System.out.println(SDKClient.createECS(entity));

	}

	@Test
	public void createES3() {
		CreateES3Entity entity = new CreateES3Entity(accessKey, "AAA", 10, ES3TypeEnum.媒体存储, IDCEnum.成都核心数据中心, "");
		System.out.println(SDKClient.createES3(entity));
	}

	@Test
	public void bindingES3() {
		BindingES3Entity entity = new BindingES3Entity(accessKey, "ECS-Ue25DEIU", "ES3-OoyKJeyk");
		System.out.println(SDKClient.bindingES3(entity));
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
		CreateRouterEntity entity = new CreateRouterEntity(accessKey, 1, "FirewallService-L8KXWWH3", IDCEnum.成都核心数据中心,
				1024, "", RouterImageEnum.Standard_Router, "默认Router");
		System.out.println(SDKClient.createRouter(entity));
	}

	@Test
	public void bindingRouter() {
		BindingRouterEntity entity = new BindingRouterEntity(accessKey, "Router-KaSDNvEr",
				"Subnet-DSm67IID,Subnet-cbsp78pa");
		System.out.println(SDKClient.bindingRouter(entity));
	}

	@Test
	public void bindingFirewallService() {
		BindingFirewallServiceEntity entity = new BindingFirewallServiceEntity(accessKey, "Router-wcl85hO8",
				"FirewallService-wuvyyIN0");
		System.out.println(SDKClient.bindingFirewallService(entity));
	}

	@Test
	public void createELB() {
		CreateELBEntity entity = new CreateELBEntity(accessKey, "ECS-rNh6uPBw,ECS-Ue25DEIU", "HTTP,HTTP");
		System.out.println(SDKClient.createELB(entity));
	}

	@Test
	public void createEIP() {
		CreateEIPEntity entity = new CreateEIPEntity(accessKey, ISPEnum.中国电信, EIPProtocolEnum.TCP.toString(), "80",
				"80", "", "1");
		System.out.println(SDKClient.createEIP(entity));
	}

	@Test
	public void bindingEIPToRouter() {
		BindingEIPToRouterEntity entity = new BindingEIPToRouterEntity(accessKey, "EIP-j0sf8jd3", "Router-KaSDNvEr");
		System.out.println(SDKClient.bindingEIPToRouter(entity));
	}

	@Test
	public void bindingEIP() {
		BindingEIPEntity entity = new BindingEIPEntity(accessKey, "EIP-nxDTVUpl", "ELB-IfPYH837");
		System.out.println(SDKClient.bindingEIP(entity));
	}

	@Test
	public void createDNS() {
		CreateDNSEntity entity = new CreateDNSEntity(accessKey, "www.sobey.com", "EIP-oNRIYmcW",
				DNSProtocolEnum.HTTP.toString(), "", IDCEnum.成都核心数据中心);
		System.out.println(SDKClient.createDNS(entity));
	}

	@Test
	public void VMRCResult() {
		DescribeVMRCEntity entity = new DescribeVMRCEntity(accessKey, "ECS-UzFMOf1Z");
		System.out.println(SDKClient.VMRCResult(entity));
	}

}
