
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		try{
			int a[]=new int[5];
			System.out.println(a[5]);
			int b=5/0;
			String s="abc";
			System.out.println(s.charAt(s.length()));
		}		
		catch(ArithmeticException e){
			System.out.println("算数异常 ");
		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("发生异常 ");
		}
		finally{
			System.out.println("统一出口");
		}
		
	}
}
