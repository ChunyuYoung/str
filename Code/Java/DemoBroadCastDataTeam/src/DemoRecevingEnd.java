import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.io.IOException;
import java.net.*;
import javax.swing.JOptionPane;

public class DemoRecevingEnd extends JFrame implements ActionListener,Runnable{
    int port;                       //组播的端口
    InetAddress group = null;       //多播组的地址
    MulticastSocket socket = null;  //多点广播套接字
    JButton 开始接收,停止接收;
    JTextArea 正在接收的内容,已接收的内容;
    Thread thread;                  //负责接收信息的线程
    boolean 停止 = false;
    private  DemoRecevingEnd(){
        setTitle("定时接收信息");
        thread = new Thread(this);
        开始接收 = new JButton("开始接收");
        停止接收 = new JButton("停止接收");

        开始接收.addActionListener(this);
        停止接收.addActionListener(this);
        正在接收的内容 = new JTextArea(10,10);
        已接收的内容 = new JTextArea(10,10);
        setLayout(new GridLayout(2,1));

        JPanel north = new JPanel();
        north.setLayout(new FlowLayout());
        getContentPane().add(north);
        north.add(开始接收);
        north.add(停止接收);

        JPanel center = new JPanel();
        getContentPane().add(center);
        center.setLayout(new GridLayout(1,2));
        center.add(new JScrollPane(正在接收的内容));
        center.add(new JScrollPane(已接收的内容));

        port = 54188;                   //设置组播组的监听端口

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        try{
            group = InetAddress.getByName("233.233.233.233");       //设置广播组的地址为233.233.233.233
            socket = new MulticastSocket(port);                     //多点广播套接字将在port端口广播
            socket.joinGroup(group);                                //加入group
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog(this,"IP地址错误","错误",JOptionPane.ERROR_MESSAGE);
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(this,"端口被占用","错误",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == 开始接收){
            if(!(thread.isAlive())){
                thread = new Thread(this);
            }
            thread.start();
            停止 = false;
        }
        if (e.getSource() == 停止接收){
            停止 = true;
            try{
                socket.leaveGroup(group);
                socket.close();
            }
            catch (IOException e1){
                JOptionPane.showMessageDialog(this,"断开IP地址错误","错误",JOptionPane.ERROR_MESSAGE);
            }

        }
    }
    public void run(){
        while (true){
            byte data[] = new byte[8192];
            DatagramPacket packet = new DatagramPacket(data,data.length,group,port);
            try{
                socket.receive(packet);
                String message = new String(packet.getData(),0,packet.getLength());
                正在接收的内容.setText("正在接收的内容:\n"+message);
                已接收的内容.append(message+"\n");
            }
            catch (IOException e){
                if (停止 == true){
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
        new DemoRecevingEnd();
    }
}
