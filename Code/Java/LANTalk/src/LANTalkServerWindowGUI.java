import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.net.ServerSocket;
import javax.swing.*;


public class LANTalkServerWindowGUI extends JFrame implements ActionListener,Runnable{
    JLabel splitLine;
    JTextArea text;
    JTextField txt;
    JButton Enter,Close;
    GridLayout gridLayout;
    FlowLayout flowLayout;
    BorderLayout borderLayout;

    public LANTalkServerWindowGUI(){
        //窗口标题为获取对方的IP
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        validate();             //刷新边界
        setResizable(true);     //固定边界

        //初始化面板
        JPanel panel = new JPanel(new GridLayout(4,1));
        JPanel panel4 = new JPanel(new FlowLayout());

        //初始化控件对象
        text = new JTextArea(5,20);
        splitLine = new JLabel("分割线");
        txt = new JTextField(20);
        Enter = new JButton("发送");
        Close = new JButton("关闭");
        gridLayout = new GridLayout();
        borderLayout = new BorderLayout();
        flowLayout = new FlowLayout();

        //添加面板到容器
        getContentPane().add(panel);

        //添加控件对象到容器
        //调整布局边界
        panel.add(new JScrollPane(text));
        gridLayout = new GridLayout(1,1);
        panel.add(splitLine,gridLayout);
        gridLayout.setRows(2);
        panel.add(txt);
        panel.add(panel4);
        panel4.add(Close);
        panel4.add(Enter);

        //服务器和客户端将采用Server/Client Mode
    }

    public void actionPerformed(ActionEvent e){

    }

    public void run(){

    }
}
