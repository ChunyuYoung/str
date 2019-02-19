import java.io.IOException;
import java.net.*;

public class DemoBoradCast extends Thread {
    String s = "全球预言,俄罗斯男孩预言2020年外星人将于地球人正式接触,并且神已经选择了中国,埃及的狮身人面像,也望着东方,中国将统治世界";
    int port = 54188;       //组播的端口
    InetAddress inetAddress = null;         //组播组的地址
    MulticastSocket multicastSocket = null;     //多点广播套接字

    private DemoBoradCast() {
        try {
            //设置组广播地址
            inetAddress = InetAddress.getByName("233.233.233.233");
            //多点广播套接字将在port端口广播
            multicastSocket = new MulticastSocket(port);
            //多点广播套接字发送数据报为本地网络
            multicastSocket.setTimeToLive(1);
            //加入inetAddress后,mutiacastSocket发送的数据报被inetAdress中的成员接收到
            multicastSocket.joinGroup(inetAddress);
        } catch (UnknownHostException e) {
            System.out.println("IP地址错误");
        } catch (IOException e) {
            System.out.println("端口被占用");
        }
    }

    public void run() {
        while (true) {
            try {
                DatagramPacket datagramPacket = null;   //待广播的数据包
                byte[] data = s.getBytes();
                datagramPacket = new DatagramPacket(data, data.length, inetAddress, port);
                System.out.println(new String(data));
                //广播数据包
                multicastSocket.send(datagramPacket);
                sleep(2000);
            } catch (IOException e) {
                System.out.println(e.toString());
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String args[]) {
        new DemoBoradCast().start();
    }
}
