package com.str.Line;

public class People extends Thread{
	StringBuffer str;	//��������ַ�����������Ϊ��ʹ��getName����ȡ�̵߳�����
	People(String s,StringBuffer str){
		setName(s);		//�����߳�����
		this.str=str;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			str.append(getName()+","); 	//����ǰ�̵߳�����β�ӵ�str
			/*strΪ������Դ���Ա��߳�1���߳�2������,�����߳�1����߳�1�����ֺ�,���߳�2ִ��ʱstr���޸�
			 * ��Ϊʹ����append������ԭ��,�ڵ�һ������Լ������ֺ���׷������,���׷�ӵ����־ͻᱻ�߳�2
			 * ��ʹ��,���Գ�����һ���߳����������̵߳�����
			 */
			System.out.println("����"+getName()+",�ַ���Ϊ:"+str);	
			try {
				sleep(200); 	//�ж�200ms
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
