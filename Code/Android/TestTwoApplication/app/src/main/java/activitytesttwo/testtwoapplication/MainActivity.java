package activitytesttwo.testtwoapplication;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Toast弹窗
        Button buttonToast = (Button) findViewById(R.id.button1);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Toast",Toast.LENGTH_SHORT).show();
            }
        });

        //Intent 显式打开网页
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.bilibili.com/"));
                startActivity(intent);
            }
        });

        //Intent 显示打开拨号界面并输入号码
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

        //销毁当前活动
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });

        //百度
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com/"));
                startActivity(intent);
            }
        });

        //第二个窗口
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainWorld.class);
                startActivity(intent);
            }
        });
    }

    //显示菜单
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        //显示菜单
        return true;
    }

    //菜单事件
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.menu_item_add:
                Toast.makeText(MainActivity.this,"傻fufu的",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item_remove:
                Toast.makeText(MainActivity.this,"嘎嘎嘎",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item_StringOD:
                Toast.makeText(MainActivity.this,"作者:StringOD",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        //响应菜单项事件
        return true;
    }
}
