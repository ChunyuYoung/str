package str;

public class str {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person str = new Person();
		str.age();
		str.name();
//		if("��ָ����"=="����")
//			System.out.println("�Բ��ҵ�����:STR");
//		else
//			System.out.println("NotFoundObject");
	}
}
class Person{
	String name;
	int age;
	void name() {
		System.out.println("str");
	}
	void age() {
		System.out.println(20);
	}
}
