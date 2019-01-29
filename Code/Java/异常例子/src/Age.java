class AgeException extends Exception{
  String message;
  AgeException(String name,int m){ 
    message=name+"������"+m+"����ȷ";
  }
  public String toString(){ 
    return message;
  }
}
class User{
  private int age=1;
  private String  name;
  User(String name){
  	this.name=name;
  }
  public void setAge(int age) throws AgeException{
    if(age>=50||age<=18) 
       throw new AgeException(name,age); //�����׳��쳣�����·�������
    else
      this.age=age;
  }  
  public int getAge(){   
    System.out.println("����"+age+": ������ȷ");
    return age;
  }
}
public class Age{
  public static void main(String args[]){  
	User ����=new User("����");
    User ����=new User("����");
     try { 
           ����.setAge(20);
           System.out.println("���������ǣ� "+����.getAge());
      }
     catch(AgeException e){
           System.out.println(e.toString());
     }
     try { 
           ����.setAge(18);
           System.out.println("���������ǣ� "+����.getAge());
             }
     catch(AgeException e){   
          System.out.println(e.toString());
     }
   }
}
