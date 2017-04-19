package com.cyx.weatherapplication.util;

import org.litepal.crud.DataSupport;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by cyx623823 on 2017/3/26.
 */

public class HttpUtil extends DataSupport {
    public static void sendOkHttpRequest(String address , Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
