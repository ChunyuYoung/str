package com.str.pg;
import java.io.*;
import java.util.Random;
public class ran {
	public static void main(String args[]){
		//1.产生10个1—100的随机数，将其存入文本文件a.txt中
		try{
			FileInputStream fis = new FileInputStream("F:\\a.txt");	//文件存在
			System.out.println("文件已存在");
			try{
//				FileOutputStream fos = new FileOutputStream("D:\\a.txt");	//创建文件
				int num[] = new int[10];			//初始化数组
				for(int i=0;i<num.length;i++){
					Random rd = new Random();		//创建随机数
					num[i] = rd.nextInt(100)+1;
					System.out.print(num[i]+"\t");
				}
				//向文件存入生成的随机数
				DataOutputStream dis = new DataOutputStream(new FileOutputStream("F:\\a.txt"));
				for(int i=0;i<num.length;i++){
					dis.write(num[i]);		//向文件传入每个随机数
				}
				System.out.println(); 		//换行
				System.out.println("随机数向文件写入成功");
				//关闭流
				dis.close();
			}
			catch(FileNotFoundException fe){
				System.out.println("文件创建失败");
			}
			catch(IOException fe){
				System.out.println("文件写入失败");
			}
		}
		catch(FileNotFoundException e){
			//文件不存在
			System.out.println("找不到文件,重新创建文件");
			System.out.println("生成10个随机数:");
			try{
				FileOutputStream fos = new FileOutputStream("F:\\a.txt");	//创建文件
				int num[] = new int[10];			//初始化数组
				for(int i=0;i<num.length;i++){
					Random rd = new Random();		//创建随机数
					num[i] = rd.nextInt(100)+1;
					System.out.print(num[i]+"\t");
				}
				//向文件存入生成的随机数
				DataOutputStream dis = new DataOutputStream(new FileOutputStream("F:\\a.txt"));
				for(int i=0;i<num.length;i++){
					dis.write(num[i]);		//向文件传入每个随机数
				}
				System.out.println(); 		//换行
				System.out.println("随机数向文件写入成功");
				//关闭流
				fos.close();
				dis.close();
			}
			catch(FileNotFoundException fe){
				System.out.println("文件创建失败");
			}
			catch(IOException fe){
				System.out.println("文件写入失败");
			}
		}
		for(int i=0;i<30;i++)System.out.print("=");System.out.println(); 	//分割线
		//2.从文件中读取这100个整数，计算其最大值、最小值和平均值并输出结果
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("D:\\a.txt"));//文件是否存在
			System.out.println("文件已存在");
			System.out.println("从已知文件获取数组");
			int num[] = new int[10];
			int n=0;
			while((n=dis.read())!= -1){
				for(int i=0;i<num.length;i++){
						num[i] = dis.read();
						//修正最后一个数组元素为文件结束标示,重新赋随机值
						if(num[i] == -1){
							Random r = new Random();
							num[i]=r.nextInt(100)+1;
						}
					System.out.print(num[i]+"\t");
				}
			}
			int max=0,min=0,adv=0;	//初始化最大值,最小值,平均值
			System.out.println(); 	//换行
			//获取最大值
			for(int i=0;i<num.length-1;i++){
				max= Math.max(num[i], num[i+1]);
			}
			//获取最小值
			for(int i=0;i<num.length-1;i++){
				min = Math.min(num[i], num[i+1]);
			}
			//获取平均值
			for(int i=0;i<num.length-1;i++){
				int nu =  num[i++];
				adv = nu/num.length;
			}
			System.out.println("最大值是:"+max+"\t"+"最小值是:"+min+"\t"+"平均值是:"+adv);
			//关闭流
			dis.close();
		}
		catch(FileNotFoundException e){
			//文件不存在
			System.out.println("文件不存在或不能被打开");
		}
		catch(IOException e){
			System.out.println("文件不能被读取或写入");
		}
	}
}
