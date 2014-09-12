package com.sobey.sdk.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * HttpClient工具类
 * 
 * @author Administrator
 *
 */
public class HttpClientUtils {

	/**
	 * 发送Post请求.
	 * 
	 * @param url
	 *            地址
	 * @param params
	 *            post请求参数
	 */
	public static String post(String url, Map<String, String> params) {

		String content = "";

		// 创建默认的httpClient实例.
		CloseableHttpClient httpclient = HttpClients.createDefault();

		// 创建httppost
		HttpPost httppost = new HttpPost(url);

		// 创建参数队列
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			formparams.add(new BasicNameValuePair(key, params.get(key)));
		}

		UrlEncodedFormEntity uefEntity;

		try {

			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");

			httppost.setEntity(uefEntity);

			System.out.println("executing request " + httppost.getURI());

			CloseableHttpResponse response = httpclient.execute(httppost);

			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					content = EntityUtils.toString(entity, "UTF-8");
					// System.out.println("--------------------------------------");
					// System.out.println("Response content: " + content);
					// System.out.println("--------------------------------------");
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return content;
	}

	/**
	 * 发送Get请求
	 * 
	 * @param url
	 */
	public static String get(String url) {

		String content = "";

		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {

			// 创建httpget.
			HttpGet httpget = new HttpGet(url);

			System.out.println("executing request " + httpget.getURI());

			// 执行get请求.
			CloseableHttpResponse response = httpclient.execute(httpget);

			try {
				// 获取响应实体
				HttpEntity entity = response.getEntity();

				// System.out.println("--------------------------------------");
				// 打印响应状态
				// System.out.println(response.getStatusLine());
				if (entity != null) {
					// 打印响应内容长度
					// System.out.println("Response content length: " + entity.getContentLength());
					// 打印响应内容

					content = EntityUtils.toString(entity);

					// System.out.println("Response content: " + content);
				}
				// System.out.println("------------------------------------");
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return content;
	}

}
