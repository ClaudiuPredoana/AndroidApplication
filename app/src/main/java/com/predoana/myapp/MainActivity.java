package com.predoana.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("myapp","onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("myapp","onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("myapp","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myapp", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myapp", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myapp", "onDestroy");
    }
}