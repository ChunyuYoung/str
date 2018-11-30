class AgeException extends Exception{
  String message;
  AgeException(String name,int m){ 
    message=name+"的年龄"+m+"不正确";
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
       throw new AgeException(name,age); //方法抛出异常，导致方法结束
    else
      this.age=age;
  }  
  public int getAge(){   
    System.out.println("年龄"+age+": 输入正确");
    return age;
  }
}
public class Age{
  public static void main(String args[]){  
	User 张三=new User("张三");
    User 李四=new User("李四");
     try { 
           张三.setAge(20);
           System.out.println("张三年龄是： "+张三.getAge());
      }
     catch(AgeException e){
           System.out.println(e.toString());
     }
     try { 
           李四.setAge(18);
           System.out.println("李四年龄是： "+李四.getAge());
             }
     catch(AgeException e){   
          System.out.println(e.toString());
     }
   }
}
