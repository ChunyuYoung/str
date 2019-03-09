public class DemoX32BitReversal {
    public long longIntNumber(int n){
        long intNumber = 0;     //存储反转的整数
        //反转数字
        intNumber = n-(n*2);
        //如果反转的数字大于Integer.MAX_VALUE 或 小于Integer.MIN_VALUE,则判断反转的数字
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){

        }
        return intNumber;
    }
}
