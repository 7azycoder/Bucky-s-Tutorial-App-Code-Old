package com.lovepreetsingh.myapplication;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lovepreet Singh on 06-04-2015.
 */
public class ourViewClient extends WebViewClient {
@Override
    public boolean shouldOverrideUrlLoading(WebView v, String url){
        v.loadUrl(url);
        return true;
}
}
