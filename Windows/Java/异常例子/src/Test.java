
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
			System.out.println("�����쳣 ");
		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("�����쳣 ");
		}
		finally{
			System.out.println("ͳһ����");
		}
		
	}
}
