package com.sobey.sdk;

import java.util.HashMap;
import java.util.Map;

import com.sobey.sdk.entity.BindingEIPEntity;
import com.sobey.sdk.entity.BindingEIPToRouterEntity;
import com.sobey.sdk.entity.BindingFirewallEntity;
import com.sobey.sdk.entity.BindingRouterEntity;
import com.sobey.sdk.entity.BindingVolumeEntity;
import com.sobey.sdk.entity.CreateDNSEntity;
import com.sobey.sdk.entity.CreateECSEntity;
import com.sobey.sdk.entity.CreateEIPEntity;
import com.sobey.sdk.entity.CreateELBEntity;
import com.sobey.sdk.entity.CreateELBRuleEntity;
import com.sobey.sdk.entity.CreateFirewallEntity;
import com.sobey.sdk.entity.CreateRouterEntity;
import com.sobey.sdk.entity.CreateSubnetEntity;
import com.sobey.sdk.entity.CreateTenantsEntity;
import com.sobey.sdk.entity.CreateVolumeEntity;
import com.sobey.sdk.entity.DeleteDNSEntity;
import com.sobey.sdk.entity.DeleteEIPEntity;
import com.sobey.sdk.entity.DeleteELBEntity;
import com.sobey.sdk.entity.DeleteELBRuleEntity;
import com.sobey.sdk.entity.DeleteFirewallEntity;
import com.sobey.sdk.entity.DeleteRouterEntity;
import com.sobey.sdk.entity.DeleteVolumeEntity;
import com.sobey.sdk.entity.DescribeDNSEntity;
import com.sobey.sdk.entity.DescribeECSEntity;
import com.sobey.sdk.entity.DescribeEIPEntity;
import com.sobey.sdk.entity.DescribeELBEntity;
import com.sobey.sdk.entity.DescribeELBRuleEntity;
import com.sobey.sdk.entity.DescribeFirewallEntity;
import com.sobey.sdk.entity.DescribeRouterEntity;
import com.sobey.sdk.entity.DescribeSubnetEntity;
import com.sobey.sdk.entity.DescribeVMRCEntity;
import com.sobey.sdk.entity.DescribeVolumeEntity;
import com.sobey.sdk.entity.DestroyECSEntity;
import com.sobey.sdk.entity.MonitorECSEntity;
import com.sobey.sdk.entity.PowerOpsECSEntity;
import com.sobey.sdk.entity.UnbindingEIPEntity;
import com.sobey.sdk.entity.UpdateELBEntity;
import com.sobey.sdk.entity.UpdateELBRuleEntity;
import com.sobey.sdk.entity.UpdateFirewallEntity;
import com.sobey.sdk.entity.UpdateRouterEntity;
import com.sobey.sdk.entity.UpdateSubnetEntity;
import com.sobey.sdk.utils.HttpClientUtils;

public class SDKClient {

	// private static String URL = "http://10.2.12.90:8088/cmop-api/";

	private static String URL = "http://localhost:8088/cmop-api/";

	/********** Tenants ***********/

	public static String describeTenants(DescribeTenants entity) {
		return HttpClientUtils.get(URL + "TenantsResult/" + entity.getAccessKey());
	}

	public static String createTenants(CreateTenantsEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("company", entity.getCompany());
		params.put("name", entity.getName());
		params.put("email", entity.getEmail());
		params.put("phone", entity.getPhone());
		return HttpClientUtils.post(URL + "createTenants/", params);
	}

	/********** Subnet ***********/

	public static String describeVolume(DescribeSubnetEntity entity) {
		return HttpClientUtils.get(URL + "SubnetResult/" + entity.getSubnetCode() + "/" + entity.getAccessKey());
	}

