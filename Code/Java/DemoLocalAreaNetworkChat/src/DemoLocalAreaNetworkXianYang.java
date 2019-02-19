import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.io.IOException;
import java.net.*;
import javax.swing.JOptionPane;

public class DemoLocalAreaNetworkXianYang extends JFrame implements ActionListener,Runnable{
    //初始化控件对象
    JTextArea textArea = new JTextArea(5,10);
    JTextField textField = new JTextField(10);
    JButton button = new JButton("发送");
    Thread thread = new Thread(this);

    private DemoLocalAreaNetworkXianYang(){
        //初始化窗体参数
        setSize(300,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //初始化面板
        JPanel Zero = new JPanel();
        Zero.setLayout(new GridLayout(2,1));
        JPanel Two = new JPanel();
        Two.setLayout(new FlowLayout());

        //添加对象到容器
        getContentPane().add(Zero);
        Zero.add(new JScrollPane(textArea),BorderLayout.CENTER);
        Zero.add(Two);
        Two.add(textField);
        Two.add(button);

        //绑定监听对象
        button.addActionListener(this);

        //启动线程
        thread.start();
    }

    public void actionPerformed(ActionEvent e){
        //如果发送按钮发生事件
        if (e.getSource().equals(button)){
            //创建待发送的数据包
            byte info[] = textField.getText().trim().getBytes();
            try{
                InetAddress inetAddress = InetAddress.getByName("192.168.124.12");
                DatagramPacket datagramPacket = new DatagramPacket(info,info.length,inetAddress,2333);
                //发送数据包
                DatagramSocket sendMessage = new DatagramSocket();
                sendMessage.send(datagramPacket);
            }
            catch (UnknownHostException e1){
                JOptionPane.showMessageDialog(this,"IP地址错误","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (SocketException e1){
                JOptionPane.showMessageDialog(this,e1.toString(),"错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException e1){
                JOptionPane.showMessageDialog(this,e1.toString(),"错误",JOptionPane.ERROR_MESSAGE);
            }
            textField.setText(null);
        }
    }
    public void run(){
        DatagramSocket datagramSocket = null;
        DatagramPacket datagramPacket = null;
        byte[] readMessage = new byte[8192];        //最大长度
        try{
            datagramPacket = new DatagramPacket(readMessage,readMessage.length);
            datagramSocket = new DatagramSocket(5418);
        }
        catch (SocketException e){
            JOptionPane.showMessageDialog(this,"端口被占用","错误",JOptionPane.ERROR_MESSAGE);
        }
        while(true){
            if (datagramSocket == null)
                break;
            else {
                try{
                    datagramSocket.receive(datagramPacket);
                    String str = new String(datagramPacket.getData(),0,datagramPacket.getLength());
                    textArea.append("\n"+str);
//                    System.out.println();       //换行
                }
                catch (IOException e){
                    JOptionPane.showMessageDialog(this,e.toString(),"错误",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String args[]){
        DemoLocalAreaNetworkXianYang XianYang = new DemoLocalAreaNetworkXianYang();
        XianYang.setTitle("咸阳用户");
        XianYang.validate();
    }
}
