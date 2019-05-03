import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String text = "";
        File file = new File("F:\\work\\Project\\Source\\Repos\\str\\Code\\Python\\bilibili\\code.txt");
        try{
            FileReader fileReader = new FileReader(file);
            int n = 0;
            Scanner scanner = new Scanner(file);
            int i =0;
            while (scanner.hasNext()){
                i++;
                text += scanner.next();
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        StringBuffer stringBuffer = new StringBuffer(text);
        int qqId = stringBuffer.indexOf("g_iUin");
        String qqID = stringBuffer.substring(qqId,qqId+32);
        System.out.println(qqID);
    }
}
