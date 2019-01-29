//2.
public class Student{
    int age;
    float score;
    String name;
    public Student(int aAge,float sScore,String nName){
        age=aAge;
        score=sScore;
        name=nName;
    }
    //打印一条消息
    void studyWhere(){
        System.out.println("就读于陕西国际商贸学院");
    }
    void addScore(){
        System.out.println("姓名:"+name+"\n年龄:"+age+"\n分数(+5):"+(score+5));
    }
}
