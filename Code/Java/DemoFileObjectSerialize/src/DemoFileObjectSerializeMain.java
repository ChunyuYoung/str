import java.io.*;
public class DemoFileObjectSerializeMain {
    public static void main(String args[]){
        DemoFileObjectSercializeStudent zhang = new DemoFileObjectSercializeStudent();
        zhang.setName("张三");
        zhang.setHeight(1.77f);
        File file = new File("people.txt");
        try{
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(zhang);
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(in);
            DemoFileObjectSercializeStudent li = (DemoFileObjectSercializeStudent)objectIn.readObject();
            li.setName("李四");
            li.setHeight(1.66f);
            System.out.println(zhang.name+"\t"+zhang.height);
            System.out.println(li.name+"\t"+li.height);
            objectIn.close();
            objectOut.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
