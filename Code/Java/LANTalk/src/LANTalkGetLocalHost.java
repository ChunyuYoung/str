import java.util.ArrayList;

public class LANTalkGetLocalHost {

    private String str = "";        //获取要分割的字符串
    private String strIP = "";      //获取IP地址
    private String strNmae = "";    //获取本机域名
    private int number = 0;         //获取/第一次出现的位置
    private char chIP[] = str.toCharArray();        //获取IP数组
    private char chHostName[] = str.toCharArray();  //获取本地域名

    private LANTalkGetLocalHost(String str){
        this.str = str;
    }

    //获取/第一次出现的位置
    private void strSplit(String str){
        ArrayList<String> s = new ArrayList<>();
        boolean b = true;
        while (b){
            number = str.indexOf("/");
            if (number != 0)
                b = false;
        }
    }

    //截取IP地址
    public String getStrIP() {
        strIP = String.valueOf(chIP,number+1,str.length()-number-1);
        return strIP;
    }

    //截取本地域名
    public String getStrNmae(){
        strNmae = String.valueOf(chHostName,0,number);
        return strNmae;
    }
}
