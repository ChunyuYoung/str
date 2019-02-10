import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileEncryptionToDecryptionMain {
    public static void main(String args[]){
        char ch[] = "2019年2月9日凌晨11:00对铜川市印台区鸭口煤矿中小学发起地毯式攻击".toCharArray();
        int n1 = 0,n2=0;
        try{
            File file = new File("Document.txt");
            for (int i=0;i<ch.length;i++){
                ch[i] = (char)(ch[i]^'R');
            }
            FileWriter out = new FileWriter(file);
            out.write(ch,0,ch.length);
            out.close();
            FileReader read = new FileReader(file);

            System.out.println("Encryption:");
            while((n1 = read.read(ch,0,ch.length)) != -1){
                String str = new String(ch,0,ch.length);
                System.out.print(str);
            }
            read.close();

            System.out.println();
            char temp[] = new char[ch.length];
            System.out.println("Decryption:");
            read = new FileReader(file);
            while((n2 = read.read(temp,0,ch.length)) != -1){
                for (int i=0;i<ch.length;i++){
                    temp[i] = (char)(temp[i]^'R');
                }
                String str = new String(temp,0,temp.length);
                System.out.print(str);
            }
            out.close();
            read.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}
