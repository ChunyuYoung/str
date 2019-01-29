package 课外题;
import java.util.Scanner;
public class time {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("你将要输入一个正整数");
		double time = value.nextInt();
		double day=0,hour=0,min=0,second=0;
		//计算时间
		//时间最大取值范围:time<86399
		if(time<86400){		
			if(time<3600){
				if(time<60){
					if(time<0) {
					}
					else{
						second=time;	//秒
					}
				}
				else{
					min=time/60;    	//分钟
					second=time%60;		//秒
				}
			}
			else{
				hour=time/3600;
				second=time%3600;
				min = second /60;
				second = second % 60;
				//时间格式控制
				if(min>=60)
					//hour +=1-1;
					min=min-60;
				if(second>=60) 
					//min +=1-1;
					second = second-60;
			}
		}
		System.out.println(hour+":"+min+":"+second);
	}
}