	public static String createSubnet(CreateSubnetEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("subnetName", entity.getSubnetName());
		params.put("segment", entity.getSegment());
		params.put("gateway", entity.getGateway());
		params.put("netmask", entity.getNetmask());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "createSubnet/", params);
	}

	public static String updateSubnet(UpdateSubnetEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("subnetName", entity.getSubnetName());
		params.put("subnetCode", entity.getSubnetCode());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "updateSubnet/", params);
	}

	/********** Router ***********/

	public static String describeRouter(DescribeRouterEntity entity) {
		return HttpClientUtils.get(URL + "RouterResult/" + entity.getRouterCode() + "/" + entity.getAccessKey());
	}

	public static String createRouter(CreateRouterEntity entity) {

		Map<String, String> params = new HashMap<String, String>();
		params.put("routerName", entity.getRouterName());
		params.put("imageName", entity.getImageEnum().toString());
		params.put("cpuNumber", entity.getCpuNumber().toString());
		params.put("memoryMB", entity.getMemoryMB().toString());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("accessKey", entity.getAccessKey());
		params.put("firewallCode", entity.getFirewallCode());
		return HttpClientUtils.post(URL + "createRouter/", params);
	}

	public static String bindingRouter(BindingRouterEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("routerCode", entity.getRouterCode());
		params.put("subnetCodes", entity.getSubnetCodes());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "bindingRouter/", params);
	}

	public static String deleteRouter(DeleteRouterEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("routerCode", entity.getRouterCode());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "deleteRouter/", params);
	}

	public static String updateRouter(UpdateRouterEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("routerCode", entity.getRouterCode());
		params.put("accessKey", entity.getAccessKey());
		params.put("routerName", entity.getRouterName());
		return HttpClientUtils.post(URL + "updateRouter/", params);
	}

	/********** ECS ***********/

	public static String describeECS(DescribeECSEntity entity) {
		return HttpClientUtils.get(URL + "ECSResult/" + entity.getEcsCode() + "/" + entity.getAccessKey());
	}

	public static String createECS(CreateECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("subnetCode", entity.getSubnetCode());
		params.put("imageName", entity.getImageEnum().toString());
		params.put("cpuNumber", entity.getCpuNumber().toString());
		params.put("memoryMB", entity.getMemoryMB().toString());
		params.put("idc", entity.getIdcEnum().toString());
		return HttpClientUtils.post(URL + "createECS/", params);
	}

	public static String destroyECS(DestroyECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsCode", entity.getEcsCode());
		return HttpClientUtils.post(URL + "destroyECS/", params);
	}

	public static String powerOpsECS(PowerOpsECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsCode", entity.getEcsCode());
		params.put("powerOperation", entity.getPowerEnum().toString());
		return HttpClientUtils.post(URL + "powerOpsECS/", params);
	}

	/***** Volume *****/

	public static String describeVolume(DescribeVolumeEntity entity) {
		return HttpClientUtils.get(URL + "VolumeResult/" + entity.getVolumeCode() + "/" + entity.getAccessKey());
	}

	public static String createVolume(CreateVolumeEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("volumeName", entity.getVolumeName());
		params.put("size", entity.getSize().toString());
		params.put("volumeType", entity.getVolumeTypeEnum().toString());
		params.put("idc", entity.getIdcEnum().toString());
		return HttpClientUtils.post(URL + "createVolume/", params);
	}

	public static String bindingVolume(BindingVolumeEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("volumeCode", entity.getVolumeCode());
		params.put("ecsCode", entity.getEcsCode());
		return HttpClientUtils.post(URL + "bindingVolume/", params);
	}

	public static String deleteVolume(DeleteVolumeEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("volumeCode", entity.getVolumeCode());
		return HttpClientUtils.post(URL + "deleteVolume/", params);
	}

	/********** DNS ***********/

	public static String describeDNS(DescribeDNSEntity entity) {
		return HttpClientUtils.get(URL + "DNSResult/" + entity.getDnsCode() + "/" + entity.getAccessKey());
	}

	public static String createDNS(CreateDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domainName", entity.getDomainName());
		params.put("eipCodes", entity.getEipCodes());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createDNS/", params);
	}

	public static String deleteDNS(DeleteDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("dnsCode", entity.getDnsCode());
		return HttpClientUtils.post(URL + "deleteDNS/", params);
	}

	/******** Firewall ********/

	public static String describeFirewallResult(DescribeFirewallEntity entity) {
		return HttpClientUtils.get(URL + "FirewallResult/" + entity.getFirewallCode() + "/" + entity.getAccessKey());
	}

	public static String createFirewall(CreateFirewallEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("firewallName", entity.getFirewallName());
		params.put("directions", entity.getDirections());
		params.put("protocols", entity.getProtocols());
		params.put("startPorts", entity.getStartPorts());
		params.put("ipaddresses", entity.getIpaddresses());
		params.put("rulesNames", entity.getRulesNames());
		params.put("actions", entity.getActions());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("endPorts", entity.getEndPorts());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "createFirewall/", params);
	}

	public static String bindingFirewall(BindingFirewallEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("firewallCode", entity.getFirewallCode());
		params.put("routerCode", entity.getRouterCode());
		return HttpClientUtils.post(URL + "bindingFirewall/", params);
	}

	public static String deleteFirewall(DeleteFirewallEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("firewallCode", entity.getFirewallCode());
		return HttpClientUtils.post(URL + "deleteFirewall/", params);
	}

	public static String updateFirewall(UpdateFirewallEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("firewallName", entity.getFirewallName());
		params.put("firewallCode", entity.getFirewallCode());
		return HttpClientUtils.post(URL + "updateFirewall/", params);
	}

	/********** EIP ***********/

	public static String describeEIP(DescribeEIPEntity entity) {
		return HttpClientUtils.get(URL + "EIPResult/" + entity.getEipCode() + "/" + entity.getAccessKey());
	}

	public static String createEIP(CreateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("isp", entity.getIspEnum().toString());
		params.put("bandwidth", entity.getBandwidth());
		params.put("protocols", entity.getProtocols());
		params.put("sourcePorts", entity.getSourcePorts());
		params.put("targetPorts", entity.getTargetPorts());
		return HttpClientUtils.post(URL + "createEIP/", params);
	}

	public static String deleteEIP(DeleteEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipCode", entity.getEipCode());
		return HttpClientUtils.post(URL + "deleteEIP/", params);
	}

	public static String bindingEIP(BindingEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipCode", entity.getEipCode());
		params.put("iaasCode", entity.getIaasCode());
		return HttpClientUtils.post(URL + "bindingEIP/", params);
	}

	public static String unbindingEIP(UnbindingEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipCode", entity.getEipCode());
		params.put("iaasCode", entity.getIaasCode());
		return HttpClientUtils.post(URL + "unbindingEIP/", params);
	}

	public static String bindingEIPToRouter(BindingEIPToRouterEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipCode", entity.getEipCode());
		params.put("routerCode", entity.getRouterCode());
		return HttpClientUtils.post(URL + "bindingEIPToRouter/", params);
	}

	/***** ELB *****/

	public static String describeELB(DescribeELBEntity entity) {
		return HttpClientUtils.get(URL + "ELBResult/" + entity.getElbCode() + "/" + entity.getAccessKey());
	}

	public static String createELB(CreateELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbName", entity.getElbName());
		params.put("imageName", entity.getImageEnum().toString());
		params.put("cpuNumber", entity.getCpuNumber().toString());
		params.put("memoryMB", entity.getMemoryMB().toString());
		params.put("idc", entity.getIdcEnum().toString());
		return HttpClientUtils.post(URL + "createELB/", params);
	}

	public static String deleteELB(DeleteELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbCode", entity.getElbCode());
		return HttpClientUtils.post(URL + "deleteELB/", params);
	}

	public static String updateELB(UpdateELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbName", entity.getElbName());
		params.put("elbCode", entity.getElbCode());
		return HttpClientUtils.post(URL + "updateELB/", params);
	}

	/******** ELBRule ********/

	public static String describeELBRule(DescribeELBRuleEntity entity) {
		return HttpClientUtils.get(URL + "ELBRuleResult/" + entity.getElbRuleCode() + "/" + entity.getAccessKey());
	}

	public static String createELBRule(CreateELBRuleEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbCode", entity.getElbCode());
		params.put("ecsCodes", entity.getEcsCodes());
		params.put("elbRuleName", entity.getElbRuleName());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createELBRule/", params);
	}

	public static String createELBRule(UpdateELBRuleEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbRuleName", entity.getElbRuleName());
		params.put("elbRuleCode", entity.getElbRuleCode());
		return HttpClientUtils.post(URL + "updateELBRule/", params);
	}

	public static String deleteELBRule(DeleteELBRuleEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbRuleCode", entity.getElbRuleCode());
		return HttpClientUtils.post(URL + "deleteELBRule/", params);
	}

	/******** VMRC ********/

	public static String VMRCResult(DescribeVMRCEntity entity) {
		return HttpClientUtils.get(URL + "VMRCResult/" + entity.getEcsCode() + "/" + entity.getAccessKey());
	}

	/******** Zabbix ********/

	public static String monitorECS(MonitorECSEntity entity) {
		return HttpClientUtils.get(URL + "currentData/" + entity.getEcsCode() + "/" + entity.getEcsMonitorItemEnum()
				+ "/" + entity.getAccessKey());
	}

	public static String monitorHistoryECS(MonitorECSEntity entity) {
		return HttpClientUtils.get(URL + "historyData/" + entity.getEcsCode() + "/" + entity.getEcsMonitorItemEnum()
				+ "/" + entity.getAccessKey());
	}

}
