import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileScannerDocumentMain {
    public static void main(String args[]){
        try{
            File file = new File("F:\\1024  核心层(604262631).txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.next());
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException v1){
                    v1.printStackTrace();
                }
            }
        }
        catch(FileNotFoundException v1){
            v1.printStackTrace();
        }
    }
}