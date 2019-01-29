package com.str.access;
import java.util.Scanner;
import javax.swing.*;
public class Test {
    public static void main(String args[]){
        JFrame f = new JFrame("我的窗口");
        f.setSize(400,300);
        f.setVisible(true);

        Scanner value = new Scanner(System.in);
        Student sValue = new Student();
        //获取名字
        System.out.println("获取名字");
        String name = value.next();
        sValue.setName(name);
        //获取学号
        System.out.println("获取学号");
        int number = value.nextInt();
        sValue.getNumber(number);
        //获取成绩
        System.out.println("获取成绩");
        int score = value.nextInt();
        sValue.getScore(score);

        //检验

        System.out.println("私有字段(主类)");
        System.out.println("名字:"+sValue.setName(name)+"学号"+sValue.getNumber(number)+"成绩:"+sValue.getScore(score));
        sValue.Disy();
    }
}
