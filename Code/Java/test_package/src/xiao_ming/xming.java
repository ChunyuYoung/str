package xiao_ming;
//package str.city;
import str.city.xmCity;
import java.awt.desktop.SystemSleepEvent;

public class xming {
    public static void main(String args[]){
        System.out.println("public/protected/default/private的区别");
        //for (int n=0;n<62;n++)System.out.print("_");System.out.println();
        //System.out.println("|           "+"|           "+"|            "+"|          "+"|           |");
        for (int n=0;n<62;n++)System.out.print("─");System.out.println();
        System.out.println("|作用域      "+"|当前类      "+"|同一包      "+"|子孙类     "+"|其他包      |");
        for (int n=0;n<62;n++)System.out.print("─");System.out.println();
        System.out.println("|public     "+"|√           "+"|√          "+"|√         "+"|√           |");
        for (int n=0;n<62;n++)System.out.print("─");System.out.println();
        System.out.println("|protected  "+"|√           "+"|√          "+"|√         "+"|×           |");
        for (int n=0;n<62;n++)System.out.print("─");System.out.println();
        System.out.println("|default    "+"|√           "+"|√          "+"|×         "+"|×           |");
        for (int n=0;n<62;n++)System.out.print("─");System.out.println();
        System.out.println("|private    "+"|√           "+"|×          "+"|×         "+"|×           |");
        for (int n=0;n<62;n++)System.out.print("─");System.out.println();

        city value = new city();
        System.out.println("小明这个城市的私人会所拥有的权限为:"+value.publicServer+"\t"+value.defaultServer+"\t"+value.protectedServer+"\t"+"错误:无法访问SVIP3下的权限");

        xmCity xmValue = new xmCity();
        System.out.println("小明另一个城市的私人会所拥有的权限为:"+xmValue.publicServer+"\t"+"错误:无法访问SVIP1的权限"+"\t"+"错误:无法访问SVIP2的权限"+"\t"+"错误:无法访问SVIP3下的权限");


    }
}
