package com.sobey.sdk;

import java.util.HashMap;
import java.util.Map;

import com.sobey.sdk.entity.AllocateEIPEntity;
import com.sobey.sdk.entity.AssociateEIPEntity;
import com.sobey.sdk.entity.AssociateESGEntity;
import com.sobey.sdk.entity.AssociateTagEntity;
import com.sobey.sdk.entity.AttachES3Entity;
import com.sobey.sdk.entity.CreateDNSEntity;
import com.sobey.sdk.entity.CreateECSEntity;
import com.sobey.sdk.entity.CreateELBEntity;
import com.sobey.sdk.entity.CreateES3Entity;
import com.sobey.sdk.entity.CreateESGEntity;
import com.sobey.sdk.entity.CreateTagEntity;
import com.sobey.sdk.entity.DeleteDNSEntity;
import com.sobey.sdk.entity.DeleteELBEntity;
import com.sobey.sdk.entity.DeleteES3Entity;
import com.sobey.sdk.entity.DeleteESGEntity;
import com.sobey.sdk.entity.DeleteTagEntity;
import com.sobey.sdk.entity.DescribeDNSEntity;
import com.sobey.sdk.entity.DescribeECSEntity;
import com.sobey.sdk.entity.DescribeEIPEntity;
import com.sobey.sdk.entity.DescribeELBEntity;
import com.sobey.sdk.entity.DescribeES3Entity;
import com.sobey.sdk.entity.DescribeESGEntity;
import com.sobey.sdk.entity.DescribeTagEntity;
import com.sobey.sdk.entity.DestroyECSEntity;
import com.sobey.sdk.entity.DetachES3Entity;
import com.sobey.sdk.entity.DissociateEIPEntity;
import com.sobey.sdk.entity.DissociateESGEntity;
import com.sobey.sdk.entity.DissociateTagEntity;
import com.sobey.sdk.entity.MonitorECSEntity;
import com.sobey.sdk.entity.MonitorES3Entity;
import com.sobey.sdk.entity.PowerOpsECSEntity;
import com.sobey.sdk.entity.ReconfigECSEntity;
import com.sobey.sdk.entity.RecoverEIPEntity;
import com.sobey.sdk.utils.HttpClientUtils;

public class SDKClient {

	// private static String URL = "http://localhost:8088/cmop-api/";
	private static String URL = "http://10.10.2.90:8088/cmop-api/";

	/***** ECS *****/

	public static String describeECS(DescribeECSEntity entity) {
		return HttpClientUtils.get(URL + "ECSResult/" + entity.getEcsName() + "/" + entity.getAccessKey());
	}

	public static String createECS(CreateECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("remark", entity.getRemark());
		params.put("ecsSpec", entity.getSpecEnum().toString());
		params.put("idc", entity.getIdcEnum().toString());
		return HttpClientUtils.post(URL + "createECS/", params);
	}

	public static String destroyECS(DestroyECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		return HttpClientUtils.post(URL + "destroyECS/", params);
	}

	public static String powerOpsECS(PowerOpsECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("powerOperation", entity.getPowerEnum().toString());
		return HttpClientUtils.post(URL + "powerOpsECS/", params);
	}

	public static String reconfigECS(ReconfigECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("ecsSpec", entity.getSpecEnum().toString());
		return HttpClientUtils.post(URL + "reconfigECS/", params);
	}

	/***** ES3 *****/

	public static String describeES3(DescribeES3Entity entity) {
		return HttpClientUtils.get(URL + "ES3Result/" + entity.getEs3Name() + "/" + entity.getAccessKey());
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

	public static String attachES3(AttachES3Entity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("es3Name", entity.getEs3Name());
		params.put("ecsName", entity.getEcsName());
		return HttpClientUtils.post(URL + "attachES3/", params);
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
		params.put("es3Name", entity.getEs3Name());
		return HttpClientUtils.post(URL + "deleteES3/", params);
	}

	/***** ELB *****/

	public static String describeELB(DescribeELBEntity entity) {
		return HttpClientUtils.get(URL + "ELBResult/" + entity.getElbName() + "/" + entity.getAccessKey());
	}

	public static String createELB(CreateELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsNames", entity.getEcsNames());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createELB/", params);
	}

