public class Main {
    public static void main(String args[]){
        Answer answer = new Answer();
        int a[] = {10,20,30,40};
        int b[] = {10};
        System.out.println("a{10,20,30,40}最大容量:"+"\t\t\t"+answer.maximumCapacity(a));
        System.out.println("b{10}最大容量:"+"\t\t\t"+answer.maximumCapacity(b));
    }
}
