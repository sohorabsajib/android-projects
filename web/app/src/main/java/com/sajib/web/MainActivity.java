package com.sajib.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webWb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webWb=findViewById(R.id.webWb);
        WebSettings webSettings =webWb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webWb.setWebViewClient(new WebViewClient());
        webWb.loadUrl("https://sites.google.com/view/sohorabhossaain");
    }
}
