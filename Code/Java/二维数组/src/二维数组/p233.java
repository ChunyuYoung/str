package 二维数组;
public class p233 {
	public static void main(String[] args) {
		int[][] num = new int[9][9];	//初始化二维数组
		for (int i = 1; i <= num[i].length; i++) {
			System.out.println(num[i]);
			for (int j = 1; j <= num[j].length; j++) {
				System.out.println("*"+num[j]+"="+num[i][j]);
			}
			System.out.println();
		}
	}
}
