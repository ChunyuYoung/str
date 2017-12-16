package com.hello.str.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)
                findViewById(R.id.TEXT_NAME);
        Pass=(EditText)
                findViewById(R.id.TEST_PASS);
        Button Login=(Button)
                findViewById(R.id.BTN_login);
        login.setOnClickListenter(new)

    }
}
