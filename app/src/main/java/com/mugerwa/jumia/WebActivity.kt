package com.mugerwa.jumia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {
    private  lateinit var   webView:WebView
    private   var URL="https://www.jumia.ug"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webView=findViewById(R.id.web)
        webView.apply {
            loadUrl(URL)
            settings.javaScriptEnabled=true
            webViewClient= WebViewClient()
        }
    }

    override fun onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack()
        }
    }
}