package com.base.boostyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PsyhologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyhology);
        WebView webView=findViewById(R.id.webweiewpsyhology);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.psychologytoday.com/us/blog/emotional-freedom/201402/three-techniques-read-people");
        WebViewClient webViewClient=new WebViewClient(){
            @SuppressWarnings("deprecation") @Override

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @Override

            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

                view.loadUrl(request.getUrl().toString());

                return true;

            }

        };
        webView.setWebViewClient(webViewClient);
    }
}