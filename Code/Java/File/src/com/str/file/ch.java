package com.str.file;
import java.io.*;
public class ch {
	public static void main(String args[]) {
		int fb = 0;
		try {
			FileReader fi = new FileReader("E:\\电脑配置信息 – 电脑管家检测结果.txt");	//读取文件内容
			FileWriter fo = new FileWriter("E:\\test.txt");		//想write方法传参
			while((fb = fi.read()) != -1) {		//判断文件内容是否读取到尾部
				fo.write(fb);					//输出文件(接收读取文件时的整数[字符]然后输出整数并转换为字符)
			}
			fi.close();
			fo.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("找不到文件");
		}
		catch(IOException e) {
			System.out.println("文件不能被写入");
		}
		finally {
			System.out.println("文件成功被写入");
		}
	}
}
