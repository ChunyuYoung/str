public class TestCode {
    public int reverse(int x) {
        int num;
        long sum=0;     //存储返回值
        while(x!=0){    //如果实参不等于0
            sum=(sum*10+x%10);
            x/=10;

        }
        if(Integer.MAX_VALUE<sum||sum<Integer.MIN_VALUE)
            return 0;
        return (int)sum;
    }
}
/*
sum = 0
x = 10
x % 10 = 0 	//这应该是第一次
x / 10 = 0 	//第二次
//但是while循环执行条件确是不能为0,所以这个值不管

例:123
sum = 0
x = 123
while x!=0 	//条件为真
sum = (sum*10+x%10); 	//第一次0*10 = 0 (123%10) = 3 这个3会赋值给sum,也就是说x的值并没有变
x /= 10; 	//这里x=123被删掉了一个位数变成了12

x = 12
sum = 3*10 = 30 12%10 = 2 30+2=32 	//这里sum的上次值是3加上这次被去掉的一个位数变成了2+30=32
x /= 10; 	 //这里再次去掉一个位数变成 1

x = 1
sum = 32*10 = 320 1%10 = 1 320+1 = 321
 */