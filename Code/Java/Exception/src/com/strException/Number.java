package com.strException;
import java.util.Scanner;
public class Number {
	public static boolean isNumeric(String str){  
		   for(int i=str.length();--i>=0;){  
		      int chr=str.charAt(i);  
		      if(chr<48 || chr>57)  
		         return false;  
		   }  
		   return true;  
		} 
	
	
	public static void main(String args[]) throws MyNumberException{
		//Scanner numValue = new Scanner(System.in);
		int a=5;
		String s="s";
		//MyNumberException mne = new MyNumberException();
		System.out.println("�㽫������һ������");
		try {
			//int n = numValue.nextInt();
			if(isNumeric(a+"")) {
				System.out.println("����");
			}
			else {
				System.out.println("��������");
				Exception e = new MyNumberException();
				throw e;
				//throw new MyNumberException();
			}
			
		}
		catch(Exception e) {
			System.out.println("2");
		}
		
	}
}
