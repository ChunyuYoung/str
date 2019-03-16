import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class LANTalkClientWindowGUI extends JFrame implements ActionListener,Runnable {
    //声明控件对象
    JButton enter,close;
    JTextField txt;
    JTextArea text;
    Box box;
    JMenuBar menuBar;
    JMenu addFriend;
    JMenuItem ip,portSend,portRevice;
    String strIP;
    int strSendPort,strRevicePort;
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        JPanel panel = new JPanel();
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //如果发送按钮发生事件
        if (e.getSource().equals(enter)){
            //获取文本数据
            byte[] info = txt.getText().trim().getBytes();
            try{
                InetAddress inetAddress = InetAddress.getByName(InetAddress.getLocalHost().getHostAddress());
                //创建待发送的数据包
                DatagramPacket datagramPacket = new DatagramPacket(info,info.length,inetAddress,5418);
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
            //创建接收的数据包
            packet = new DatagramPacket(data,data.length);
            socket = new DatagramSocket(2333);
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
//        LANTalkClientWindowGUI  main = new LANTalkClientWindowGUI();
//        main.validate();
//    }
}