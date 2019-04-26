package com.datapreservationrecovery.datarecovery.datapreservationrecovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static String TAG = ".MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Log.d(TAG, "onCreate");
        
        if (savedInstanceState != null){
            String tempData = savedInstanceState.getString("data");
            Log.d(TAG, tempData);
        }

        Button normalActivity = (Button) findViewById(R.id.ButtonNormal);
        normalActivity.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent intent = new Intent(MainActivity.this,NormalActivity.class);
               startActivity(intent);
           }
        });

        Button dialogActivity = (Button) findViewById(R.id.ButtonDialog);
        dialogActivity.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent intent = new Intent(MainActivity.this,DialogActivity.class);
               startActivity(intent);
           }
        });
    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String tempData = "你输入的内容";
        outState.putString("data",tempData);
        Log.d(TAG, "onSaveInstanceState");
    }
    
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }
    
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }
    
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }
    
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }
    
    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
    
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
