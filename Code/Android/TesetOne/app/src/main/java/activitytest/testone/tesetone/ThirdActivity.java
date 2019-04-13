package activitytest.testone.tesetone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        Button button1 = (Button) findViewById(R.id.button_6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  //显示
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("https://www.52pojie.cn/"));
                startActivity(intent);

            }
        });
        Button button2 = (Button) findViewById(R.id.button_7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //打电话
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

    }
}
