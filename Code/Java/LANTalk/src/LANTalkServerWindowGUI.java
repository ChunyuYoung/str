import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LANTalkServerWindowGUI extends JFrame implements ActionListener,Runnable{
    JLabel splitLine;
    JTextArea text;
    JTextField txt;
    JButton Enter,Close;
    Box box;
    String LANName,LANIp;

    public LANTalkServerWindowGUI(){
        //窗口标题为获取对方的IP
        setVisible(true);
        setSize(300,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        validate();             //刷新边界
        setResizable(false);     //固定边界

        //初始化控件对象
        text = new JTextArea(5,20);
        splitLine = new JLabel("LANTalk");
//        splitLine.setBackground(new Color(22,22,22));
        txt = new JTextField();
        Enter = new JButton("发送");
        Close = new JButton("关闭");

        //初始化面板
        box = Box.createVerticalBox();
        box.add(new JScrollPane(text));
        box.add(splitLine);
        box.add(new JScrollPane(txt),BorderLayout.CENTER);
        JPanel panel = new JPanel(new FlowLayout());
        box.add(panel);
        panel.add(Enter);
        panel.add(Close);

        //添加面板到容器
        getContentPane().add(box);

        //服务器和客户端将采用Server/Client Mode
        try{
            //实例化客户端IP地址和域名字符串分解实例
            LANTalkGetLocalHost lanTalkGetLocalHost = new LANTalkGetLocalHost(InetAddress.getLocalHost().toString());
            LANIp = lanTalkGetLocalHost.getStrIP();
            LANName = lanTalkGetLocalHost.getStrNmae();
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog(this,"无法获取到本地IP地址","错误",JOptionPane.ERROR_MESSAGE);
        }

        //设置当前用户标题名称为本机IP地址
        setTitle(LANIp);

        //绑定监听对象
        Enter.addActionListener(this);
        Close.addActionListener(this);

        //启动线程
        Thread thread = new Thread(this);
        thread.start();
    }

    public void actionPerformed(ActionEvent e){
        byte[] info = txt.getText().trim().getBytes();
        try{
            InetAddress address = InetAddress.getByName(LANIp);
            DatagramPacket datagramPacket = new DatagramPacket(info,info.length,address,5418);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(datagramPacket);
        }
        catch (UnknownHostException e1){
            JOptionPane.showMessageDialog(this,"找不到IP地址","错误",JOptionPane.ERROR_MESSAGE);
        }
        catch (SocketException e1){
            JOptionPane.showMessageDialog(this,"发送数据包实例化对象发生异常","错误",JOptionPane.ERROR_MESSAGE);
        }
        catch (IOException e1){
            JOptionPane.showMessageDialog(this,"数据报发送失败","错误",JOptionPane.ERROR_MESSAGE);
        }
        txt.setText(null);
    }

    public void run(){
        DatagramPacket pack = null;
        DatagramSocket socket = null;
        byte[] data = new byte[8192];   //最大长度
        try{
            pack = new DatagramPacket(data,data.length);
            socket = new DatagramSocket(2333);
        }
        catch (SocketException e){
            JOptionPane.showMessageDialog(this,"端口不合法或被占用","错误",JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
        }
        while (true){
            if (socket == null)
                break;
            else {
                try{
                    socket.receive(pack);
                    String str = new String(pack.getData(),0,pack.getLength());
                    text.append("\n"+str);
                }
                catch (IOException e){
                    JOptionPane.showMessageDialog(this,"信息接收失败","错误",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    public static void main(String args[]){
        LANTalkServerWindowGUI main = new LANTalkServerWindowGUI();
        main.validate();
    }
}