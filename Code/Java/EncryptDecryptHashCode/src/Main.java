import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    /**
     * @author StringOD
     * @param args 无参
     * 用途: 加解密文件对象的HashCode
     * 存在问题: 不能正确的解密
     * 猜测:返回HashCode为String导致在加法计算时变成了字符串连接赋值
     */
	public static void main(String[] args) {
		//Read file HashCode
		File fileEncrypt = new File("C:\\Users\\Administrator\\Desktop\\Encrypt.txt");
		int fileHashCodeEncrypt = fileEncrypt.hashCode();
		System.out.println("HashCode:\t"+fileHashCodeEncrypt);
		
		//Encrypt strValue
		Encrypt encrypt = new Encrypt(fileHashCodeEncrypt);
		System.out.println("Encrypt:\t"+encrypt.getStringEncrypt());
		
		//Encrypt strValue to Encrypt.txt
		try{
			FileWriter input = new FileWriter(fileEncrypt);
			input.append("HashCode:\t"+fileEncrypt.hashCode());
			input.append("HashCodeEncrypt:\t"+encrypt.getStringEncrypt());
			input.flush();
			input.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//Read file HashCode
		File fileDecrypt = new File("C:\\Users\\Administrator\\Desktop\\Decrypt.txt");
		int fileHashCodeDecrypt = fileDecrypt.hashCode();
		System.out.println("HashCode:\t"+fileHashCodeDecrypt);
		
		//Decrypt strValue
		Decrypt decrypt = new Decrypt(fileHashCodeDecrypt);
		System.out.println("Decrypt:\t"+decrypt.getStringDecrypt());
		
		//Decrypt strValue to Decrypt.txt
		try{
			FileWriter out = new FileWriter(fileDecrypt);
			out.append("HashCode:\t"+decrypt.getStringDecrypt());
			out.flush();
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
//Encrypt strValue class
class Encrypt{
	private int strValue;
	public Encrypt(int strValue){
		this.strValue = strValue;
	}
	public int getStringEncrypt(){
		int EncryptDataA = 0x11A;
		int EncryptDataB = 0x11B;
		int EncryptDataC = 0x11C;
		int EncryptDataValue = EncryptDataA + EncryptDataB + EncryptDataC;
		return this.strValue + EncryptDataValue;
	}
}
//Decrypt strValue class
class Decrypt{
	private int strValue;
	public Decrypt(int strValue){
		this.strValue = strValue;
	}
	public int getStringDecrypt(){
		int DecryptDataA = 0x11A;
		int DecryptDataB = 0x11B;
		int DecryptDataC = 0x11C;
		int DecryptDataValue = DecryptDataA + DecryptDataB + DecryptDataC;
		return this.strValue - DecryptDataValue;
	}
}