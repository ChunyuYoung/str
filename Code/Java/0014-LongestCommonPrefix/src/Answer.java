
public class Answer {
	public String GetIntegerSubString(String str[]){
		boolean b = false;
		String s = "";
		//������鳤��Ϊ0���������һ������ǰ׺Ϊ��,�򷵻ؿ�
		if(str.length == 0 || str[0] == "")
			return "";
		//���str������ֻ��һ��Ԫ���򷵻����Ԫ��ʲô������
		if(str.length == 1)
			return str[0];
		//����str��һ������Ԫ��
		for(int i=0;i<str[0].length();i++){
			b = true;
			//��str�ڶ���Ԫ�ؿ�ʼ����
			for(int j=1;j<str.length;j++){
				/*
				 * ���str��һ��Ԫ�صĳ��ȴ��ڵ��ڵڶ���Ԫ�صĳ��Ȼ���str
				 * ��һ��Ԫ���еĵ�i���ַ�������str�ڶ���Ԫ���еĵ�j���ַ�
				 */
				if(i>=str[j].length() || str[0].charAt(i) != str[j].charAt(i)){
					b = false;
					break;
				}
			}
			/*
			 *�����1��Ԫ���е��ַ��������еڶ���Ԫ���е��ַ������׷�Ӹ�s������ 
			 * ������������ѭ��
			 */
			if(b)
				s = s + str[0].charAt(i);
			else
				break;
		}
		return s;
	}
}
