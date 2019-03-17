# Java小白制作局域网聊天程序LANTalk(未完成的项目)
***
## 前言
1. **LANTalk**是我为了综合我们上学期开课的Java知识以及后来寒假自学的一些知识总结的一个成果.
2. 预计开发引入的知识:数据库,多线程,网络基础,对象克隆,对象序列化,布局,数据结构,文件流,正则表达式
3. 事实上所使用的知识:多线程,网络基础,布局,数据结构,文件流
4. 遇到的问题:之前买了一本书看,但是那本书错误特别多,尤其是在JDBC数据库例子错的一塌糊涂,根本运行不出来.之前学校教的SQLSERVER也没怎么学.
5. 本来打算是在**LANTalkUserInterface**再写一个好友列表,本来打算的是对象克隆,但是克隆的前提是得new一个对象,这就导致了当窗体载入是new的对象就直接运行了,由于技术能力没法解决.最后又想着要不用下拉框吧,但最后决定还是算了吧,因为那个必须点了它之后才会出来列表,影响美观,最后又想着是会不会有那么一个类能实现类似Win10更改环境变量那里的那个编辑框,,多行编辑框,一行和一行不冲突,,但最后想了一下还是算了吧.
6. 虽然这个**LANTalkUserInterface**类没有实现添加好友列表的功能,但是我在测试的**LANTalkServerWindowGUI**和**LANTalkClientWindowGUI**里面已经实现了更改IP地址和发送接收端口的功能.
7. 值得一提的是**LANTalkServerWindowGUI**类默认的发送端口和接收端口正好和**LANTalkClientWindowGUI**是相反的,并且这两个类默认的IP地址是本机的IP地址,在这里我是通过```InetAddress.getLocalHost().getHostAddress()```实现的.
8. 有趣的是我一开始并不知道代码还能这样写```InetAddress.getLocalHost().getHostAddress()```就是它能掉两个属性出来,再知道这个之前我自己实现了一个类**LANTalkGetLocalHost**用来分解```InetAddress.getLocalAddress()```所获取到的域名/IP地址.
9. 通过这个未完成的项目,我对一些基础知识的用法认识的更加深刻.
10. 在写这个项目的途中我遇到了很多的问题:布局嵌套的乱七八糟,多线程写的程序总是抛异常,向文件写入内容不会换行,类和类的传参被子类覆盖导致程序运行总是奇奇怪怪的...
11. **这个项目我目前没有时间在写下去了,虽然我还有许许多多的想法.但是最近还有比赛,得去刷题.**
12. 学习Java的时间很短也就一学期再加上这次寒假一个月多的时间,这个程序算是我这么久的一个能力指标吧,这个程序分享给一些像我一样的小白.
***
## 已知BUG
1. 当用户界面加载时,打开一个或多个聊天窗口,然后在关闭,再打开就会提示端口被占用.
* **解决方法:**重新启动程序即可
2. 在聊天窗口发送内容和接收内容显示的时间是固定的不会改变.
3. 在登录界面输入错误的信息不会被提醒需要注册或登录失败等提示.
***
## 项目期望
1. 想做一个类似QQ那样的局域网聊天软件,当时布局设计就是按照QQ做的(后期遇到技术问题,无法解决)
2. 能像QQ用户界面那样有菜单栏和一些登陆天数,一些信息
***
## 附上代码
``` Java
//主类入口
public class LANTalkMain {
    public static void main(String args[]){
//        //测试:从登陆界面启动
        LANTalkLoginWindowGUI win = new LANTalkLoginWindowGUI();
        win.validate();

//        //调试:直接加载用户界面
//        LANTalkUserInterface win = new LANTalkUserInterface();
//        win.validate();

//        //调试:直接加载服务器端
//        LANTalkServerWindowGUI server = new LANTalkServerWindowGUI();
//        server.validate();     //刷新实例化对象的布局
    }
}

//------------------------------我是分割线------------------------------

//用户注册类
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LANTalkRegisterWindowGUI extends JFrame implements ActionListener{
    //声明控件对象
    JLabel name,password,enterPassword;
    JTextField nameText;
    JPasswordField passwordText,enterPasswordText;
    JButton registerJButton;

    public LANTalkRegisterWindowGUI(){
        //初始化窗体参数
        super("注册");
        setVisible(true);
        setSize(300,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(true);    //固定边界
        validate();     //刷新布局

        //初始化面板对象
        JPanel panel = new JPanel(new GridLayout(4,1));
        JPanel panelName = new JPanel(new GridLayout(1,2));
        JPanel panelPassword = new JPanel(new GridLayout(1,2));
        JPanel panelEnterPassword = new JPanel(new GridLayout(1,2));
        JPanel panelRegisterButton = new JPanel(new FlowLayout());

        //初始化控件对象
        //标签
        name = new JLabel("账号");
        password = new JLabel("密码");
        enterPassword = new JLabel("确认密码");
        //文本框
        nameText = new JTextField(30);
        passwordText = new JPasswordField(30);
        enterPasswordText = new JPasswordField(30);
        //按钮
        registerJButton = new JButton("注册");

        //添加面板到容器
        getContentPane().add(panel);
        panel.add(panelName);
        panel.add(panelPassword);
        panel.add(panelEnterPassword);
        panel.add(panelRegisterButton);

        //添加控件到面板
        //账号
        panelName.add(name);
        panelName.add(nameText);
        //密码
        panelPassword.add(password);
        panelPassword.add(passwordText);
        //确认密码
        panelEnterPassword.add(enterPassword);
        panelEnterPassword.add(enterPasswordText);
        //注册按钮
        panelRegisterButton.add(new JScrollPane(registerJButton));

        //初始化密码文本框参数
        passwordText.setEchoChar('*');
        enterPasswordText.setEchoChar('*');

        //绑定监听对象
        registerJButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //注册按钮发生事件
        if (e.getSource().equals(registerJButton)){
            try{
                File file = new File("ConfigurationInformation.txt");
                FileWriter fileWriter = new FileWriter(file);

                //判断账号,密码和确认密码是否为空
                String pass = String.valueOf(passwordText.getPassword()) ;
                String enterPass = String.valueOf(enterPasswordText.getPassword());
                String name = nameText.getText();

                //账号不为空
                if (name != ""){
                    //密码个确认密码不为空
                    if (pass != "" && enterPass != ""){
                        //密码和确认密码相等
                        if (pass.equals(enterPass)){
                            fileWriter.write(name+" "+enterPass);
                            fileWriter.flush();
                            JOptionPane.showMessageDialog(this,"注册成功","信息",JOptionPane.INFORMATION_MESSAGE);
                            setVisible(false);  //隐藏窗体
                        }
                    }
                }

            }
            catch (FileNotFoundException e1){
                JOptionPane.showMessageDialog(this,"程序在创建文件时发生了错误","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException e1){
                JOptionPane.showMessageDialog(this,"程序向文件写入数据发生了错误","错误",JOptionPane.ERROR_MESSAGE);
            }

        }
    }

}

//------------------------------我是分割线------------------------------

//用户登陆类
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JPanel;

public class LANTalkLoginWindowGUI extends JFrame implements ActionListener{
    //声明控件对象
    JLabel name,password;
    JTextField nameText;
    JPasswordField passwordText;
    JButton loginJButton,registerJButton;

    public LANTalkLoginWindowGUI(){
        //初始化窗体参数
        super("登陆");
        setSize(250,125);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);    //固定边界

        //初始化面板对象
        JPanel panel = new JPanel(new GridLayout(3,1));
        JPanel namePanel = new JPanel(new GridLayout(1,2));
        JPanel passwordPanel = new JPanel(new GridLayout(1,2));
        JPanel loginRegisterPanel = new JPanel(new FlowLayout());

        //初始化控件对象
        //标签
        name = new JLabel("账号");
        password = new JLabel("密码");
        //文本框
        nameText = new JTextField(20);
        //密码框
        passwordText = new JPasswordField(20);
        //按钮
        registerJButton = new JButton("注册");
        loginJButton = new JButton("登陆");

        //添加面板到容器
        getContentPane().add(panel);
        panel.add(namePanel);
        panel.add(passwordPanel);
        panel.add(loginRegisterPanel);

        //添加控件到面板
        //账号
        namePanel.add(name);
        namePanel.add(nameText);
        //密码
        passwordPanel.add(password);
        passwordPanel.add(passwordText);
        //按钮
        loginRegisterPanel.setLayout(new FlowLayout());
        loginRegisterPanel.add(new JScrollPane(loginJButton));
        loginRegisterPanel.add(new JScrollPane(registerJButton));

        //初始化密码文本框参数
        passwordText.setEchoChar('*');

        //绑定监听对象
        registerJButton.addActionListener(this);
        loginJButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //注册按钮发生事件
        if (e.getSource().equals(registerJButton)){
            //如果没有注册账户并且填写了信息,当点击注册按钮时清空登陆界面的已填写的信息
            nameText.setText("");
            passwordText.setText("");
            //跳转到注册界面
            new LANTalkRegisterWindowGUI();
        }

        //登陆按钮发生事件
        if (e.getSource().equals(loginJButton)){
            //声明账号和密码
            String name = null,password = null;
            File file = new File("ConfigurationInformation.txt");

            try{
                Scanner scanner = new Scanner(file);
                //读取账号和密码
                while(scanner.hasNext()){
                    name = scanner.next();
                    password = scanner.next();
                }
            }
            catch (FileNotFoundException e1){
                JOptionPane.showMessageDialog(this,"还没有注册账号","信息",JOptionPane.INFORMATION_MESSAGE);
            }

            //判断账号和密码是否合法
            String loginPass = String.valueOf(passwordText.getPassword());
            //从文件读取到的字符串如果要和在当前界面下的文本框中的字符串对比,则需要将文本框中的字符串赋值给一个变量,在进行比较
            String loginName = nameText.getText();
            //账号和密码不为空
            if (loginName != "" && loginPass != ""){
                //两个字符串在进行比较是否相等时尽量用equals方法,如果用==会产生一些问题
                if (loginName.equals(name) && loginPass.equals(password)){
                    JOptionPane.showMessageDialog(this,"登陆成功","信息",JOptionPane.INFORMATION_MESSAGE);
                    //隐藏窗体
                    setVisible(false);
                    
                    //跳转界面
                    LANTalkLoadingUserInterface lanTalkLoadingUserInterface = new LANTalkLoadingUserInterface();
                    lanTalkLoadingUserInterface.validate();     //刷新布局
                }
            }
        }
    }
}

//------------------------------我是分割线------------------------------

//用户界面加载类
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import static java.lang.Thread.sleep;

public class LANTalkLoadingUserInterface extends JFrame implements Runnable{
    //声明控件对象
    ImageIcon backImage = new ImageIcon();
    JLabel back;
    Thread thread;
    public LANTalkLoadingUserInterface(){
        //初始化窗体参数
        super("正在登陆");
        setSize(533,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        validate();
        setResizable(false);

        //初始化控件对象参数
        backImage = new ImageIcon("LANTalkLoading_.gif");
        back = new JLabel(backImage);

        //初始化面板
        JPanel panel = new JPanel(new BorderLayout());

        //添加面板到容器
        getContentPane().add(panel);
        panel.add(back);

        //初始化并启动线程
        thread = new Thread(this);
        thread.start();
    }
    //如果把sleep放在构造函数会导致窗体界面的Lable的背景图无法加载
    public void run(){
        int n= 0;
        //动态图长度10秒
        while(n<10){
            n++;
            try{
                sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            if ((n*10) > 100){
                n = 100;
            }
            setTitle("正在加载:"+n*10+"%");
        }

        //如果这里匿名实例化对象,就不能刷新被调用窗口的布局,就会导致界面可能出现什么都没有
        LANTalkUserInterface lanTalkUserInterface = new LANTalkUserInterface();
        lanTalkUserInterface.validate();

        //当被调用的窗口启动时隐藏当前界面
        setVisible(false);
    }
}

//------------------------------我是分割线------------------------------

//用户界面类
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LANTalkUserInterface extends JFrame implements ActionListener{

    //声明控件对象
    JLabel name;
    JLabel personalInformation;
    JLabel onlineDate;
    JLabel imageFaceLabel;
    ImageIcon imageFace;
    JTextField search;
    //菜单栏
    JMenuBar ThemeMenuBar;
    JMenu Theme;
    JMenuItem light;
    JMenuItem dark;
    //面板
    JPanel panel1,panel1_1,panel2,panel2_2,panel3,panel4,panel4_1;

    //声明IP地址和域名
    String LANName,LANIp;

    //声明添加的IP和设置的端口
    String strIp;
    int port;

    //盒式布局
    Box box;

    //添加IP和设置端口
    JButton addIp,setPort,enterAdd;

    //测试好友
    JButton testServer = new JButton("Test:   LANTalkClientWindowGUI"),
            testClient = new JButton("Test:   LANTalkServerWindowGUI");

    //声明子主题全局静态常量
    public static boolean subTheme = false;       //浅色主题

    boolean backColor = false;

    public LANTalkUserInterface(){

        //初始化窗体参数
        super("LANTalk");
        setSize(250,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);    //固定边界
        validate();             //刷新布局

        //初始化控件对象
        //标签
        name = new JLabel("本机IP");
        personalInformation = new JLabel("本机域名");
        onlineDate = new JLabel("SVIP8");
        //图片
        imageFace = new ImageIcon("imageFace.jpg");
        imageFaceLabel = new JLabel(imageFace);
        //编辑框
        search = new JTextField(20);
        //添加IP
        addIp = new JButton("AddIp");
        //设置端口
        setPort = new JButton("SetPort");
        //确认添加好友
        enterAdd = new JButton("Enter");

        //菜单栏
        ThemeMenuBar = new JMenuBar();
        //主题
        Theme = new JMenu("主题");
        light = new JMenuItem("浅色");
        dark = new JMenuItem("深色");
        setJMenuBar(ThemeMenuBar);
        ThemeMenuBar.add(Theme);
        Theme.add(light);
        Theme.add(dark);

        //获取本地IP及域名
        try{
            //实例化客户端IP地址和域名字符串的分解实例
            LANTalkGetLocalHost lanTalkGetLocalHost = new LANTalkGetLocalHost(InetAddress.getLocalHost().toString());
            LANIp = lanTalkGetLocalHost.getStrIP();
            LANName = lanTalkGetLocalHost.getStrNmae();
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog(this,"无法获取本地IP地址","错误",JOptionPane.ERROR_MESSAGE);
        }

        //获取分解IP和域名
        name.setText(LANIp);
        personalInformation.setText(LANName);

        //初始化盒式布局
        box = Box.createVerticalBox();
        getContentPane().add(box);
        panel1 = new JPanel(new GridLayout(1,2));
        box.add(panel1);
        panel1.add(imageFaceLabel);
        panel1_1 = new JPanel(new GridLayout(2,1));
        panel1.add(panel1_1);
//        panel1_1.add(new JLabel(LANName));
//        panel1_1.add(new JLabel(LANIp));
        panel1_1.add(name);
        panel1_1.add(personalInformation);
        panel2 = new JPanel(new BorderLayout());
        panel2_2 = new JPanel(new FlowLayout());
        box.add(panel2);
        panel2.add(panel2_2);
        panel2_2.add(search);
        panel3 = new JPanel(new FlowLayout());
        box.add(panel3);
        panel3.add(addIp);
        panel3.add(setPort);
        panel3.add(enterAdd);
        panel4 = new JPanel(new GridLayout());
        box.add(panel4);
        panel4.add(testClient);
        panel4_1 = new JPanel(new GridLayout());
        box.add(panel4_1);
        panel4_1.add(testServer);

        //绑定监听事件
        testClient.addActionListener(this);
        testServer.addActionListener(this);
        addIp.addActionListener(this);
        setPort.addActionListener(this);
        enterAdd.addActionListener(this);
        dark.addActionListener(this);
        light.addActionListener(this);

        //默认浅色主题
        if (getContentPane().getBackground() != Color.white){
            //panel1,panel1_1,panel2,panel2_2,panel3,panel4,panel4_1;
            panel1.setBackground(Color.white);
            panel1_1.setBackground(Color.white);
            panel2.setBackground(Color.white);
            panel2_2.setBackground(Color.white);
            panel3.setBackground(Color.white);
            panel4.setBackground(Color.white);
            panel4_1.setBackground(Color.white);
            //search,name,personalInformation,ThemeMenuBar,Theme,light,dark
            search.setBackground(Color.white);
            search.setForeground(Color.black);
            name.setBackground(Color.white);
            name.setForeground(Color.black);
            personalInformation.setBackground(Color.white);
            personalInformation.setForeground(Color.black);
            ThemeMenuBar.setBackground(Color.white);
            Theme.setForeground(Color.black);
            light.setBackground(Color.white);
            light.setForeground(Color.black);
            dark.setBackground(Color.white);
            dark.setForeground(Color.black);
            //AddIp,SetPort,enterAdd,testServer,testClient
            addIp.setBackground(Color.white);
            addIp.setForeground(Color.black);
            setPort.setBackground(Color.white);
            setPort.setForeground(Color.black);
            enterAdd.setBackground(Color.white);
            enterAdd.setForeground(Color.black);
            testServer.setBackground(Color.white);
            testServer.setForeground(Color.black);
            testClient.setBackground(Color.white);
            testClient.setForeground(Color.black);
        }
    }
    //事件源处理
    public void actionPerformed(ActionEvent e){

        //深色的主题
        if (e.getSource().equals(dark)){
            //panel1,panel1_1,panel2,panel2_2,panel3,panel4,panel4_1;
            panel1.setBackground(new Color(22,22,22));
            panel1_1.setBackground(new Color(22,22,22));
            panel2.setBackground(new Color(22,22,22));
            panel2_2.setBackground(new Color(22,22,22));
            panel3.setBackground(new Color(22,22,22));
            panel4.setBackground(new Color(22,22,22));
            panel4_1.setBackground(new Color(22,22,22));
            //search,name,personalInformation,ThemeMenuBar,Theme,light,dark
            search.setBackground(new Color(22,22,22));
            search.setForeground(Color.GREEN);
            name.setForeground(Color.GREEN);
            personalInformation.setForeground(Color.GREEN);
            ThemeMenuBar.setBackground(new Color(22,22,22));
            Theme.setForeground(Color.GREEN);
            light.setForeground(Color.GREEN);
            light.setBackground(new Color(22,22,22));
            dark.setForeground(Color.GREEN);
            dark.setBackground(new Color(22,22,22));
            //AddIp,SetPort,enterAdd,testServer,testClient
            addIp.setBackground(new Color(22,22,22));
            addIp.setForeground(Color.GREEN);
            setPort.setBackground(new Color(22,22,22));
            setPort.setForeground(Color.GREEN);
            enterAdd.setBackground(new Color(22,22,22));
            enterAdd.setForeground(Color.GREEN);
            testServer.setBackground(new Color(22,22,22));
            testServer.setForeground(Color.GREEN);
            testClient.setBackground(new Color(22,22,22));
            testClient.setForeground(Color.GREEN);

            //深色主题
            subTheme = true;
        }

        //浅色主题
        if (e.getSource().equals(light)){
            //panel1,panel1_1,panel2,panel2_2,panel3,panel4,panel4_1;
            panel1.setBackground(Color.white);
            panel1_1.setBackground(Color.white);
            panel2.setBackground(Color.white);
            panel2_2.setBackground(Color.white);
            panel3.setBackground(Color.white);
            panel4.setBackground(Color.white);
            panel4_1.setBackground(Color.white);
            //search,name,personalInformation,ThemeMenuBar,Theme,light,dark
            search.setBackground(Color.white);
            search.setForeground(Color.black);
            name.setBackground(Color.white);
            name.setForeground(Color.black);
            personalInformation.setBackground(Color.white);
            personalInformation.setForeground(Color.black);
            ThemeMenuBar.setBackground(Color.white);
            Theme.setForeground(Color.black);
            light.setBackground(Color.white);
            light.setForeground(Color.black);
            dark.setBackground(Color.white);
            dark.setForeground(Color.black);
            //AddIp,SetPort,enterAdd,testServer,testClient
            addIp.setBackground(Color.white);
            addIp.setForeground(Color.black);
            setPort.setBackground(Color.white);
            setPort.setForeground(Color.black);
            enterAdd.setBackground(Color.white);
            enterAdd.setForeground(Color.black);
            testServer.setBackground(Color.white);
            testServer.setForeground(Color.black);
            testClient.setBackground(Color.white);
            testClient.setForeground(Color.black);

            //浅色主题
            subTheme = false;
        }

        //添加用户到列表
        if (e.getSource().equals(enterAdd)){
            //创建用户列表
            File file = new File("UsersList.txt");
            try{
                Scanner scanner = new Scanner(file);
            }
            catch (FileNotFoundException e1){
                JOptionPane.showMessageDialog(this,"找不到UsersList.txt","错误",JOptionPane.ERROR_MESSAGE);
            }
        }

        //测试服务器
        if (e.getSource().equals(testClient))
            new LANTalkServerWindowGUI();

        //测试客户端
        if (e.getSource().equals(testServer))
            new LANTalkClientWindowGUI();

        //添加好友
        if (e.getSource().equals(addIp)){
            //获取输入的IP地址
            strIp = JOptionPane.showInputDialog(this,"请输入要添加的IP地址","信息:添加好友",JOptionPane.PLAIN_MESSAGE);
        }

        //设置端口
        if (e.getSource().equals(setPort)){
            //设置端口
            String strPort = JOptionPane.showInputDialog(this,"请输入要设置的端口号(1024-65535)","信息:设置端口",JOptionPane.PLAIN_MESSAGE);
            try{
                port = Integer.valueOf(strPort);
            }
            catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(this,"端口号不能为空","错误",JOptionPane.ERROR_MESSAGE);
            }
        }

        //确认添加好友,克隆对象
        if (e.getSource().equals(enterAdd)){
//            //保存对象
//            LANTalkServerWindowGUI lanTalkServerWindowGUI = new LANTalkServerWindowGUI();
//            File file = new File("DemoFriendsListObjectClone.txt");
//            try{
//                FileOutputStream out = new FileOutputStream(file);
//                ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
//                objectOutputStream.writeObject(lanTalkServerWindowGUI);
//                FileInputStream in = new FileInputStream(file);
//                ObjectInputStream objectInputStream = new ObjectInputStream(in);
//                LANTalkServerWindowGUI ClonelanTalkServerWindowGUI = (LANTalkServerWindowGUI)objectInputStream.readObject();
//                //设置名称为addIp
//                //设置端口
//            }
//            catch (FileNotFoundException e1){
//                JOptionPane.showMessageDialog(this,"找不到DemoFriendsListObjectClone.txt","错误",JOptionPane.ERROR_MESSAGE);
//            }
//            catch (IOException e1){
//                JOptionPane.showMessageDialog(this,"对象写入失败","错误",JOptionPane.ERROR_MESSAGE);
//            }
//            catch (ClassNotFoundException e1){
//                JOptionPane.showMessageDialog(this,"读入对象时发生错误","错误",JOptionPane.ERROR_MESSAGE);
//            }

        }
    }
}

//------------------------------我是分割线------------------------------

//InetAddress.getLocalHost()IP地址和本地域名分解类
/*
如果被LANTalkServerWindowGUI和LANTalkClientWindowGUI调用则会发生异常
异常信息:套接字无法绑定端口
猜测:应该是IP地址回传的问题,但是用输出函数测试没问题
目前LANTalkGetLocalHost.getStrIp()被InetAddress.getLocalHost().getHostAddress()所代替
此类仍被LANTalkUserInterface所使用
 */
public class LANTalkGetLocalHost {

    //如果直接给字符串赋值为""或者null会直接导致传参的变量被覆盖,导致程序抛出异常
    private String str;        //获取要分割的字符串
    private String strIP;      //获取IP地址
    private String strNmae;    //获取本机域名
    private int number;         //获取/第一次出现的位置
    private char chIP[];        //获取IP数组
    private char chHostName[];  //获取本地域名

    public LANTalkGetLocalHost(String str){
        this.str = str;
        chIP = str.toCharArray();
        chHostName = str.toCharArray();

        //获取/第一次出现的位置
        boolean b = true;
        while (b){
            number = str.indexOf("/");
            if (number != 0)
                b = false;
        }
    }

    //截取IP地址
    public String getStrIP() {
        strIP = String.valueOf(chIP,number+1,str.length()-number-1);
        return strIP;
    }
    //截取本地域名
    public String getStrNmae(){
        strNmae = String.valueOf(chHostName,0,number);
        return strNmae;
    }
}

//------------------------------我是分割线------------------------------

//测试用户类**LANTalkServerWindowGUI
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LANTalkServerWindowGUI extends JFrame implements ActionListener,Runnable{

    //声明控件对象
    public JButton enter,close;
    public JTextField txt;
    public JTextArea text;
    public Box box;
    public JMenuBar menuBar;
    public JMenu addFriend;
    public JMenuItem ip,portSend,portRevice;
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
    JPanel panel;

    //更改的IP
    String strIP;
    //更改的端口
    int defaultSendPort=2333,defaultRevicePort = 5418;

    //声明发送端口和接收端口
    int strSendPort,strRevicePort;

    //主题色
    boolean subthem;
    public LANTalkServerWindowGUI(){
        //初始化窗体默人参数
        setSize(300,310);
        try{
            //设置窗口标题为本机IP地址
            setTitle(InetAddress.getLocalHost().getHostAddress());
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog(this,"IP地址不合法","错误",JOptionPane.ERROR_MESSAGE);
        }
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        //显示窗口
        setVisible(true);
        //固定边界
        setResizable(false);
        //刷新布局
        validate();

        //初始化控件对象
        enter = new JButton("发送");
        txt = new JTextField(20);
        text = new JTextArea(10,20);
        close = new JButton("关闭");
        menuBar = new JMenuBar();
        addFriend = new JMenu("好友");
        ip = new JMenuItem("设置IP");
        portSend = new JMenuItem("设置发送端口");
        portRevice = new JMenuItem("设置接收端口");

        //初始化窗体布局
        box = Box.createVerticalBox();
        getContentPane().add(box);
        box.add(new JScrollPane(text));
        box.add(txt);
        panel = new JPanel();
        panel.add(enter);
        panel.add(close);
        box.add(panel);

        //添加菜单条
        setJMenuBar(menuBar);
        //添加菜单
        menuBar.add(addFriend);
        //添加菜单项
        addFriend.add(ip);
        addFriend.add(portSend);
        addFriend.add(portRevice);

        //绑定监听事件
        enter.addActionListener(this);
        close.addActionListener(this);
        ip.addActionListener(this);
        portSend.addActionListener(this);
        portRevice.addActionListener(this);

        //启动接收信息线程
        Thread thread = new Thread(this);
        thread.start();

        //调用LANTalkUserInterface成员常量subTheme,false为浅色,true为深色
        subthem = LANTalkUserInterface.subTheme;
        //深色主题
        if (subthem){
            //enter,close,txt,text,box,menuBar,addFriend,ip,portSend,portRevice,panel
            enter.setBackground(new Color(22,22,22));
            enter.setForeground(Color.GREEN);
            close.setBackground(new Color(22,22,22));
            close.setForeground(Color.GREEN);
            txt.setBackground(new Color(22,22,22));
            txt.setForeground(Color.GREEN);
            text.setBackground(new Color(22,22,22));
            text.setForeground(Color.GREEN);
            box.setBackground(new Color(22,22,22));
            menuBar.setBackground(new Color(22,22,22));
            addFriend.setBackground(new Color(22,22,22));
            addFriend.setForeground(Color.GREEN);
            ip.setBackground(new Color(22,22,22));
            ip.setForeground(Color.GREEN);
            portSend.setBackground(new Color(22,22,22));
            portSend.setForeground(Color.GREEN);
            portRevice.setBackground(new Color(22,22,22));
            portRevice.setForeground(Color.GREEN);
            panel.setBackground(new Color(22,22,22));
        }
        //浅色主题
        if (subthem != true){
            //enter,close,txt,text,box,menuBar,addFriend,ip,portSend,portRevice,panel
            enter.setBackground(Color.white);
            enter.setForeground(Color.black);
            close.setBackground(Color.white);
            close.setForeground(Color.black);
            txt.setBackground(Color.white);
            txt.setForeground(Color.black);
            text.setBackground(Color.white);
            text.setForeground(Color.black);
            box.setBackground(Color.white);
            menuBar.setBackground(Color.white);
            addFriend.setBackground(Color.white);
            addFriend.setForeground(Color.black);
            ip.setBackground(Color.white);
            ip.setForeground(Color.black);
            portSend.setBackground(Color.white);
            portSend.setForeground(Color.black);
            portRevice.setBackground(Color.white);
            portRevice.setForeground(Color.black);
            panel.setBackground(Color.white);
            panel.setForeground(Color.black);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //如果关闭按钮发生事件
        if (e.getSource().equals(close)){

        }

        //如果发送按钮发生事件
        if (e.getSource().equals(enter)){
            //获取文本数据
            byte[] info = txt.getText().trim().getBytes();
            try{
                String HostIp = InetAddress.getLocalHost().getHostAddress();
//                InetAddress inetAddress = InetAddress.getByName(InetAddress.getLocalHost().getHostAddress());
                //如果默认IP被修改则重新赋值
                if (strIP != null)
                    HostIp = strIP;
                InetAddress inetAddress = InetAddress.getByName(HostIp);
                //如果默认端口被更改则重新赋值
                if (strRevicePort != 0)
                    defaultRevicePort = strRevicePort;
                //创建待发送的数据包
                DatagramPacket datagramPacket = new DatagramPacket(info,info.length,inetAddress,defaultSendPort);
                DatagramSocket socket = new DatagramSocket();
                //发送数据包
                socket.send(datagramPacket);
            }
            catch (UnknownHostException e1){
                JOptionPane.showMessageDialog(this,"IP地址不合法","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (SocketException e1){
                JOptionPane.showMessageDialog(this,"套接字不能被打开，或不能将其绑定到指定的本地端口","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException e1){
                JOptionPane.showMessageDialog(this,"消息发送失败","错误",JOptionPane.ERROR_MESSAGE);
            }

            //添加本地消息
            text.append("时间:"+simpleDateFormat.format(date)+"\n");
            text.append("本机:"+txt.getText()+"\n");
            //清除文本框
            txt.setText(null);
        }

        //添加IP
        if (e.getSource().equals(ip)){
            strIP = JOptionPane.showInputDialog(this,"请输入IP地址","信息:",JOptionPane.PLAIN_MESSAGE);
        }

        //添加发送端口
        if (e.getSource().equals(portSend)){
            String port = JOptionPane.showInputDialog(this,"请输入端口:1024-65535","信息",JOptionPane.PLAIN_MESSAGE);
            try{
                strSendPort = Integer.valueOf(port);
            }
            catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(this,"端口号不能为空","错误",JOptionPane.ERROR_MESSAGE);
            }
        }

        //添加接收端口
        if (e.getSource().equals(portRevice)){
            String port = JOptionPane.showInputDialog(this,"请输入接收端口:1024-65535","信息",JOptionPane.PLAIN_MESSAGE);
            try{
                strRevicePort = Integer.valueOf(port);
            }
            catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(this,"端口不能为空","错误",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //接收信息线程
    @Override
    public void run() {
        DatagramPacket packet = null;
        DatagramSocket socket = null;
        //最大长度
        byte data[] = new byte[8192];
        try{
            //如果默认的接收端口被更改则重新赋值
            if (strRevicePort != 0){
                defaultRevicePort = strRevicePort;
            }
            //创建接收数据包
            packet = new DatagramPacket(data,data.length);
            socket = new DatagramSocket(defaultRevicePort);
        }
        catch (SocketException e){
            JOptionPane.showMessageDialog(this,"端口不合法","错误",JOptionPane.ERROR_MESSAGE);
        }
        while (true){
            //如果socket没有被实例化
            if (socket == null)
                break;
            else {
                try{
                    //接收数据包
                    socket.receive(packet);
                    String message = new String(packet.getData(),0,packet.getLength());
                    text.append("时间:"+simpleDateFormat.format(date)+"\n");
                    text.append("对方:"+message+"\n");
                }
                catch (IOException e1){
                    JOptionPane.showMessageDialog(this,"接收信息失败","错误",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

//    //调试:直接运行当前窗口
//    public static void main(String args[]){
//        LANTalkServerWindowGUI main = new LANTalkServerWindowGUI();
//        main.validate();
//    }
}

//------------------------------我是分割线------------------------------

//测试用户类**LANTalkClientWindowGUI
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LANTalkClientWindowGUI extends JFrame implements ActionListener,Runnable {
    //声明控件对象
    JButton enter,close;
    JTextField txt;
    JTextArea text;
    Box box;
    JMenuBar menuBar;
    JMenu addFriend;
    JMenuItem ip,portSend,portRevice;
    JPanel panel;
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");

    //更改的IP
    String strIP;
    //更改的端口
    int defaultSendPort=5418,defaultRevicePort = 2333;

    //声明发信端口和接收端口
    int strSendPort,strRevicePort;

    //主题色
    boolean subthem;
    public LANTalkClientWindowGUI(){
        //初始化窗体默认参数
        setSize(300,300);
        try{
            //设置当前窗体标题为本机IP地址
            setTitle(InetAddress.getLocalHost().getHostAddress());
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog(this,"IP地址不合法","错误",JOptionPane.ERROR_MESSAGE);
        }
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        //显示窗口
        setVisible(true);
        //固定边界
        setResizable(false);
        //刷新布局
        validate();

        //初始化控件对象参数
        enter = new JButton("发送");
        txt = new JTextField(20);
        text = new JTextArea(10,20);
        close = new JButton("关闭");
        menuBar = new JMenuBar();
        addFriend = new JMenu("好友");
        ip = new JMenuItem("设置IP");
        portSend = new JMenuItem("设置发送端口");
        portRevice = new JMenuItem("设置接收端口");

        //初始化窗体布局
        box = Box.createVerticalBox();
        getContentPane().add(box);
        box.add(new JScrollPane(text));
        box.add(txt);
        panel = new JPanel();
        panel.add(enter);
        panel.add(close);
        box.add(panel);

        //添加菜单条
        setJMenuBar(menuBar);
        //添加菜单
        menuBar.add(addFriend);
        //添加菜单项
        addFriend.add(ip);
        addFriend.add(portSend);
        addFriend.add(portRevice);

        //绑定监听事件
        enter.addActionListener(this);
        close.addActionListener(this);
        ip.addActionListener(this);
        portSend.addActionListener(this);
        portRevice.addActionListener(this);

        //启动接收信息线程
        Thread thread = new Thread(this);
        thread.start();

        //调用LANTalkUserInterface成员常量subTheme,false为浅色,true为深色
        subthem = LANTalkUserInterface.subTheme;
        //深色主题
        if (subthem){
            //enter,close,txt,text,box,menuBar,addFriend,ip,portSend,portRevice,panel
            enter.setBackground(new Color(22,22,22));
            enter.setForeground(Color.GREEN);
            close.setBackground(new Color(22,22,22));
            close.setForeground(Color.GREEN);
            txt.setBackground(new Color(22,22,22));
            txt.setForeground(Color.GREEN);
            text.setBackground(new Color(22,22,22));
            text.setForeground(Color.GREEN);
            box.setBackground(new Color(22,22,22));
            menuBar.setBackground(new Color(22,22,22));
            addFriend.setBackground(new Color(22,22,22));
            addFriend.setForeground(Color.GREEN);
            ip.setBackground(new Color(22,22,22));
            ip.setForeground(Color.GREEN);
            portSend.setBackground(new Color(22,22,22));
            portSend.setForeground(Color.GREEN);
            portRevice.setBackground(new Color(22,22,22));
            portRevice.setForeground(Color.GREEN);
            panel.setBackground(new Color(22,22,22));
        }
        //浅色主题
        if (subthem != true){
            //enter,close,txt,text,box,menuBar,addFriend,ip,portSend,portRevice,panel
            enter.setBackground(Color.white);
            enter.setForeground(Color.black);
            close.setBackground(Color.white);
            close.setForeground(Color.black);
            txt.setBackground(Color.white);
            txt.setForeground(Color.black);
            text.setBackground(Color.white);
            text.setForeground(Color.black);
            box.setBackground(Color.white);
            menuBar.setBackground(Color.white);
            addFriend.setBackground(Color.white);
            addFriend.setForeground(Color.black);
            ip.setBackground(Color.white);
            ip.setForeground(Color.black);
            portSend.setBackground(Color.white);
            portSend.setForeground(Color.black);
            portRevice.setBackground(Color.white);
            portRevice.setForeground(Color.black);
            panel.setBackground(Color.white);
            panel.setForeground(Color.black);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //如果发送按钮发生事件
        if (e.getSource().equals(enter)){
            //获取文本数据
            byte[] info = txt.getText().trim().getBytes();
            try{
                String HostIp = InetAddress.getLocalHost().getHostAddress();
                if (strIP != null)
                    HostIp = strIP;
                InetAddress inetAddress = InetAddress.getByName(HostIp);
                if (strRevicePort != 0)
                    defaultRevicePort = strRevicePort;
                //创建待发送的数据包
                DatagramPacket datagramPacket = new DatagramPacket(info,info.length,inetAddress,defaultSendPort);
                DatagramSocket socket = new DatagramSocket();
                //发送数据包
                socket.send(datagramPacket);
            }
            catch (UnknownHostException e1){
                JOptionPane.showMessageDialog(this,"IP地址不合法","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (SocketException e1){
                JOptionPane.showMessageDialog(this,"套接字不能被打开，或不能将其绑定到指定的本地端口","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException e1){
                JOptionPane.showMessageDialog(this,"消息发送失败","错误",JOptionPane.ERROR_MESSAGE);
            }
            //显示本地消息
            text.append("时间:"+simpleDateFormat.format(date)+"\n");
            text.append("本机:"+txt.getText()+"\n");
            //清除文本框
            txt.setText(null);
        }

        //添加IP
        if (e.getSource().equals(ip)){
            strIP = JOptionPane.showInputDialog(this,"请输入IP地址","信息:",JOptionPane.PLAIN_MESSAGE);
        }

        //添加发送端口
        if (e.getSource().equals(portSend)){
            String port = JOptionPane.showInputDialog(this,"请输入端口:1024-65535","信息",JOptionPane.PLAIN_MESSAGE);
            try{
                strSendPort = Integer.valueOf(port);
            }
            catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(this,"端口号不能为空","错误",JOptionPane.ERROR_MESSAGE);
            }
        }

        //添加接收端口
        if (e.getSource().equals(portRevice)){
            String port = JOptionPane.showInputDialog(this,"请输入接收端口:1024-65535","信息",JOptionPane.PLAIN_MESSAGE);
            try{
                strRevicePort = Integer.valueOf(port);
            }
            catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(this,"端口不能为空","错误",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //接收信息线程
    @Override
    public void run() {
        DatagramPacket packet = null;
        DatagramSocket socket = null;
        //最大长度
        byte data[] = new byte[8192];
        try{
            if (strRevicePort != 0)
                defaultRevicePort = strRevicePort;
            //创建接收的数据包
            packet = new DatagramPacket(data,data.length);
            socket = new DatagramSocket(defaultRevicePort);
        }
        catch (SocketException e){
            JOptionPane.showMessageDialog(this,"端口不合法","错误",JOptionPane.ERROR_MESSAGE);
        }
        while (true){
            //如果socket没有被实例化
            if (socket == null)
                break;
            else {
                try{
                    //接收数据包
                    socket.receive(packet);
                    String message = new String(packet.getData(),0,packet.getLength());
                    text.append("时间:"+simpleDateFormat.format(date)+"\n");
                    text.append("对方:"+message+"\n");
                }
                catch (IOException e1){
                    JOptionPane.showMessageDialog(this,"接收信息失败","错误",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

//    //调试:直接运行当前窗口
//    public static void main(String args[]){
//        LANTalkClientWindowGUI  main = new LANTalkClientWindowGUI();
//        main.validate();
//    }
}

```
***
* [GitHub](https://github.com/TianruiShi/str/tree/master/Code/Java/LANTalk)
***
* ![演示效果](https://github.com/TianruiShi/str/blob/master/Code/Java/LANTalk/DemoLANTalk.gif)
* 如果上面的图片无法展示[轻点这里](https://github.com/TianruiShi/str/blob/master/Code/Java/LANTalk/DemoLANTalk.gif) 