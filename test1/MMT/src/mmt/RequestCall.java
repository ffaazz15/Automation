package mmt;

import org.asynchttpclient.Response;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

//OKHTTP
public class RequestCall {
	OkHttpClient client = new OkHttpClient();

	Request request = new Request.Builder()
	                     .url("https://www.neovasolutions.com/")
	                     .build();
}


