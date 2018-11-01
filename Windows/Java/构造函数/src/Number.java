//1.
public class Number{
    int n1,n2;
    public Number(int i1,int i2){
        n1=i1;
        n2=i2;
    }
    void N1(){
        System.out.println("校验-->n1的值是:"+n1);
    }
    void N2(){
        System.out.println("校验-->n2的值是:"+n2);
    }
    //加法
    void Addition(){
        System.out.println("n1+n2="+(n1+n2));
    }
    //减法
    void Subtraction(){
        System.out.println("n1-n2="+(n1-n2));
    }
    //乘法
    void Multiplication(){
        System.out.println("n1*n2="+(n1*n2));
    }
    //除法
    void Division(){
        System.out.println("n1/n2="+(n1/n2));
    }
}