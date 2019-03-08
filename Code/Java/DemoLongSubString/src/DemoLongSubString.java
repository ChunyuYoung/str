import java.util.HashSet;
public class DemoLongSubString {
    public int GetSubStringLength(String s){
        int strLength = 0;          //初始化子串长度
        //实例化HashSet集合
        HashSet<Character> chStr = new HashSet<Character>();
        //遍历字符串
        for (int i=0;i<s.length();i++){
            //向set集合添加第一个字符
            chStr.add(s.charAt(i));
            //从集合第二个字符开始遍历
            for (int j=i+1;j<s.length();j++){
                //如果集合不包含字符串中的字符
                if (!(chStr.contains(s.charAt(j))))
                chStr.add(s.charAt(j));
                else
                    break;      //当集合中的字符与字符串中的字符相同时跳出本次循环
            }
            strLength = chStr.size();   //获取字符串不同子串的长度
//            strLength = Math.max(strLength,chStr.size());
        }
        return strLength;
    }
}
