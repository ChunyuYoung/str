import java.util.regex.*;
public class DemoFileStringMain {
    public static void main(String args[]){
        String str = "2719859320,这是我的QQ号";
        String regex = "[0123456789]{5,6}";
        boolean b = Pattern.matches(regex,str);
        System.out.println(b);
    }
}
