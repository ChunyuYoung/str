import java.util.*;

public class DemoGenericsLinkedList {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        for(int i=0;i<60096;i++){
            list.add("spped"+i);
        }
        Iterator<String> iter = list.iterator();
        long startTime = System.currentTimeMillis();
        while(iter.hasNext()){
            String te = iter.next();
        }
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("使用迭代器遍历集合的时间:"+result / 1000f+"s");

        //普通遍历
        startTime = System.currentTimeMillis();
        for (int i=0;i<list.size();i++){
            String te = list.get(i);
        }
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        System.out.println("使用get方法遍历集合所用时间:"+result / 1000f+"s");
    }
}
