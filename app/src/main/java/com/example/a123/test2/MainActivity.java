package com.example.a123.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG="Logcat";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Log.d Debug test");
        Log.e(TAG, "Log.e Error test");
        Log.v(TAG, "Log.v Verbose test");
        Log.w(TAG, "Log.w Warning test ");
        Log.i(TAG, "Log.i Info test");
    }
}
