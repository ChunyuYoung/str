import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]){
        ServerSocket serverSocket = null;
        Socket you = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
            serverSocket = new ServerSocket(4331);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try{
            System.out.println("等待客户端呼叫");
            you = serverSocket.accept();        //堵塞状态,除非有客户呼叫
            out = new DataOutputStream(you.getOutputStream());
            in = new DataInputStream(you.getInputStream());
            while(true){
                char c = in.readChar();     //in读取信息,堵塞状态
                System.out.println("服务器收到"+c);
                out.writeChar((char)(c-32));
                Thread.sleep(2000);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
