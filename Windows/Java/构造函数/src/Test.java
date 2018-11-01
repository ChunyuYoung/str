import java.util.Scanner;

//3.(2)
public class Test {
    //初始化静态字段
    //public static float sRadius,sDiametar,sArea,bRadius,bDiametar,bArea,radius,diametar,area;
    public static String main() {
        //根据题目我可能还需要一个获取函数,因为需要知道大圆和小圆的半径,至少在我看来他们的半径如果相同就没有意义了
        //我将会采用两种方式:
        //1.使用一个获取函数来设置两个大小不一圆的半径,但是这样就会出现冗余函数调用
        //2.或者直接在原来的Circle类的radius变量上直接除以二获得小圆半径,乘以2获得大圆半径
        //不过我更加希望能以获取的方式来操作,至少那样更加的方便
        Scanner cValue = new Scanner(System.in);

        //小圆
        System.out.println("小圆");
        Circle c1 = new Circle();
        //获取圆半径
        float sRadius = cValue.nextFloat();
        c1.getRadius(sRadius);
        //设置圆半径
        c1.setRadius(sRadius);
        //计算圆直径
        float sDiametar = c1.computeDiametar();
        System.out.println("小圆的直径为:" + sDiametar);
        //计算圆面积
        float sArea = c1.computeArea(sRadius);
        System.out.println("小圆的面积为:" + sArea);

        //大圆
        System.out.println("大圆");
        Circle c2 = new Circle();
        //获取圆半径
        float bRadius = cValue.nextFloat();
        c2.getRadius(bRadius);
        //设置圆半径
        c2.setRadius(bRadius);
        //计算圆直径
        float bDiametar = c2.computeDiametar();
        System.out.println("大圆的直径为" + bDiametar);
        //计算圆面积
        float bArea = c2.computeArea(bRadius);
        System.out.println("大圆的面积为:" + bArea);

        //据说这个圆不让赋值,可能是要直接输出之前的计算结果吧
        System.out.println("初始圆");
        Circle c3 = new Circle();
        float radius = c3.radius;                         //获取Circle类构造函数radius默认值
        float diametar = c3.computeDiametar();
        float area = c3.computeArea(radius);
        System.out.println("初始圆的半径为:" + radius + "\n初始圆的直径为:" + diametar + "\n初始圆的面积为:" + area);

        //向Circle主类传参
        String s = "\n小圆" + "\n小圆的半径为:" + sRadius + "\n小圆的直径为:" + sDiametar + "\n小圆的面积为:" + sArea + "\n大圆" + "\n大圆的半径为:" + bRadius + "\n大圆的直径为:" + bDiametar + "\n大圆的面积为" + bArea + "\n初始圆" + "\n初始圆半径为:" + radius + "\n初始圆直径为:" + diametar + "\n初始圆面积为:" + area;
        return s;        //返回字符串
    }
}