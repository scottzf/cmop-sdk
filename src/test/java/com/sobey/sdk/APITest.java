package com.sobey.sdk;

import org.junit.Test;

import com.sobey.sdk.constant.DNSProtocolEnum;
import com.sobey.sdk.constant.EIPProtocolEnum;
import com.sobey.sdk.constant.ELBImageEnum;
import com.sobey.sdk.constant.FirewallDirectionEnum;
import com.sobey.sdk.constant.FirewallPolicyActionEnum;
import com.sobey.sdk.constant.FirewallProtocolEnum;
import com.sobey.sdk.constant.IDCEnum;
import com.sobey.sdk.constant.ISPEnum;
import com.sobey.sdk.constant.ImageEnum;
import com.sobey.sdk.constant.RouterImageEnum;
import com.sobey.sdk.constant.VolumeTypeEnum;
import com.sobey.sdk.entity.BindingEIPEntity;
import com.sobey.sdk.entity.BindingEIPToRouterEntity;
import com.sobey.sdk.entity.BindingFirewallEntity;
import com.sobey.sdk.entity.BindingRouterEntity;
import com.sobey.sdk.entity.BindingVolumeEntity;
import com.sobey.sdk.entity.CreateDNSEntity;
import com.sobey.sdk.entity.CreateECSEntity;
import com.sobey.sdk.entity.CreateEIPEntity;
import com.sobey.sdk.entity.CreateELBEntity;
import com.sobey.sdk.entity.CreateFirewallEntity;
import com.sobey.sdk.entity.CreateRouterEntity;
import com.sobey.sdk.entity.CreateSubnetEntity;
import com.sobey.sdk.entity.CreateTenantsEntity;
import com.sobey.sdk.entity.CreateVolumeEntity;
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
		CreateECSEntity entity = new CreateECSEntity(accessKey, 2, "200网段主机", IDCEnum.成都核心数据中心, ImageEnum.CentOS6_3,
				4096, "Subnet-DSm67IID");
		System.out.println(SDKClient.createECS(entity));

	}

	@Test
	public void CreateVolume() {
		CreateVolumeEntity entity = new CreateVolumeEntity(accessKey, IDCEnum.成都核心数据中心, 10D, "云生产存储A",
				VolumeTypeEnum.媒体存储);

		System.out.println(SDKClient.createVolume(entity));
	}

	@Test
	public void bindingVolume() {
		BindingVolumeEntity entity = new BindingVolumeEntity(accessKey, "ECS-Ue25DEIU", "Volume-OoyKJeyk");
		System.out.println(SDKClient.bindingVolume(entity));
	}

	@Test
	public void createFirewallService() {
		CreateFirewallEntity entity = new CreateFirewallEntity(accessKey, FirewallPolicyActionEnum.Allow.toString(),
				FirewallDirectionEnum.上行.toString(), "80", "电信防火墙", IDCEnum.成都核心数据中心, "0.0.0.0",
				FirewallProtocolEnum.TCP.toString(), "默认规则", "80");

		System.out.println(SDKClient.createFirewall(entity));
	}

	@Test
	public void createRouter() {
		CreateRouterEntity entity = new CreateRouterEntity(accessKey, 1, "Firewall-L8KXWWH3", IDCEnum.成都核心数据中心,
				RouterImageEnum.Standard_Router, 4096, "默认Route");

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
		BindingFirewallEntity entity = new BindingFirewallEntity(accessKey, "Router-wcl85hO8",
				"FirewallService-wuvyyIN0");
		System.out.println(SDKClient.bindingFirewall(entity));
	}

	@Test
	public void createELB() {
		CreateELBEntity entity = new CreateELBEntity(accessKey, 1, "负载均衡器A", IDCEnum.成都核心数据中心,
				ELBImageEnum.Standard_Router, 2048, "Subnet-123344");
		System.out.println(SDKClient.createELB(entity));
	}

	@Test
	public void createEIP() {
		CreateEIPEntity entity = new CreateEIPEntity(accessKey, "1", ISPEnum.中国电信, EIPProtocolEnum.TCP.toString(),
				"80", "80");
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
		CreateDNSEntity entity = new CreateDNSEntity(accessKey, "www.sobey.com", "EIP-oNRIYmcW", IDCEnum.成都核心数据中心,
				DNSProtocolEnum.HTTP.toString());
		System.out.println(SDKClient.createDNS(entity));
	}

	@Test
	public void VMRCResult() {
		DescribeVMRCEntity entity = new DescribeVMRCEntity(accessKey, "ECS-UzFMOf1Z");
		System.out.println(SDKClient.VMRCResult(entity));
	}

}
