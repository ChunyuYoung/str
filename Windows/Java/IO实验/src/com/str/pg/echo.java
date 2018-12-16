package com.str.pg;
import java.io.*;
import java.util.Scanner;
import java.util.Date;
public class echo {
	public static void main(String args[]){
		//1.复制包含中英文文本、图片和表格的Word文档
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//分割线
		try{
			FileInputStream fi = new FileInputStream("F:\\123.docx");
			FileOutputStream fo = new FileOutputStream("F:\\123_bak.docx");
			int n = 0;
			while((n=fi.read()) != -1){
				fo.write(n);
			}
			System.out.println("文件复制成功");
			fi.close();
			fo.close();
		}
		catch(FileNotFoundException e){
			System.out.println("找不到文件");
		}
		catch(IOException e){
			System.out.println("文件不能被成功写入");
		}
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//分割线
		//2.将键盘输入的内容保存在D盘的b.txt文件中
		Scanner value = new Scanner(System.in);
		System.out.println("请输入内容");
		String s = value.next();
		try{
			FileWriter out = new FileWriter("F:\\TXT.txt");
			out.write(s);
			out.close();
		}
		catch(IOException e){
			System.out.println("文件不能被成功写入");
		}
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//分割线
		//3..使用BufferedReader类和BufferedWriter类实现将键盘输入的n行内容保存到D盘的c.txt文件中
		try{
			//File f = new File("D:\\c.txt");
			FileOutputStream fos = new FileOutputStream("F:\\c.txt");	//创建文件
			BufferedReader br = new BufferedReader(new FileReader("F:\\c.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\c.txt"));
			System.out.println("输入一个整数(最好是小于5的整数,这样会更加的方便)");
			int n1 = value.nextInt();		//获取行数
			String ch[] = new String[n1];
			System.out.println("请输入内容");
			int nn=0;
			for(int i =0;i<ch.length;i++){
				ch[i] = value.next();		//获取每行的内容
				bw.write(ch[i]);
				bw.newLine();				//换行
			}
			System.out.println("文件写入成功");
			br.close();
			bw.close();
		}
		catch(FileNotFoundException e){
			System.out.println("找不到文件");
		}
		catch(IOException e){
			System.out.println("文件不能被写入");
		}
		//4.读取D盘文件b.txt，并>数组<文件的相关属性，如：长度、路径、是否可读，是否为文件夹、是否存在等属性。
		//文件属性:名称,类型,文件路径,大小,创建日期,修改日期,属性[只读,隐藏],可用性,所有者,计算机
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//分割线
		System.out.println("输出文件b.txt的属性");
		try {
			FileOutputStream fos1 = new FileOutputStream("F:\\b.txt");	//创建文件
			Date time = new Date();										//实例化日期对象
			//System.out.println("现在的时间是:"+time.toString());
			FileInputStream fis1 = new FileInputStream("F:\\b.txt");	//读取文件
			File f1 = new File("F:\\b.txt");							//实例化文件对象
			String property[] = new String[11];							//文件属性
			BufferedReader bfr = new BufferedReader(new FileReader("F:\\b.txt"));
			BufferedWriter bfw = new BufferedWriter(new FileWriter("F:\\b.txt"));
			bfw.write("我不知道那个方法的长度是指字节还是什么");						//一个字为两个字节
			bfw.flush(); 												//刷新缓冲区
			//---------------------------------------------------------------------
			//单行输出属性,打算使用循环语句压缩调用属性的代码
			
			//文件名称
			String sn = f1.getName();									//获取文件名称
			System.out.println("名称:"+sn.replace(".txt",""));			//删除文件扩展名
			
			//文件类型											
			System.out.println("类型:"+sn.replaceAll("b", ""));			//删除文件名
			
			//文件路径
			System.out.println("路径:"+f1.getPath());						//获取文件路径
			
			//文件大小
			System.out.println("大小:"+f1.length()+"字节");				//获取文件长度
			
			//文件创建日期
			System.out.println("创建日期:"+time.toString());				//文档创建日期
			
			//文件修改日期(时间格式化:未解决)
			System.out.println("修改时间:"+f1.lastModified());				//文档最后一次修改日期
//			String sti = f1.lastModified()+"";							//转换long类型为字符串
//			System.out.println(sti.toString());
			
			//标准文件
			System.out.println("标准文件:"+f1.isFile()); 					//是否是标准文件
			
			//只读
			System.out.println("只读文件:"+f1.setReadOnly());				//文件是否只能读
			
			//隐藏文件
			System.out.println("隐藏文件:"+f1.isHidden()); 				//文件是否被隐藏
			
			//可用性
			System.out.println("可用性:可用(这个文档不需要访问网络)"); 			//是否需要网络访问
			
			//所有者
			System.out.println("所有者:"+f1.setWritable(false));			//你的权限够吗
			
			//路径名的Hash
			System.out.println("Hash:"+f1.hashCode());					//计算路径名的哈希值
			
			//关闭流
			fos1.close();
			fis1.close();
			bfr.close();
			bfw.close();
		}
		catch(IOException e) {
//			System.out.println("文件不能被创建或不能被读取");
//			System.out.println("请删除b文件并重新运行");
			
			//删除无法打开的而文件
			File f = new File("F:\\b.txt");
			f.delete();
			System.out.println("文件被删除,重新创建文件");
			//重新创建文件
			try {
			FileOutputStream fos1 = new FileOutputStream("F:\\b.txt");	//创建文件
			Date time = new Date();										//实例化日期对象
			//System.out.println("现在的时间是:"+time.toString());
			FileInputStream fis1 = new FileInputStream("F:\\b.txt");	//读取文件
			File f1 = new File("F:\\b.txt");							//实例化文件对象
			//String property[] = new String[11];							//文件属性
			BufferedReader bfr = new BufferedReader(new FileReader("F:\\b.txt"));
			BufferedWriter bfw = new BufferedWriter(new FileWriter("F:\\b.txt"));
			bfw.write("我不知道那个方法的长度是指字节还是什么");						//一个字为两个字节
			bfw.flush(); 												//刷新缓冲区
			//---------------------------------------------------------------------
			//单行输出属性,打算使用循环语句压缩调用属性的代码
			
			//文件名称
			String sn = f1.getName();									//获取文件名称
			System.out.println("名称:"+sn.replace(".txt",""));			//删除文件扩展名
			
			//文件类型											
			System.out.println("类型:"+sn.replaceAll("b", ""));			//删除文件名
			
			//文件路径
			System.out.println("路径:"+f1.getPath());						//获取文件路径
			
			//文件大小
			System.out.println("大小:"+f1.length()+"字节");				//获取文件长度
			
			//文件创建日期
			System.out.println("创建日期:"+time.toString());				//文档创建日期
			
			//文件修改日期
			System.out.println("修改时间:"+f1.lastModified());				//文档最后一次修改日期
			
			//标准文件
			System.out.println("标准文件:"+f1.isFile()); 					//是否是标准文件
			
			//只读
			System.out.println("只读文件:"+f1.setReadOnly());				//文件是否只能读
			
			//隐藏文件
			System.out.println("隐藏文件:"+f1.isHidden()); 				//文件是否被隐藏
			
			//可用性
			System.out.println("可用性:可用(这个文档不需要访问网络)"); 			//是否需要网络访问
			
			//所有者
			System.out.println("所有者:"+f1.setWritable(false));			//你的权限够吗
			
			//路径名的Hash
			System.out.println("Hash:"+f1.hashCode());					//计算路径名的哈希值
			
			//文件夹
			System.out.println("文件夹:"+f1.isDirectory()); 				//判断文件是否是文件夹
			
			//关闭流
			fos1.close();
			fis1.close();
			bfr.close();
			bfw.close();
		}
		catch(IOException fe) {
			System.out.println("文件写入失败");
		}
			for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//分割线
		//5.判断D盘上是否存在a.txt文件，若不存在则创建该文件。之后更改文件名为b5.txt。
		try {
			File f1 = new File("F:\\b.txt");
			if(f1.getAbsolutePath() == "F:\\a.txt") {
				System.out.println("文件将被重名:a.txt-->b5.txt");
				FileInputStream fis_b5 = new FileInputStream("F:\\a.txt");
				FileOutputStream fos_b5 = new FileOutputStream("F:\\b5.txt"); 	//重名文件
				int fnos = 0;
				while((fnos=fis_b5.read()) != -1) {
					fos_b5.write(fnos);
				}
			}
			else {
				FileOutputStream fos = new FileOutputStream("F:\\a.txt");		//创建文件
				System.out.println("文件将被重名:a.txt-->b5.txt");
				FileInputStream fis_b5 = new FileInputStream("F:\\a.txt");
				FileOutputStream fos_b5 = new FileOutputStream("F:\\b5.txt"); 	//重名文件
				int fnos = 0;
				while((fnos=fis_b5.read()) != -1) {
					fos_b5.write(fnos);
				}
				fis_b5.close();
				fos_b5.close();
			}
		}
		catch(FileNotFoundException fe) {
			System.out.println("无法创建文件");
		}
		catch(IOException ioe) {
			System.out.println("文件拒绝被写入");
		}
	}
	}
}