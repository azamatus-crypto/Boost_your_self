package com.base.boostyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CharismaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charisma);
        WebView webView=findViewById(R.id.webweiewcharisma);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.hoffeldgroup.com/7-scientifically-proven-ways-to-increase-your-charisma/");
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
