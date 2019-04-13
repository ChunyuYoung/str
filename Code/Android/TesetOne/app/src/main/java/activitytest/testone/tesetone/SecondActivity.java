package activitytest.testone.tesetone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //重写父类方法
        super.onCreate(savedInstanceState);
        //要使用的布局文件
        setContentView(R.layout.second_layout);
        Button button1 = (Button) findViewById(R.id.button_3);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(SecondActivity.this,"点我干嘛!\n 傻fufu的",Toast.LENGTH_SHORT).show();
            }
        });
        //返回
        Button button2 = (Button) findViewById(R.id.button_5);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
