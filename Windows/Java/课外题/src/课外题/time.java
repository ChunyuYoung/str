package ������;
import java.util.Scanner;
public class time {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("�㽫Ҫ����һ��������");
		double time = value.nextInt();
		double day=0,hour=0,min=0,second=0;
		//����ʱ��
		//ʱ�����ȡֵ��Χ:time<86399
		if(time<86400){		
			if(time<3600){
				if(time<60){
					if(time<0) {
					}
					else{
						second=time;	//��
					}
				}
				else{
					min=time/60;    	//����
					second=time%60;		//��
				}
			}
			else{
				hour=time/3600;
				second=time%3600;
				min = second /60;
				second = second % 60;
				//ʱ���ʽ����
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