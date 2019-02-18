import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Timer;

public class Client {
    public static void main(String args[]){
        Socket socket;
        DataInputStream in = null;
        DataOutputStream out = null;
        try{
            socket = new Socket("127.0.0.1",4331);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            char ch = 'a';
            while (true){
                if(ch > 'z'){
                    ch = 'a';
                }
                out.writeChar(ch);
                char s = in.readChar();     //in读取信息,堵塞状态
                System.out.println("客户端收到:"+s);
                ch++;
                Thread.sleep(2000);
            }
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("不能访问到服务器\t超时");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
