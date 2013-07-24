package com.fbd.inu.controle;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class ConexaoServidor extends AsyncTask<String, Void, Void> {

	/**
	 * @param args
	 */
	public static void enviarPost(String uri) {
		
	}

	@Override
	protected Void doInBackground(String... urls) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(urls[0]);
		try {
			HttpResponse response = httpclient.execute(httpget);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 

}
