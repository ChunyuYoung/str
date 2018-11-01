package com.str.access;

public class Student {
    private int number;
    public int getNumber(int number){
       return number;
    }
    public int setNumber(){
        return this.number = number;
    }

    private String name;

    public String setName(String name){
        return this.name = name;
    }

    private int score;
    public int getScore(int score){
        return score;
    }
    public int setScore(){
        return this.score = score;
    }
    void Disy(){
        System.out.println("私有字段(本类)");
        //问题:为什么在私有的name在输出有值而学号和成绩却没有值呢?他们不是都已经获取键盘输入呢嘛
        //解决:因为私有的name使用了一个set方法有运行的主类直接赋值输出,其他方法虽然在运行中的主类获取值了,但是输入使用的是get方法,然而输出却是set方法,set方法并没有值,输出却调用的事set方法里面变量的值被再次赋值为空,导致输出没有结果
        //据此判断get和set我们任选一种方法来使用,唯一不同的是get是在获取值时对值做更改,然而set却是在值已经被获取之后在对值进行操作/更改
        System.out.println("名字:"+this.name+"学号"+this.number+"成绩:"+this.score);
    }
}