	public static String deleteELB(DeleteELBEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("elbName", entity.getElbName());
		return HttpClientUtils.post(URL + "deleteELB/", params);
	}

	/***** EIP *****/

	public static String describeEIP(DescribeEIPEntity entity) {
		return HttpClientUtils.get(URL + "EIPResult/" + entity.getEipName() + "/" + entity.getAccessKey());
	}

	public static String allocateEIP(AllocateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("isp", entity.getIspEnum().toString());
		params.put("remark", entity.getRemark());
		params.put("bandwidth", entity.getBandwidth());
		params.put("protocols", entity.getProtocols());
		params.put("sourcePorts", entity.getSourcePorts());
		params.put("targetPorts", entity.getTargetPorts());
		return HttpClientUtils.post(URL + "allocateEIP/", params);
	}

	public static String recoverEIP(RecoverEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipName", entity.getEipName());
		return HttpClientUtils.post(URL + "recoverEIP/", params);
	}

	public static String associateEIP(AssociateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipName", entity.getEipName());
		params.put("serviceId", entity.getServiceId());
		return HttpClientUtils.post(URL + "associateEIP/", params);
	}

	public static String dissociateEIP(DissociateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipName", entity.getEipName());
		params.put("serviceId", entity.getServiceId());
		return HttpClientUtils.post(URL + "dissociateEIP/", params);
	}

	/***** DNS *****/

	public static String describeDNS(DescribeDNSEntity entity) {
		return HttpClientUtils.get(URL + "DNSResult/" + entity.getDnsName() + "/" + entity.getAccessKey());
	}

	public static String createDNS(CreateDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domainName", entity.getDomain());
		params.put("eipNames", entity.getEipNames());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createDNS/", params);
	}

	public static String deleteDNS(DeleteDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domainName", entity.getDomain());
		return HttpClientUtils.post(URL + "deleteDNS/", params);
	}

	/***** ESG *****/

	public static String describeESG(DescribeESGEntity entity) {
		return HttpClientUtils.get(URL + "ESGResult/" + entity.getEsgName() + "/" + entity.getAccessKey());
	}

	public static String createESG(CreateESGEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("esgName", entity.getEsgName());
		params.put("policyTypes", entity.getPolicyTypes());
		params.put("targetIPs", entity.getTargetIPs());
		params.put("targetIPs", entity.getRemark());
		return HttpClientUtils.post(URL + "createESG/", params);
	}

	public static String deleteESG(DeleteESGEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("esgName", entity.getEsgName());
		return HttpClientUtils.post(URL + "deleteESG/", params);
	}

	public static String associateESG(AssociateESGEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("esgName", entity.getEsgName());
		params.put("ecsName", entity.getEcsName());
		return HttpClientUtils.post(URL + "associateESG/", params);
	}

	public static String dissociateESG(DissociateESGEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("esgName", entity.getEsgName());
		params.put("ecsName", entity.getEcsName());
		return HttpClientUtils.post(URL + "dissociateESG/", params);
	}

	/***** TAG *****/

	public static String describeTag(DescribeTagEntity entity) {
		return HttpClientUtils.get(URL + "TagResult/" + entity.getTagName() + "/" + entity.getAccessKey());
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
		params.put("tagName", entity.getTagName());
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

	/***** Zabbix *****/

	public static String monitorECS(MonitorECSEntity entity) {
		return HttpClientUtils.get(URL + "currentData/" + entity.getEcsName() + "/" + entity.getEcsMonitorItemEnum()
				+ "/" + entity.getAccessKey());
	}

	public static String monitorHistoryECS(MonitorECSEntity entity) {
		return HttpClientUtils.get(URL + "historyData/" + entity.getEcsName() + "/" + entity.getEcsMonitorItemEnum()
				+ "/" + entity.getAccessKey());
	}

	public static String monitorES3(MonitorES3Entity entity) {
		return HttpClientUtils.get(URL + "storageCurrentData/" + entity.getEs3Name() + "/" + entity.getAccessKey());
	}

	public static String monitorHistoryES3(MonitorES3Entity entity) {
		return HttpClientUtils.get(URL + "storageHistoryData/" + entity.getEs3Name() + "/" + entity.getAccessKey());
	}
}
