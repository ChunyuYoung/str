class People1 {
   float hello(int a,int b) {
      return a+b;
   }
   float hello(long a,int b) {
      return a-b;
   }
   double hello(double a,int b) {
      return a*b;
   }
}
public class Example4_12 {
    public static void main(String args[]) {
      People1 tom = new People1();
      System.out.println(tom.hello(10,20));
      System.out.println(tom.hello(10L,20));
      System.out.println(tom.hello(10.0,20));
   }
}