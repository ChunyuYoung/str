package ʵ����_�����Ķ�;
public class TestSwitch {
	public static void main(String[] args) {
		int score=65;
		int i=score/10;
		switch (i) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:System.out.println("����");break;
		case 4:
		case 5:System.out.println("����");break;
		case 3:
		case 2:System.out.println("�е�");break;
		default:System.out.println("��������䲻�ڷ�Χ��");break;
		}
	}
}