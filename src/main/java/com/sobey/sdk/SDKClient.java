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
import com.sobey.sdk.entity.DestroyECSEntity;
import com.sobey.sdk.entity.DetachES3Entity;
import com.sobey.sdk.entity.DissociateEIPEntity;
import com.sobey.sdk.entity.DissociateESGEntity;
import com.sobey.sdk.entity.DssociateTagEntity;
import com.sobey.sdk.entity.PowerOpsECSEntity;
import com.sobey.sdk.entity.ReconfigECSEntity;
import com.sobey.sdk.entity.RecoverEIPEntity;
import com.sobey.sdk.utils.HttpClientUtils;

public class SDKClient {

	private static String URL = "http://localhost:8088/cmop-api/";

	public static String createECS(CreateECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("remark", entity.getRemark());
		params.put("ecsSpec", entity.getEcsSpec());
		params.put("idc", entity.getIdc());
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
		params.put("powerOperation", entity.getPowerOperation());
		return HttpClientUtils.post(URL + "powerOpsECS/", params);
	}

	public static String reconfigECS(ReconfigECSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("ecsName", entity.getEcsName());
		params.put("ecsSpec", entity.getEcsSpec());
		return HttpClientUtils.post(URL + "reconfigECS/", params);
	}

	public static String createES3(CreateES3Entity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("es3Name", entity.getEs3Name());
		params.put("es3Size", entity.getEs3Size().toString());
		params.put("es3Type", entity.getEs3Type());
		params.put("idc", entity.getIdc());
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

	public static String allocateEIP(AllocateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("isp", entity.getIsp());
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
		params.put("serviceName", entity.getServiceName());
		return HttpClientUtils.post(URL + "associateEIP/", params);
	}

	public static String dissociateEIP(DissociateEIPEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("eipName", entity.getEipName());
		params.put("serviceName", entity.getServiceName());
		return HttpClientUtils.post(URL + "dissociateEIP/", params);
	}

	public static String createDNS(CreateDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domain", entity.getDomain());
		params.put("eipNames", entity.getEipNames());
		params.put("protocols", entity.getProtocols());
		return HttpClientUtils.post(URL + "createDNS/", params);
	}

	public static String deleteDNS(DeleteDNSEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("domain", entity.getDomain());
		return HttpClientUtils.post(URL + "deleteDNS/", params);
	}

	public static String createESG(CreateESGEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("esgName", entity.getEsgName());
		params.put("policyTypes", entity.getPolicyTypes());
		params.put("targetIPs", entity.getTargetIPs());
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
		params.put("serviceName", entity.getServiceName());
		return HttpClientUtils.post(URL + "associateTag/", params);
	}

	public static String dssociateTag(DssociateTagEntity entity) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("accessKey", entity.getAccessKey());
		params.put("tagName", entity.getTagName());
		params.put("serviceName", entity.getServiceName());
		return HttpClientUtils.post(URL + "dssociateTag/", params);
	}

}
