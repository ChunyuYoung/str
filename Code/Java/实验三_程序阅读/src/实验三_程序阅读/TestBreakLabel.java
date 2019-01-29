package 实验三_程序阅读;
public class TestBreakLabel {
	public static void main(String[] args) {
		boolean t = true;
		one:{
			two:{
				three:{
					System.out.println("break之前的语句正常输出");
					if (t)break two;
				System.out.println("two程序中break之后的语句不被执行");
			}
		System.out.println("two程序中break之后的语句不被执行");
		}
		System.out.println("two程序块外的语句将被执行");
	}
}
}