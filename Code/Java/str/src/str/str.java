package str;

public class str {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person str = new Person();
		str.age();
		str.name();
//		if("五指姑娘"=="对象")
//			System.out.println("以查找到对象:STR");
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
