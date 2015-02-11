package com.sobey.sdk;

import java.util.HashMap;
import java.util.Map;

import com.sobey.sdk.entity.AssociateTagEntity;
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
import com.sobey.sdk.entity.CreateTagEntity;
import com.sobey.sdk.entity.CreateTenantsEntity;
import com.sobey.sdk.entity.DeleteDNSEntity;
import com.sobey.sdk.entity.DeleteEIPEntity;
import com.sobey.sdk.entity.DeleteELBEntity;
import com.sobey.sdk.entity.DeleteES3Entity;
import com.sobey.sdk.entity.DeleteTagEntity;
import com.sobey.sdk.entity.DescribeDNSEntity;
import com.sobey.sdk.entity.DescribeECSEntity;
import com.sobey.sdk.entity.DescribeEIPEntity;
import com.sobey.sdk.entity.DescribeELBEntity;
import com.sobey.sdk.entity.DescribeES3Entity;
import com.sobey.sdk.entity.DescribeTagEntity;
import com.sobey.sdk.entity.DescribeVMRCEntity;
import com.sobey.sdk.entity.DestroyECSEntity;
import com.sobey.sdk.entity.DetachES3Entity;
import com.sobey.sdk.entity.DissociateTagEntity;
import com.sobey.sdk.entity.MonitorECSEntity;
import com.sobey.sdk.entity.PowerOpsECSEntity;
import com.sobey.sdk.entity.ReconfigECSEntity;
import com.sobey.sdk.entity.UnbindingEIPEntity;
import com.sobey.sdk.utils.HttpClientUtils;

public class SDKClient {

	private static String URL = "http://10.2.12.90:8088/cmop-api/";

	// private static String URL = "http://localhost:8088/cmop-api/";

	/***** ECS *****/

