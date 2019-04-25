package com.resource.str.resource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Models extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.models_layout);

        final EditText editTextLogin = (EditText) findViewById(R.id.editText);
        final EditText editTextPass = (EditText) findViewById(R.id.editText3);
        final String loginTxt = editTextLogin.getText().toString();
        final String passTxt = editTextPass.getText().toString();

        Button login = (Button) findViewById(R.id.LoginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loginTxt.equals("StringOD") && passTxt.equals("StringOD"))
                    Toast.makeText(Models.this,"Done",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Models.this,"Error",Toast.LENGTH_SHORT).show();
            }
        });

        Button register = (Button) findViewById(R.id.RegisterButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextLogin.equals(null) || editTextPass.equals(null) || editTextLogin.equals("") || editTextPass.equals(""))
                    Toast.makeText(Models.this, "Error", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Models.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
