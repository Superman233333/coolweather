package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by pc on 2018/1/26.
 */

public class HttpUtil {
    //发起一条http请求,只需调用sendOkHttpRequest方法,传入请求地址,并注册一个回调来处理这种数据
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
