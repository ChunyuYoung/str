package activitytesttwo.testtwoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_world);

        //心里话1:
        Button button1 = (Button) findViewById(R.id.button_world_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainWorld.this,"GUI界面:Android的GUI界面代码量相比较Java语言还要多",Toast.LENGTH_LONG).show();
            }
        });

        //心里话2:
        Button button2 = (Button) findViewById(R.id.button_world_2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MainWorld.this,"工程文件结构:资源文件和代码文件的归类性很强,这对初学者是非常不友好的",Toast.LENGTH_LONG).show();
            }
        });

        //心里话3:
        Button button3 = (Button) findViewById(R.id.button_world_3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MainWorld.this,"代码主要分类:天哪,我写了半天的代码感觉我做了半天的网页设计\n\t对象的定义以及布局资源全部在网页里,类文件主要歇一歇事件和方法",Toast.LENGTH_LONG).show();
            }
        });

        //心里话4:
        Button button4 = (Button) findViewById(R.id.button_world_4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MainWorld.this,"复杂程度:非常的不好记忆,而且非常的复杂,首先是Android Studio的界面非常复杂\n\t再就整个编译器非常的庞大启动非常的慢,占用也非常大,代码非常的抽象\n\t如果把Java基础比作小学的数学的话,那么Android程序设计就是大学的数学",Toast.LENGTH_LONG).show();
            }
        });

        //心里话5:
        Button button5 = (Button) findViewById(R.id.button_world_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainWorld.this,"工作量:可以说工作量非常的大,如果你写Java写和我类似一个界面可能只会需要一两百行代码\n\t而如果你用Android写这么一个程序,一两百行完全不够,因为你所看到的第一个页面的布局文件将近100行,这还不算事件\nAndroid程序设计的代码量可以说是写Java代码量的十倍",Toast.LENGTH_LONG).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_world,menu);
        //显示菜单
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.menu_item_StringOD:
                Toast.makeText(MainWorld.this,"干嘛么,人家还要睡觉呢",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.menu_item_world:
                Toast.makeText(MainWorld.this,"目前就只有菜单和菜单项还不太懂",Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_item_world_str233:
                Toast.makeText(MainWorld.this,"大致上已经搞懂了,新知识太多了不好记忆\n 不过目前我还是很开心",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        //显示菜单项
        return true;
    }
}
