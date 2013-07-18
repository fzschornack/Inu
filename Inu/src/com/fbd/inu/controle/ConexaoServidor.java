package com.fbd.inu.controle;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class ConexaoServidor {

	/**
	 * @param args
	 */
	public static HttpResponse enviarPost(String uri, String json) {
	    try {
	        HttpPost httpPost = new HttpPost(uri);
	        httpPost.setEntity(new StringEntity(json));
	        //httpPost.setHeader("Accept", "application/json");
	        //httpPost.setHeader("Content-type", "application/json");
	        return new DefaultHttpClient().execute(httpPost);
	    } catch (UnsupportedEncodingException e) {
	        e.printStackTrace();
	    } catch (ClientProtocolException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	} 

}
