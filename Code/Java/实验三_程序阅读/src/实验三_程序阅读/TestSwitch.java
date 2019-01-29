package 实验三_程序阅读;
public class TestSwitch {
	public static void main(String[] args) {
		int score=65;
		int i=score/10;
		switch (i) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:System.out.println("老年");break;
		case 4:
		case 5:System.out.println("中年");break;
		case 3:
		case 2:System.out.println("中等");break;
		default:System.out.println("输入的年龄不在范围内");break;
		}
	}
}