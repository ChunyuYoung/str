import java.net.*;
public class DemoInetAdressMain {
    public static void main(String args[]){
        try{
            InetAddress inetAddress = InetAddress.getByName("www.bilibili.com");    //获取域名和IP地址
            System.out.println(inetAddress.toString());
            InetAddress inetAddress1 = InetAddress.getByName("106.75.118.115");
            System.out.println(inetAddress1);
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostAddress());
            System.out.println();       //换行
            System.out.println("获取本地的IP地址"+inetAddress.getLocalHost());
        }
        catch (UnknownHostException e){
            System.out.println("找不到网络主机");
        }
    }
}
