package com.fast.android_utils;

import java.io.IOException;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		OkHttpClient mOkHttpClient = new OkHttpClient();
		Request request = new Request.Builder().url("http://www.baidu.com")
				.build();
		Call call = mOkHttpClient.newCall(request);
		call.enqueue(new Callback() {

			@Override
			public void onResponse(Response response) throws IOException {
				// TODO Auto-generated method stub
                Log.i("info",response.body().string());
			}

			@Override
			public void onFailure(Request request, IOException e) {
				// TODO Auto-generated method stub
				  Log.i("info","hehe");
			}
		});
	}
}
