package com.str;
import java.util.*;
import static java.util.Calendar.*; 	//����util���е�Calendar���еľ�̬����
public class date {

	public static void main(String[] args) {
		//��ȡ��ǰʱ��
		Date nowDate = new Date();		
		//���� Date ���󲢳�ʼ���˶����Ա�ʾ�Դӱ�׼��׼ʱ�䣨��Ϊ����Ԫ��epoch�������� 1970 �� 1 �� 1 �� 00:00:00 GMT��������ָ����������
		Date dateADSecond = new Date(1000); 
		System.out.println("��ǰʱ��:"+nowDate);	
		System.out.println("��Ԫ(�����ϵͳ)��һ��:"+dateADSecond);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int �� = calendar.get(YEAR),�� = calendar.get(MONTH)+1,�� = calendar.get(DAY_OF_MONTH),���� = calendar.get(DAY_OF_WEEK);
		int hour = calendar.get(HOUR_OF_DAY),minute = calendar.get(MINUTE),second = calendar.get(SECOND);
		System.out.println("���ڵ�ʱ����:");
		System.out.println(""+��+"��"+��+"��"+��+"��"+xingqi(����));
		System.out.println(" "+hour+"ʱ"+minute+"��"+second+"��");
		int year = 1945,month=8,day=15;
		calendar.set(year, month-1,day); //����������1945��8��15��,ע��7��ʾ����
		System.out.print(year+"��"+month+"��"+day+"����");
		long time2 = calendar.getTimeInMillis();
		year = 1931;
		month = 9;
		day = 18;
		calendar.set(year, month-1, day); 	//����������1931��9��18��
		System.out.print(year+"��"+month+"��"+day+"��");
		long time1 = calendar.getTimeInMillis();
		long ������� = (time2-time1)/(1000*60*60*24);
	}
	static String xingqi(int n) {
		switch(n) {
		case 1:return "������";
		case 2:return "����һ";
		case 3:return "���ڶ�";
		case 4:return "������";
		case 5:return "������";
		case 6:return "������";
		case 7:return "������";
		default:return "";
		}
	}
}
