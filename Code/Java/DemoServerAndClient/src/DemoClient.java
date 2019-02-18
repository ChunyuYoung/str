import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class DemoClient {

    public static void main(String args[]){
        Socket Client;
        try{
            Client = new Socket("127.0.0.1",2333);
            System.out.println("客户端上线");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
