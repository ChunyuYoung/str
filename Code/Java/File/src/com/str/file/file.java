package com.str.file;
import java.io.*;
public class file {
	public static void main(String args[]){
		//String file = "E:\\电脑配置信息 – 电脑管家检测结果.txt";
		int b=0;	//判断文件内容是否被读取完
		try {
			FileInputStream in = new FileInputStream("E:\\电脑配置信息 – 电脑管家检测结果.txt");		//读入文件
			FileOutputStream out = new FileOutputStream("E:\\电脑配置信息 – 电脑管家检测结果1.txt");	//写出文件
			while((b=in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("找不到文件");
		}
		catch(IOException e) {
			System.out.println("文件不能被复制");
		}
		finally {
			System.out.println("文件以复制");
		}
	}
}
