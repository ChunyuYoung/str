package _Java����ʵ��1;
public class P1 {
	public static void main(String[] args) {
		//1. ���г������:"��������3"
		System.out.println("��������3");
		//2. ��д����ʵ�֣�ѧ���������ֵ�λ��
		//������ҵ������ǣ�������,λ�÷ֱ�Ϊ��26446��20113��40857
		System.out.println((int)'ʷ'+"\n"+(int)'��'+"\n"+(int)'�');
		//3. ĳӰ����ʹ����Ʊ����ϵͳͳ�Ƶ�����ӳ��һ��ӰƬ��Ʊ����
		//Ʊ�۷ֱ�Ϊ80Ԫ���۳�658��Ʊ����Ա��8.5�ۣ��۳�2735��Ʊ��
		//���ô������ӰƬ��Ӱ�ǵĵ���Ʊ����
		int piaojia = 80,shouchu = 658,shouchu_vip = 2735;float vip = 0.85f;
		//�����Ʊ��
		System.out.println("��ͨ:"+piaojia*shouchu+"\n"+"VIP:"+(piaojia*vip)*shouchu_vip);
		//�ȴ�С
		int n1,n2;
		System.out.println("1 : 3 ? 1 : 3\t���ֵ��:"+Number(1,3));
	}
	public static int Number(int n1,int n2)
	{
		return n1 > n2 ? n1 : n2;
	}
}
