//static关键字的练习
package com.str.sta;
import java.util.Scanner;
public class sta {
    public static void main(String args[]){
        Scanner value = new Scanner(System.in);
        int num=0;  //创建3次对象
        while (num++ < 3){
            System.out.println("我们将从键盘上获取一个输入,你必须按照我们的要求输入一个字符串类型的(输入\"233\"则退出)");
            String name = value.next();
            Student str = new Student(name);
            str.Str();
        }
    }
}
