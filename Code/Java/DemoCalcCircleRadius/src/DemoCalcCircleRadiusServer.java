import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class DemoCalcCircleRadiusServer {
    public static void main(String args[]){
        ServerSocket serverSocket = null;
        ServerThread thread;
        Socket you = null;

        while (true){
            try{
                serverSocket = new ServerSocket(2333);
            }
            catch (IOException v1){
                System.out.println("正在监听");     //ServerSocket对象不能重复创建
            }
            try{
                System.out.println("等待客户机呼叫");
                you = serverSocket.accept();
                System.out.println("客户的地址"+you.getInetAddress());
            }
            catch (IOException v2){
                System.out.println("正在等待客户");
            }
            if(you!=null){
                new ServerThread(you).start();
            }
        }
    }
}

class ServerThread extends Thread{
    Socket socket;
    DataInputStream in = null;
    DataOutputStream out = null;
    String str = null;

    ServerThread(Socket socket){
        this.socket = socket;
        try{
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (IOException v1){
            v1.printStackTrace();
        }
    }

    public void run(){
        while (true){
            try{
                double r = in.readDouble();     //堵塞状态,除非取到信息
//                double r = Double.parseDouble(s);
                double area = Math.PI * r * r;
                out.writeUTF("半径是:"+r+"的圆的面积:"+area);
            }
            catch (IOException v1){
                System.out.println("客户端断开");
                return;
            }
        }
    }
}
