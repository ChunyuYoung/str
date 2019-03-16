import java.awt.BorderLayout;
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
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

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
    GridLayout gridLayout;

    //声明变量
    String str[] = {"日间主题","夜间主题"};
    //声明IP地址和域名
    String LANName,LANIp;

    //盒式布局
    Box box;
    //添加IP和设置端口
    JButton addIp,setPort,enterAdd;

    //测试好友
    JButton testServer = new JButton("Test:   LANTalkClientWindowGUI"),
            testClient = new JButton("Test:   LANTalkServerWindowGUI");

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
        search = new JTextField(20);
        //添加IP
        addIp = new JButton("AddIp");
        //设置端口
        setPort = new JButton("SetPort");
        //确认添加好友
        enterAdd = new JButton("Enter");

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

        //初始化盒式布局
        box = Box.createVerticalBox();
        getContentPane().add(box);
        JPanel panel1 = new JPanel(new GridLayout(1,2));
        box.add(panel1);
        panel1.add(imageFaceLabel);
        JPanel panel1_1 = new JPanel(new GridLayout(2,1));
        panel1.add(panel1_1);
        panel1_1.add(new JLabel(LANName));
        panel1_1.add(new JLabel(LANIp));
        JPanel panel2 = new JPanel(new BorderLayout());
        JPanel panel2_2 = new JPanel(new FlowLayout());
        box.add(panel2);
        panel2.add(panel2_2);
        panel2_2.add(search);
        JPanel panel3 = new JPanel(new FlowLayout());
        box.add(panel3);
        panel3.add(addIp);
        panel3.add(setPort);
        panel3.add(enterAdd);
        JPanel panel4 = new JPanel(new GridLayout());
        box.add(panel4);
        panel4.add(testClient);
        JPanel panel4_1 = new JPanel(new GridLayout());
        box.add(panel4_1);
        panel4_1.add(testServer);

        //绑定监听事件
        testClient.addActionListener(this);
        testServer.addActionListener(this);
        addIp.addActionListener(this);
        setPort.addActionListener(this);
        enterAdd.addActionListener(this);
    }
    //事件源处理
    public void actionPerformed(ActionEvent e){

        //测试服务器
        if (e.getSource().equals(testClient))
            new LANTalkServerWindowGUI();

        //测试客户端
        if (e.getSource().equals(testServer))
            new LANTalkClientWindowGUI();

        //添加好友
        if (e.getSource().equals(addIp)){
            //获取输入的IP地址
            //未使用
            String strIp = JOptionPane.showInputDialog(this,"请输入要添加的IP地址","信息:添加好友",JOptionPane.PLAIN_MESSAGE);
        }

        //设置端口
        if (e.getSource().equals(setPort)){
            //设置端口
            String strPort = JOptionPane.showInputDialog(this,"请输入要设置的端口号(1024-65535)","信息:设置端口",JOptionPane.PLAIN_MESSAGE);
            try{
                //未使用
                int port = Integer.valueOf(strPort);
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