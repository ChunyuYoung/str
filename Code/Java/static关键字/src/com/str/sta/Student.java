package com.str.sta;
public class Student{
    String name;
    static int num=0;
    public Student(String name){
        this.name = name;
        this.num++;
    }
    void Str(){
        System.out.println(this.name+"是第"+this.num+"个学生");
    }
}
