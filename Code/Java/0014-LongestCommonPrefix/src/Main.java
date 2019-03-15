
public class Main {
	public static void main(String args[]){
		Answer ans = new Answer();
		String s1[] = {"str","sstr","ssstr"}; 
		String s2[] = {"shitianrui","str"};
		String s3[] = {"flow","flo","fl"};
		String s4[] = {"sssttr","str","s13"};
		String s5[] = {};
		String s6[] = {"str"};
		System.out.println(ans.GetIntegerSubString(s1));
		System.out.println(ans.GetIntegerSubString(s2));
		System.out.println(ans.GetIntegerSubString(s3));
		System.out.println(ans.GetIntegerSubString(s4));
		System.out.println(ans.GetIntegerSubString(s5));
		System.out.println(ans.GetIntegerSubString(s6));
	}
}
