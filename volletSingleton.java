package com.example.partai;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class volletSingleton {

    private static volletSingleton mInstace;
    private RequestQueue requestQueue;
    private static Context mContext;


    public static volletSingleton getInstance(Context context) {
        if (mInstace == null) {
            mInstace = new volletSingleton(context);
        }
        return mInstace;
    }

    private volletSingleton(Context context) {
        mContext = context;

    }

    public<T> void addToRequest(Request request) {
       getRequestQueue().add(request);
    }

    private RequestQueue getRequestQueue() {
        if (requestQueue == null)
            requestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        return  requestQueue;

    }
}
