package activitytest.testone.tesetone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //项目中的任何活动都应该重写Activity的onCreate()方法
        super.onCreate(savedInstanceState);
        //给当前活动加载一个布局
        setContentView(R.layout.first_layout);
        //在活动中使用Toast消息弹窗
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "你点击了按钮1", Toast.LENGTH_SHORT).show();
            }
        });

        //销毁活动
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });

        //启动第二个活动
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                  //显示Intent
                //一般用于活动的启动,第一个参数是启动活动的上下文,第二个参数是目标活动Class
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //Activity类中提供了用于启动活动的方法,因为FirstActivity主活动类继承与Activity父类,所以可以使用这个方法
                startActivity(intent);

//                  //隐式Intent
//                Intent intent = new Intent("activitytest.testone.testone.ACTION_START");
//                intent.addCategory("activitytest.testone.teston.MY_CATEGORY");
//                startActivity(intent);

//                //隐式Intent
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                //调用系统浏览器打开B站
//                intent.setData(Uri.parse("https://www.bilibili.com/"));
//                startActivity(intent);
            }
        });
    }

    //添加菜单
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;        //允许菜单项目显示
    }

    //菜单响应事件
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"你点击了添加菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击移除菜单项",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;   //允许显示菜单项事件
    }
}
