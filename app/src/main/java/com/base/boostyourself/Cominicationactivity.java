package com.base.boostyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cominicationactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cominicationactivity);
        WebView webView=findViewById(R.id.webweiewcomunication);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.right.com.my/wcm/connect/right-us-en/old-home/thoughtwire/categories/career-work/10-Ways-to-Improve-Your-Communication-Skills");
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