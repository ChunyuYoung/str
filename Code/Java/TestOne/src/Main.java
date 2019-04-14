import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/*
前天买的"Java核心技术 卷一",昨天看了一天,了解了一些我当初学习时没有学到的知识
今天打算实践一下,掌握哪些基本操作,对"Java核心技术 卷一"是一本基础类书籍,这算是我看的第三本基础类书,
等于是我把Java语言看的第三遍.
 */
public class Main {
    public static void main(String[] args){
        //数据类型
        long strL = 400000000L;     //定义长整型
        int strX = 0xA;             //定义十六进制
        int strO = 010;             //定义八进制
        int strB = 0B1000;          //定义二进制
        int strD = 8_5;             //定义十进制
        float strF = 3.1415926F;    //定义单精度浮点数
        double strDouble = Math.E;  //定义双精度浮点数
        double strd = 1.23456789D;  //定义双精度浮点数
        System.out.println("输出长整型:" + strL);
        System.out.println("输出十六进制:" + strX);
        System.out.println("输出八进制:" + strO);
        System.out.println("输出二进制:" + strB);
        System.out.println("输出二进制:" + strD);
        System.out.println("输出单精度浮点数:" + strF);
        System.out.println("输出双精度浮点数:" + strDouble);
        System.out.println("输出双精度浮点数:" + strd);

        //NaN 不是一个数字
        Scanner sc = new Scanner(System.in);
        if (Double.isNaN(sc.nextDouble()))
            System.out.println("不是一个数字");
        else
            System.out.println("是一个数字");

        //位运算符
        int fourthBitFromRight = (8 & 0b1000) /0b1000;
        System.out.println("位运算:" + fourthBitFromRight);

        //左移,右移运算<<,>>
        int fourthBitFromL = (16 & (1 << 3)) >> 3;
        System.out.println("左移和右移运算" + fourthBitFromL);

        //填充高位运算符:>>>
        int nb = 0b1111;
        System.out.println("填充高位运算符:" + (nb >>> 0));

        //字符串:子串
        String name = "张三李四王麻子";
        System.out.println("字符串截取:" + name.substring(2,4));       //一个汉字在这里占一个

        //字符串拼接
        String 张三 = "张三";
        String 李四 = "李四";
        String 王麻子 = "王麻子";
        String name_list = String.join("/",张三,李四,王麻子);  //顶一个字符串"/"是定界符,可以使任意字符
        System.out.println("输出名称列表:" + name_list);

        //检测值类型是否相等
        if ( 1 == 1)
            System.out.println("值类型:True");

        //检测引用类型是否相等
        String sss = "str";
        if (sss.equals("str"))
            System.out.println("引用类型:True");

        //检测引用类型是否相等,不区分大小写
        String ss = "Str";
        if (ss.equalsIgnoreCase("str") && ss.equalsIgnoreCase("STR"))
            System.out.println("不区分大小写的引用类型:True");

        //检测字符串是否为空
        String sVoid = "";
        if (sVoid.equals("") && sVoid.length() == 0)
            System.out.println("sVoid为空串");

        //构建字符串
        StringBuilder str = new StringBuilder();
        //每次只添加一部分内容
        str.append("str");
        str.append("233");
        System.out.println("构架字符串序列之前:" + str);
        //构建字符串序列
        String chStr = str.toString();
        System.out.println("构建字符串之后:" + chStr);

        //printf标志
        System.out.printf("printf标志:正数 %d\t负数 %d\n",+233,-233);
        System.out.printf("printf标志:左对齐-%d\n",233);

        //String 静态方法format 创建格式化字符串
        String strname = "StringOD";
        int strage = 21;
        String message = String.format("Hello Java World,%s.今年%d岁",strname,strage);
        System.out.printf("使用String的静态方法format构建的字符串:%s\n",message);

        //日期时间 转换符
        System.out.printf("当前时间: %tc\n",new Date());
        System.out.printf("当前时间: %BTY\n",new Date());         //这里格式化标志服貌似仅仅支持三个位

        //格式化参数索引
        System.out.printf("%1$s %2$tB %2$te,%2$tY\n"," Due date:",new Date());

        //读入文件并指定编码
        try{
            Scanner in = new Scanner(Paths.get("TempFile.txt"),"UTF-8");
        }
        catch (IOException e) {
            System.out.printf("找不到文件");
        }

        //带标签的break
        him:
        for (int i = 0; i < 5; i++)
            if(true)
                break him;
        System.out.printf("带标签的break\n");

        //大数值
        //BigInteger
        BigInteger a = BigInteger.valueOf(5);
        BigInteger b = BigInteger.valueOf(10);
        System.out.printf("大数值:BigInteger\na = %d\nb = %d\n",a,b);
        System.out.printf("大数值:a+b=%d\n",a.add(b));
        System.out.printf("大数值:b-a=%d\n",b.subtract(a));
        System.out.printf("大数值:a*b=%d\n",a.multiply(b));
        System.out.printf("大数值:b/a=%d\n",b.divide(a));
        BigInteger a1 = BigInteger.valueOf(10);
        BigInteger b1 = BigInteger.valueOf(10);
        /*
        System.out.printf("大数值:a1%b1%d\n",a1.mod(b1));
        这样写会报错,根据提示可能是%d格式控制符导致的
         */
        System.out.println("大数值:a1%b1=" + a1.mod(b1));
        System.out.println("大数值:a1 比较 b1 = " + a1.compareTo(b1) + "返回0表示相等,负数表示一个大数值比另一个大数值小,否则返回正数");

        //for each 循环
        System.out.println("使用for each遍历数组列表:");
        int[] aArray = {1,2,3,4,5};
        for (int a2:aArray)
            //如果直接写aArray[a2]会抛异常:数组越界,可能是因为a2在第五个元素时已经越界,所以这里减去1,还能把第一个元素打印出来
            System.out.println(aArray[a2-1]);


    }
}

