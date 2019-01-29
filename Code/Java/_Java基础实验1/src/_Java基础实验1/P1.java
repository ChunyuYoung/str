package _Java基础实验1;
public class P1 {
	public static void main(String[] args) {
		//1. 运行程序输出:"猩球崛起3"
		System.out.println("猩球崛起3");
		//2. 编写程序实现：学生姓名单字的位置
		//输出：我的名字是：李云龙,位置分别为：26446、20113、40857
		System.out.println((int)'史'+"\n"+(int)'钿'+"\n"+(int)'睿');
		//3. 某影城在使用售票管理系统统计当天上映的一部影片的票房，
		//票价分别为80元，售出658张票，会员打8.5折，售出2735张票，
		//请用代码计算影片在影城的当天票房。
		int piaojia = 80,shouchu = 658,shouchu_vip = 2735;float vip = 0.85f;
		//当天的票房
		System.out.println("普通:"+piaojia*shouchu+"\n"+"VIP:"+(piaojia*vip)*shouchu_vip);
		//比大小
		int n1,n2;
		System.out.println("1 : 3 ? 1 : 3\t最大值是:"+Number(1,3));
	}
	public static int Number(int n1,int n2)
	{
		return n1 > n2 ? n1 : n2;
	}
}
