public class Answer {
    public int maximumCapacity(int height[]){
        int maxCapacity = 0;    //�������

        //1. ���ȱ�������,�ӵ�һ��Ԫ���±꿪ʼ
        for (int i = 0;i<height.length;i++){
            //2. ��������,�� i + 1 ��ʼ
            for (int j = i+1;j<height.length;j++){
                //ȡ�������
                maxCapacity = Math.max(maxCapacity,Math.min(height[i],height[j])*(j-i));
//                maxCapacity = Math.max(maxCapacity,Math.min(height[i],height[j]));
            }
        }
        return maxCapacity;
    }
}
