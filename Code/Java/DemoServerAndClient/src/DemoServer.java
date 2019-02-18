import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer{

    public static void main(String args[]){
        ServerSocket serverSocket;
        try{
            //建立ServerSocker对象,设置端口
            serverSocket = new ServerSocket(2333);
            //如果accept连接不上客户机则会堵塞线程,这句话会被一直执行
            System.out.println("等待客户上线");
            //连接客户机和服务器的套接字
            Socket socket = serverSocket.accept();
            //获得到了客户端的套接字
            System.out.println("客户端已上线");
        }
        //当端口被占用时
        catch (IOException v1){
            System.out.println("端口不可用");
        }
    }
}
