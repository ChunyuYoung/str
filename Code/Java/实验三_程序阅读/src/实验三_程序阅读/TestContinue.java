package 实验三_程序阅读;
public class TestContinue {
	public static void main(String[] args) {
		int i=0,sum=0;
		for (i = 0; i <= 100; i++) {
			if(1%15==0)continue;
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
}