	public static String describeECS(DescribeECSEntity entity) {
		return HttpClientUtils.get(URL + "ECSResult/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createTenants(CreateTenantsEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("company", entity.getCompany());
		params.put("name", entity.getName());
		params.put("email", entity.getEmail());
		params.put("phone", entity.getPhone());
		return HttpClientUtils.post(URL + "createTenants/", params);
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

	public static String bindingRouter(BindingRouterEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("routerCode", entity.getRouterCode());
		params.put("subnetCodes", entity.getSubnetCodes());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "bindingRouter/", params);
	}

	public static String createRouter(CreateRouterEntity entity) {

		Map<String, String> params = new HashMap<String, String>();
		params.put("routerName", entity.getRouterName());
		params.put("remark", entity.getRemark());
		params.put("imageName", entity.getRouterImageEnum().toString());
		params.put("cpuNumber", entity.getCpuNumber().toString());
		params.put("memoryMB", entity.getMemoryMB().toString());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("accessKey", entity.getAccessKey());
		params.put("firewallServiceCode", entity.getFirewallServiceCode());
		return HttpClientUtils.post(URL + "createRouter/", params);
	}

	public static String createECS(CreateECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("subnetCode", entity.getSubnetCode());
		params.put("remark", entity.getRemark());
		params.put("imageName", entity.getEcsImageEnum().toString());
		params.put("cpuNumber", entity.getCpuNumber().toString());
		params.put("memoryMB", entity.getMemoryMB().toString());
		params.put("idc", entity.getIdcEnum().toString());
		return HttpClientUtils.post(URL + "createECS/", params);
	}

	public static String destroyECS(DestroyECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		return HttpClientUtils.post(URL + "destroyECS/", params);
	}

	public static String powerOpsECS(PowerOpsECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		params.put("powerOperation", entity.getPowerEnum().toString());
		return HttpClientUtils.post(URL + "powerOpsECS/", params);
	}

	public static String reconfigECS(ReconfigECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		params.put("ecsSpec", entity.getSpecEnum().toString());
		return HttpClientUtils.post(URL + "reconfigECS/", params);
	}

	/***** ES3 *****/

	public static String describeES3(DescribeES3Entity entity) {
		return HttpClientUtils.get(URL + "ES3Result/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createES3(CreateES3Entity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("es3Name", entity.getEs3Name());
		params.put("es3Size", entity.getEs3Size().toString());
		params.put("es3Type", entity.getEs3TypeEnum().toString());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("remark", entity.getRemark());
		return HttpClientUtils.post(URL + "createES3/", params);
	}

	public static String bindingES3(BindingES3Entity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("es3Code", entity.getEs3Code());
		params.put("ecsCode", entity.getEcsCode());
		return HttpClientUtils.post(URL + "bindingES3/", params);
	}

	public static String detachES3(DetachES3Entity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("es3Name", entity.getEs3Name());
		params.put("ecsName", entity.getEcsName());
		return HttpClientUtils.post(URL + "detachES3/", params);
	}

	public static String deleteES3(DeleteES3Entity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		return HttpClientUtils.post(URL + "deleteES3/", params);
	}

	/***** ELB *****/

	public static String describeELB(DescribeELBEntity entity) {
		return HttpClientUtils.get(URL + "ELBResult/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createELB(CreateELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsCodes", entity.getEcsCodes());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createELB/", params);
	}

	public static String deleteELB(DeleteELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbName", entity.getCode());
		return HttpClientUtils.post(URL + "deleteELB/", params);
	}

	/***** EIP *****/

	public static String describeEIP(DescribeEIPEntity entity) {
		return HttpClientUtils.get(URL + "EIPResult/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createEIP(CreateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("isp", entity.getIspEnum().toString());
		params.put("remark", entity.getRemark());
		params.put("bandwidth", entity.getBandwidth());
		params.put("protocols", entity.getProtocols());
		params.put("sourcePorts", entity.getSourcePorts());
		params.put("targetPorts", entity.getTargetPorts());
		return HttpClientUtils.post(URL + "createEIP/", params);
	}

	public static String deleteEIP(DeleteEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		return HttpClientUtils.post(URL + "deleteEIP/", params);
	}

	public static String bindingEIP(BindingEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		params.put("serviceCode", entity.getServiceCode());
		return HttpClientUtils.post(URL + "bindingEIP/", params);
	}

	public static String unbindingEIP(UnbindingEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("code", entity.getCode());
		params.put("serviceCode", entity.getServiceCode());
		return HttpClientUtils.post(URL + "unbindingEIP/", params);
	}

	public static String bindingEIPToRouter(BindingEIPToRouterEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipCode", entity.getEipCode());
		params.put("routerCode", entity.getRouterCode());
		return HttpClientUtils.post(URL + "bindingEIPToRouter/", params);
	}

	/***** DNS *****/

	public static String describeDNS(DescribeDNSEntity entity) {
		return HttpClientUtils.get(URL + "DNSResult/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createDNS(CreateDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domainName", entity.getDomainName());
		params.put("eipCodes", entity.getEipCodes());
		params.put("remark", entity.getRemark());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createDNS/", params);
	}

	public static String deleteDNS(DeleteDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domainName", entity.getCode());
		return HttpClientUtils.post(URL + "deleteDNS/", params);
	}

	/***** FirewallService *****/

	public static String describeFirewallServiceResult(DescribeDNSEntity entity) {
		return HttpClientUtils.get(URL + "FirewallServiceResult/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createFirewallService(CreateFirewallServiceEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("firewallServiceName", entity.getFirewallServiceName());
		params.put("directions", entity.getDirections());
		params.put("protocols", entity.getProtocols());
		params.put("startPorts", entity.getStartPorts());
		params.put("ipaddresses", entity.getIpaddresses());
		params.put("rulesNames", entity.getRulesNames());
		params.put("actions", entity.getActions());
		params.put("idc", entity.getIdcEnum().toString());
		params.put("endPorts", entity.getEndPorts());
		params.put("accessKey", entity.getAccessKey());
		return HttpClientUtils.post(URL + "createFirewallService/", params);
	}

	public static String bindingFirewallService(BindingFirewallServiceEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("firewallServiceCode", entity.getFirewallServiceCode());
		params.put("routerCode", entity.getRouterCode());
		return HttpClientUtils.post(URL + "bindingFirewallService/", params);
	}

	/***** TAG *****/

	public static String describeTag(DescribeTagEntity entity) {
		return HttpClientUtils.get(URL + "TagResult/" + entity.getCode() + "/" + entity.getAccessKey());
	}

	public static String createTag(CreateTagEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("tagName", entity.getTagName());
		params.put("parentTag", entity.getParentTag());
		return HttpClientUtils.post(URL + "createTag/", params);
	}

	public static String deleteTag(DeleteTagEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("tagName", entity.getCode());
		return HttpClientUtils.post(URL + "deleteTag/", params);
	}

	public static String associateTag(AssociateTagEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("tagName", entity.getTagName());
		params.put("serviceId", entity.getServiceId());
		return HttpClientUtils.post(URL + "associateTag/", params);
	}

	public static String dissociateTag(DissociateTagEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("tagName", entity.getTagName());
		params.put("serviceId", entity.getServiceId());
		return HttpClientUtils.post(URL + "dssociateTag/", params);
	}

	/***** VMRC *****/

	public static String VMRCResult(DescribeVMRCEntity entity) {
		return HttpClientUtils.get(URL + "VMRCResult/" + entity.getEcsCode() + "/" + entity.getAccessKey());
	}

	/***** Zabbix *****/

	public static String monitorECS(MonitorECSEntity entity) {
		return HttpClientUtils.get(URL + "currentData/" + entity.getEcsCode() + "/" + entity.getEcsMonitorItemEnum()
				+ "/" + entity.getAccessKey());
	}

	public static String monitorHistoryECS(MonitorECSEntity entity) {
		return HttpClientUtils.get(URL + "historyData/" + entity.getEcsCode() + "/" + entity.getEcsMonitorItemEnum()
				+ "/" + entity.getAccessKey());
	}

}
