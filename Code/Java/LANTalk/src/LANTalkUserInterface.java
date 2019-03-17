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