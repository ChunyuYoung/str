/*
如果被LANTalkServerWindowGUI和LANTalkClientWindowGUI调用则会发生异常
异常信息:套接字无法绑定端口
猜测:应该是IP地址回传的问题,但是用输出函数测试没问题
目前LANTalkGetLocalHost.getStrIp()被InetAddress.getLocalHost().getHostAddress()所代替
此类仍被LANTalkUserInterface所使用
 */
public class LANTalkGetLocalHost {

    //如果直接给字符串赋值为""或者null会直接导致传参的变量被覆盖,导致程序抛出异常
    private String str;        //获取要分割的字符串
    private String strIP;      //获取IP地址
    private String strNmae;    //获取本机域名
    private int number;         //获取/第一次出现的位置
    private char chIP[];        //获取IP数组
    private char chHostName[];  //获取本地域名

    public LANTalkGetLocalHost(String str){
        this.str = str;
        chIP = str.toCharArray();
        chHostName = str.toCharArray();

        //获取/第一次出现的位置
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