package com.example.jayesh123.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
   private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        String li;
        li=getIntent().getStringExtra("new_variable_name");
        wv = (WebView) findViewById(R.id.web);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.loadUrl(li);
        wv.setWebViewClient(new WebViewClient());

    }
}
