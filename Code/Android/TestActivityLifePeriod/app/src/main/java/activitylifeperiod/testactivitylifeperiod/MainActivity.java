package activitylifeperiod.testactivitylifeperiod;

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
            String tempDataString = savedInstanceState.getString("dataString");
            Log.d(TAG, tempDataString);
        }

        Button normalActivity = (Button) findViewById(R.id.ButtonNormalActivity);
        normalActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
                Log.d(TAG, "ButtonNormalActivity");
            }
        });

        Button dialogActivity = (Button) findViewById(R.id.ButtonDialogActivity);
        dialogActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
                Log.d(TAG, "ButtonDialogActivity");
            }
        });
    }
    protected void onSaveInstanceState(Bundle outputString){
        super.onSaveInstanceState(outputString);
        String tempDataString = "用户名:StringOD";
        outputString.putString("dataString",tempDataString);
        Log.d(TAG, "onSaveInstanceState");
    }
    
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }
    
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }
    
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }
    
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
