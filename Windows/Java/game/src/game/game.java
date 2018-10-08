package game;
import java.util.Scanner;
public class game {
	//声明静态字段模拟全局变量
	//计划使用75个数组
	public static int[] Maps = new int[100];			//声明地图大小
	//尝试着使用用户输入的字母来操作
	public static char[] Players = new char [2];		//声明玩家
	//存储用户昵称
	public static String[] Name = new String[2];		//声明昵称
	//玩家位置检测
	public static boolean[] Flags = new boolean[2];		//判断胜利/出界
	
	//主程序入口
	public static void main(String[] args) {
		boolean b = true;					//条件判断
		//获取玩家姓名 且 判断异常并处理
		Scanner value = new Scanner(System.in);
		//判断玩家1昵称是否为空
		System.out.println("请输入第一个玩家的游戏昵称(昵称不能为空\"且\"玩家昵称不能相同)");
		Name[0] = value.next();			//获取玩家1的游戏昵称
		while(Name[0] == " ") {
			System.out.println("不行哦,你必须按照要求输入第一个玩家的游戏昵称");
			Name[0] = value.next();		//获取玩家1的游戏昵称
		}
		System.out.println("请输入第二个玩家的游戏昵称(昵称不能为空\"且\"玩家昵称不能相同)");	//判断玩家2昵称是否为空且相同
		Name[1] = value.next();			//获取玩家2的游戏昵称
		while(Name[1] == " " || Name[0] == Name[1]) {
			System.out.println("这个也不行耶,你必须按照要求输入第二个玩家的游戏昵称");
			if(Name[1] == " ") {
				System.out.println("游戏昵称不嫩为空,你必须按照要求输入");
				Name[1] = value.next();			//获取玩家2的游戏昵称
			}
			else {
				System.out.println("游戏昵称不能相同,你必须按照要求输入");
				Name[1] = value.next();			//获取玩家2的游戏昵称
			}
		}
		//输入完成需要清屏
		for(int i=0;i<50;i++)
			System.out.println();		//换50行
		//玩家标志代替昵称
		System.out.printf(Name[0]+"O代替\t"+Name[1]+"Q代替\n");
		Players[0] = 'O';	//玩家1
		Players[1] = 'Q';	//玩家2
		//当玩家O和Q没有一个在终点时,游戏将继续
	}
}
