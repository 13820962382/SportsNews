package com.example.administrator.sportsnews.api;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/2/26.
 */

public class OkhttpUtil {
    private static OkHttpClient client;
    private static OkhttpUtil instance;

    private OkhttpUtil() {
        client = new OkHttpClient();
    }

    public static synchronized OkhttpUtil getInstance() {
        if (instance == null) {
            instance = new OkhttpUtil();
        }
        return instance;
    }

    public Call getCall(String url) {
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        Call call = client.newCall(request);
        return call;
    }
}
