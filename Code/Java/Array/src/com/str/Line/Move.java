package com.str.Line;

public class Move implements Runnable{
	Move(){
		
	}
	public void run() {
		String name = Thread.currentThread().getName();		//��ȡ�̶߳��������
		StringBuffer str = new StringBuffer();				//�ֲ�����str
		for(int i=1;i<=3;i++) {
			if(name.equals("����")) {
				str.append(name);	//ÿ�ζ���str׷��һ����ǰ�̵߳�����,���Ի����Ŵ��������Ӷ�����
				System.out.println(name+"�̵߳ľֲ�����i="+i+",str="+str);
			}
			else if(name.equals("����")) {
				str.append(name);
				System.out.println(name+"�̵߳ľֲ�����i="+i+",str="+str);
			}
			try {
				Thread.sleep(800); 		//����800ms
			}
			catch(InterruptedException e){
				System.out.println("�����߳��ж��˵�ǰ�߳�");
			}
		}
	}
}
