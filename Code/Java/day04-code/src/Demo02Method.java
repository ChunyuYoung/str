public class Demo02Method {
	public static void main(String[] args) {
		prin();		//调用子函数
	}
	public static void prin() {
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<20;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
