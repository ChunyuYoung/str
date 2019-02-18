import java.util.*;
public class Example13_4 {
    public static void main(String args[]){
        LinkedList myList = new LinkedList();
        myList.add("你");                //链表中的第一个结点
        myList.add("好");                //链表中的第二个结点
        int number = myList.size();      //链表中的长度
        for (int i=0;i<number;i++){
            String temp = (String)myList.get(i);    //必须强制转换
            System.out.println("第"+i+"结点中的数据:"+temp);
        }
        Iterator iter = myList.iterator();
        while(iter.hasNext()){
            String te = (String)iter.next();
            System.out.println(te);
        }
    }
}
