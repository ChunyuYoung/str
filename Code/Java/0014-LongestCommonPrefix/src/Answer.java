
public class Answer {
	public String GetIntegerSubString(String str[]){
		boolean b = false;
		String s = "";
		//如果数组长度为0或者数组第一个公共前缀为空,则返回空
		if(str.length == 0 || str[0] == "")
			return "";
		//如果str数组中只有一个元素则返回这个元素什么都不做
		if(str.length == 1)
			return str[0];
		//遍历str第一个数组元素
		for(int i=0;i<str[0].length();i++){
			b = true;
			//从str第二个元素开始遍历
			for(int j=1;j<str.length;j++){
				/*
				 * 如果str第一个元素的长度大于等于第二个元素的长度或者str
				 * 第一个元素中的第i个字符不等于str第二个元素中的第j个字符
				 */
				if(i>=str[j].length() || str[0].charAt(i) != str[j].charAt(i)){
					b = false;
					break;
				}
			}
			/*
			 *数组第1个元素中的字符和数组中第二个元素中的字符相等则追加给s并返回 
			 * 否则跳出本次循环
			 */
			if(b)
				s = s + str[0].charAt(i);
			else
				break;
		}
		return s;
	}
}
