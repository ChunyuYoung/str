public class Answer {
    public int maximumCapacity(int height[]){
        int maxCapacity = 0;    //最大容量

        //1. 首先遍历数组,从第一个元素下标开始
        for (int i = 0;i<height.length;i++){
            //2. 遍历数组,从 i + 1 开始
            for (int j = i+1;j<height.length;j++){
                //取最大容量
                maxCapacity = Math.max(maxCapacity,Math.min(height[i],height[j])*(j-i));
//                maxCapacity = Math.max(maxCapacity,Math.min(height[i],height[j]));
            }
        }
        return maxCapacity;
    }
}
