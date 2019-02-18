import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DemoOpenStreamMain {
    public static void main(String args[]){
        try{
            URL url = new URL("http://www.baidu.com");
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            while((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        }
        catch(MalformedURLException v1){
            v1.printStackTrace();
        }
        catch (IOException v2){
            v2.printStackTrace();
        }
    }
}
