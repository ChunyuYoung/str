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

public class LANTalkServerWindowGUI extends JFrame implements ActionListener,Runnable{

    //声明控件对象
    public JButton enter,close;
    public JTextField txt;
    public JTextArea text;
    public Box box;
    public JMenuBar menuBar;
    public JMenu addFriend;
    public JMenuItem ip,portSend,portRevice;
    JPanel panel;
    String strIP;

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
                //创建待发送的数据包
                DatagramPacket datagramPacket = new DatagramPacket(info,info.length,inetAddress,2333);
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
            //创建接收数据包
            packet = new DatagramPacket(data,data.length);
            socket = new DatagramSocket(5418);
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
                    text.append("\n"+message+"\n");
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