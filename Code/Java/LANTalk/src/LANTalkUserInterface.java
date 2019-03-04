import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Flow;

public class LANTalkUserInterface extends JFrame implements ActionListener{
    //声明控件对象
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JLabel name;
    JLabel personalInformation;
    JLabel onlineDate;
    JLabel imageFaceLabel;
    ImageIcon imageFace;
    JTextField search;
    InetAddress inetAddress;
    FlowLayout flowLayout;
    BorderLayout borderLayout;
    GridLayout gridLayout;
    Thread thread;      //监测非法调整布局尺寸
    //声明变量
    String str[] = {"日间主题","夜间主题"};

    public LANTalkUserInterface(){
        //初始化窗体参数
        super("LANTalk");
        setSize(350,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);    //固定边界
        validate();         //刷新布局

        //初始化面板对象
        JPanel panel = new JPanel(new GridLayout(4,1));
        JPanel upPanel = new JPanel(new GridLayout(1,1));       //第一层
        JPanel upPanelNest = new JPanel(new GridLayout(1,3));   //第一层第二列嵌套布局
        JPanel centerPanel = new JPanel(new GridLayout(1,1));
        JPanel downPanel = new JPanel(new GridLayout(1,1));

        //初始化控件对象
        //菜单条
        menuBar = new JMenuBar();
        menu = new JMenu();
        menuItem = new JMenuItem();
        //标签
        name = new JLabel("本机IP");
        personalInformation = new JLabel("本机域名");
        onlineDate = new JLabel("SVIP8");
        //图片
        imageFace = new ImageIcon("imageFace.jpg");
        imageFaceLabel = new JLabel(imageFace);
        //编辑框
        search = new JTextField(25);

        String str = "",strIP="",strName="";    //获取本地域名和IP,IP地址,本机域名
        int number = 0;
        try{
            inetAddress = InetAddress.getLocalHost();       //获取本机域名和IP地址
            str = inetAddress.toString();

            //字符串中/第一次出现的位置
            ArrayList<String> s = new ArrayList<>();
            boolean b = true;
            while(b){
                number = str.indexOf("/");
                if (number != 0)
                    b = false;
            }
//            System.out.println(number);     //输出/首次出现的位置
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }

        //截取IP地址
        char chIP[] = str.toCharArray();
        //因为截取字符串时会截取被截取字符之前,所以在这里必须要+1是为了让程序截取被截取字符之后,长度减一保证不会抛出数组月季的异常
        strIP = String.valueOf(chIP,number+1,str.length()-number-1);
//        System.out.println(strIP);      //验证截取到的IP地址

        //截取本地域名
        char chHostName[] = str.toCharArray();
        strName = String.valueOf(chHostName,0,number);
//        System.out.println(strName);       //验证截取到的本地域名

        //Name标签赋值
        name.setText("IP:"+strIP);
        //personalInformation标签赋值
        personalInformation.setText("Name:"+strName);


        //添加面板到布局
        getContentPane().add(panel);
        panel.add(upPanel);
        panel.add(upPanelNest);
        panel.add(centerPanel);
        panel.add(downPanel);

        //添加控件到面板
        //第一层
        gridLayout = new GridLayout(1,3);
        gridLayout.setRows(2);
        upPanel.setLayout(gridLayout);
        upPanel.add(new JScrollPane(imageFaceLabel),BorderLayout.WEST);
        upPanel.add(new JScrollPane(name),BorderLayout.CENTER);
        upPanel.add(personalInformation);
        //第二层
        gridLayout = new GridLayout(1,1);
        gridLayout.setRows(4);
        upPanelNest.setLayout(gridLayout);
        upPanelNest.add(new JScrollPane(search),BorderLayout.CENTER);
        //第三层
        //未使用
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(new Button("待添加"),BorderLayout.CENTER);
        //第四层
        //未使用
        downPanel.setLayout(new FlowLayout());
        downPanel.add(new Label("待添加底部菜单"));

    }

    public void actionPerformed(ActionEvent e){

    }

}
