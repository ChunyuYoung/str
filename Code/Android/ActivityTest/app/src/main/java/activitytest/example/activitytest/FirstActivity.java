package activitytest.example.activitytest;

import android.content.Intent;
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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //参数:context就是Toast要请求的上下文
                //第二个参数是toast要显示的文本
                //第三个参数是Toast显示的时间长度,short和long就是显示的时间长短
                Toast.makeText(FirstActivity.this,"你点击了Button 1",Toast.LENGTH_SHORT).show();    //必须加show不然不显示
                finish();   //销毁当前活动
            }
        });
        Button button2 = (Button)findViewById(R.id.Button_start);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //实例化Intent对象
                //参数1:当前活动的Activity
                //参数2:跳转/调用的Activity
                Intent intent = new Intent(FirstActivity.this,second_layout.class);
                //启动要调用的Activity
                startActivity(intent);
            }
        });

    }
    //显示菜单
    public boolean onCreateOptionsMenu(Menu menu){      //如果方法显示的是暗灰色则说明单词写错了,程序运行不会有预期那样的效果
        //给当前活动创建菜单
        //参数1:指定那个资源文件夹创建菜单
        //参数2:指定我们的菜单项将添加到哪一个Menu对象当中
        //return true 表示允许创建的菜单显示出来,如果返回false创建的菜单将无法显示
        getMenuInflater().inflate(R.menu.main,menu);
        return true;    //返回true显示菜单
    }
    //绑定菜单事件响应
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"你点击了Add按钮",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击了Remove按钮",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;    //返回true显示菜单项
    }
}
