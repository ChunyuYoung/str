

public class Test1 {
	static int b;
	static void f(int c) throws ArithmeticException{	
		if(c==0){
//			throw new ArithmeticException();
			ArithmeticException ar=new ArithmeticException();
			throw ar;
		}
		
		b=5/c;		
	}	
	public static void main(String[] args) {
		try{
			f(0);
		}
		catch(ArithmeticException e){
			System.out.println("算数异常 ");
		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("发生异常 ");
		}
	}
}
