import java.awt.event.ActionEvent;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class DemoCalcCircleRadiusClient extends JFrame implements ActionListener,Runnable{
    //声明控件对象
    private JButton connect,send;
    private JTextArea text;
    private JLabel label;
    private JTextField txt;
    private Socket socket = null;
    private DataInputStream in;
    private DataOutputStream out;
    private Thread clientThread;

    private DemoCalcCircleRadiusClient(){
        //初始化窗体参数
        setVisible(true);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //初始化控件对象参数
        connect = new JButton("连接服务器");
        send = new JButton("发送");
        text = new JTextArea(3,10);
        txt = new JTextField(5);
        label = new JLabel("输入圆的半径");
        send.setEnabled(false);
        socket = new Socket();

        //初始化面板
        JPanel Zero = new JPanel();
        Zero.setLayout(new GridLayout(3,1));
        JPanel Three = new JPanel();
        Three.setLayout(new FlowLayout());

        //添加面板和控件对象到容器
        getContentPane().add(Zero);
        Zero.add(connect);
        Zero.add(new JScrollPane(text),BorderLayout.CENTER);
        Zero.add(Three);
        Three.add(label);
        Three.add(txt);
        Three.add(send);

        //绑定监听对象
        connect.addActionListener(this);
        send.addActionListener(this);

        //创建线程
        clientThread = new Thread(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //如果连接按钮发生事件
        if (e.getSource().equals(connect)){
            try{
                //请求和服务器建立套接字连接
                if (socket.isConnected()){

                }
                else {
                    //在给定主机名的情况下确定主机IP,如果提供IP地址,则仅仅检查地址格式的有效性
                    InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
                    //实现IP套接字地址(IP+端口)
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress,2333);
                    //将当前客户机的套接字与服务器连接
                    socket.connect(inetSocketAddress);
                    //建立传输通道
                    in = new DataInputStream(socket.getInputStream());
                    out = new DataOutputStream(socket.getOutputStream());
                    //启用发送按钮
                    send.setEnabled(true);
                    //如果没有活动的线程
                    if (!(clientThread.isAlive())){
                        clientThread = new Thread(this);
                    }
                    //启动线程
                    clientThread.start();
                }
            }
            catch (UnknownHostException v1){
                JOptionPane.showMessageDialog(this,"找不到IP地址","信息",JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException v2){
                JOptionPane.showMessageDialog(this,"连接失败","错误",JOptionPane.ERROR_MESSAGE);
            }
        }

        //如果发送按钮发生事件
        if (e.getSource().equals(send)){
            String str = txt.getText();
            double r = Double.parseDouble(str);
            try{
                out.writeDouble(r);
            }
            catch (IOException v1){
                JOptionPane.showMessageDialog(this,"向服务器发送数据失败","错误",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void run() {
        String str = null;
        double result = 0;
        while(true){
            try{
                //将文本的Unicode编码转换为UTF-8编码
                str = in.readUTF();
                //从服务器计算的结果返回给了str
                text.append("\n"+str);
            }
            catch (IOException v1){
                JOptionPane.showMessageDialog(this,"与服务器断开","信息",JOptionPane.INFORMATION_MESSAGE);
                //重新连接服务器
                socket = new Socket();
                //调出catch重新读取
                break;
            }
        }
    }
    public static void main(String args[]){
        DemoCalcCircleRadiusClient win = new DemoCalcCircleRadiusClient();
        win.validate();
        win.setTitle("客户端");
    }
}
