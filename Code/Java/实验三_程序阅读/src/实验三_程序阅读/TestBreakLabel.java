package ʵ����_�����Ķ�;
public class TestBreakLabel {
	public static void main(String[] args) {
		boolean t = true;
		one:{
			two:{
				three:{
					System.out.println("break֮ǰ������������");
					if (t)break two;
				System.out.println("two������break֮�����䲻��ִ��");
			}
		System.out.println("two������break֮�����䲻��ִ��");
		}
		System.out.println("two����������佫��ִ��");
	}
}
}