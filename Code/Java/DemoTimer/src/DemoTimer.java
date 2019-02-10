import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DemoTimer extends JFrame implements ActionListener{
    JButton jStart,jPause,jStop;
    JTextField txt;
    Timer time;
    SimpleDateFormat timerFormat;
    DemoTimer(){
        //初始化窗体参数
        super("计时器");
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());    //流式布局
        time = new Timer(1000,this);
        timerFormat = new SimpleDateFormat("hh:mm:ss");
        jStart = new JButton("Start");
        jPause = new JButton("Pause");
        jStop = new JButton("Stop");
        txt = new JTextField(20);
        getContentPane().add(jStart);
        getContentPane().add(jPause);
        getContentPane().add(jStop);
        getContentPane().add(txt);
        //绑定监听对象
        jStart.addActionListener(this);
        jPause.addActionListener(this);
        jStop.addActionListener(this);
        txt.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(time)){
            Date date = new Date();
            txt.setText("时间:"+timerFormat.format(date));
            int x = txt.getBounds().x;
            x+=10;
            txt.setLocation(x,txt.getBounds().y);
        }
        else if(e.getSource().equals(jStart))
            time.start();   //启动线程
        else if(e.getSource().equals(jPause))
            time.restart(); //恢复线程
        else if(e.getSource().equals(jStop))
            time.stop();    //暂停线程
    }
}
