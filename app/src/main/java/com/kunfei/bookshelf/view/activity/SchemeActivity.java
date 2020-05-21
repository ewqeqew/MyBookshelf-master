package com.kunfei.bookshelf.view.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;



public class SchemeActivity extends AppCompatActivity {
    public static final String SCHEME = "jcnyoyo";//scheme
    public static final String HOST = "www.j.cn";//host

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uri = getIntent().getData();
        Log.d("打开了","拦截到");
        if(uri!=null){
            PackageManager packageManager = getPackageManager();
            Intent intent = packageManager.getLaunchIntentForPackage("com.jason.com");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            Log.d("打开了",uri.toString());
        }
//        finish();
    }

}
