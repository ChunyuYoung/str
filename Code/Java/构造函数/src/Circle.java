import java.util.Scanner;
public class Circle {
    public static void main(String args[]){
        //1.
        Number nValue = new Number(10,20);
        //检验
        nValue.N1();
        nValue.N2();
        //输出四则运算结果
        nValue.Addition();              //加法
        nValue.Subtraction();           //减法
        nValue.Multiplication();        //乘法
        nValue.Division();              //除法
        //2.
        Student sValue = new Student(20,95,"STR233");
        sValue.addScore();
        sValue.studyWhere();
        //3.(1)
        Scanner vScanner = new Scanner(System.in);
        Circle cValue = new Circle();
        System.out.println("获取圆的半径f");
        float radius = vScanner.nextFloat();            //半径
        cValue.getRadius(radius);                       //获取半径
        cValue.setRadius(radius);                       //设置半径
        float diameter = cValue.computeDiametar();      //直径
        float area = cValue.computeArea(radius);        //面积
        System.out.println("圆的半径为:"+radius+"\n圆的直径为:"+diameter+"\n圆的面积为:"+area);

        //调用Test主类参数并打印
        String STR = Test.main();
        System.out.println(STR);
    }
    //3.(1)
    float radius,area,diameter;     //半径,面积,直径
    float pi = 3.14f;               //初始化π值
    //设置半径为1
    public Circle(){
        radius=1;                   //初始化半径为1
    }

    //设置半径
    float setRadius(float rRadius){
        return radius = rRadius;
    }

    //获得半径
    float getRadius(float rRadius){
        return radius = rRadius;
    }
    //计算直径
    float computeDiametar(){
        return diameter = 2*radius;
    }
    //计算圆面积
    float computeArea(float radius){
        return  area = 2*pi*(radius*radius);
    }
}

