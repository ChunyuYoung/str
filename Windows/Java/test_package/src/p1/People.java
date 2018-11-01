package p1;
public  class People {
    private String s1 = "1";    //只能在本类中使用
    public  String s2 = "2";
    protected String s3 = "3";
   // String s4 = "4";
}
class A1{
    public static void main(String args[]){
        People str = new People();
        System.out.println(str.s2+str.s3);
    }
}