public class DemoX32BitReversalMain {
    public static void main(String args[]){
        DemoX32BitReversal reversalNumber = new DemoX32BitReversal();
        System.out.println("反转数字:10"+"\t\t\t"+reversalNumber.longIntNumber(10));
        System.out.println("反转数字:23333333"+"\t\t\t"+reversalNumber.longIntNumber(23333333));
        for (int i=0;i<30;i++)System.out.print("=");System.out.println();      //分割线
        System.out.println("反转数字:Integer.MAX_VALUE+1"+"\t\t\t"+reversalNumber.longIntNumber(Integer.MAX_VALUE+1));
        System.out.println("反转数字:Integer:MIX_VALUE-1"+"\t\t\t"+reversalNumber.longIntNumber(Integer.MIN_VALUE-1));
        for (int i=0;i<30;i++)System.out.print("=");System.out.println();      //分割线
        System.out.println("反转数字:Integer.MAX_VALUE"+"\t\t\t"+reversalNumber.longIntNumber(Integer.MAX_VALUE));
        System.out.println("反转数字:Integer:MIX_VALUE"+"\t\t\t"+reversalNumber.longIntNumber(Integer.MIN_VALUE));
        for (int i=0;i<30;i++)System.out.print("=");System.out.println();      //分割线
        System.out.println("反转数字:Integer.MAX_VALUE"+"\t\t\t"+reversalNumber.longIntNumber(Integer.MAX_VALUE+1000));
        System.out.println("反转数字:Integer:MIX_VALUE"+"\t\t\t"+reversalNumber.longIntNumber(Integer.MIN_VALUE-1000));
        for (int i=0;i<30;i++)System.out.print("=");System.out.println();      //分割线
        System.out.println("反转数字:0"+"\t\t\t"+reversalNumber.longIntNumber(0));
        System.out.println("反转数字:123456789"+"\t\t\t"+reversalNumber.longIntNumber(123456789));
        for (int i=0;i<30;i++)System.out.print("=");System.out.println();      //分割线
        TestCode testCode = new TestCode();
        System.out.println("123456789:"+"\t\t\t"+testCode.reverse(123456789));
    }
}
