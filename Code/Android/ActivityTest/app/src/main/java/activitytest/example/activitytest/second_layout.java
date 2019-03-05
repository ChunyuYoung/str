package activitytest.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class second_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);
        Button button = (Button)findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(second_layout.this,"你点击了第二个Activity:second_layout",Toast.LENGTH_LONG).show();
            }
        });
    }
}
