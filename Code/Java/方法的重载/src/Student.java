
public class Student {
//	public static void main(String[] args) {
//
//	}
	public Student(String nName,char gGender,int aAge,float wWeight,float mMoney){
		this.name = nName;
		this.gender = gGender;
		this.age = aAge;
		this.weight = wWeight;
		this.money = mMoney;
	}
	/*-----------------------*/
	String name;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*-----------------------*/
	char gender;
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	/*-----------------------*/
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*-----------------------*/
	float weight;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	/*-----------------------*/
	float money;
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	/*-----------------------*/
	float Learn(){
		this.weight-=1;
		return weight;
	}
	float Rest(){
		this.weight+=1;
		return weight;
	}
	void Display(){
		System.out.println("姓名:"+this.name+"\t性别:"+this.gender+"\t年龄:"+this.age+"\t存款:"+this.money+"\t体重:"+this.weight);
	}
	
}
