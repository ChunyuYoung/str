import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuickProgramLanucherMain {
    public static void main(String args[]){
        //画程序头部
        System.out.println("+----------------------------------------------------------+");
        System.out.println("|                                                          |");
        System.out.println("|       =====      =======    =======                      |");
        System.out.println("|       |             |       |       \\     \\/     \\/      |");
        System.out.println("|       =====         |       |_______/         |          |");
        System.out.println("|           |         |       | |               |          |");
        System.out.println("|       =====         |       |  \\          \\   |   /      |");
        System.out.println("|                     |       |    \\__       \\_____/       |");
        System.out.println("|                                                          |");
        System.out.println("|                                                          |");
        System.out.println("| 作者:StringOD 欢迎使用快速程序启动器(QuickProgramLanucher). |");
        System.out.println("|        GitHub:https://github.com/TianruiShi/str          |");
        System.out.println("|       By Stri2ngOD welcome to QuickProgramLanucher.       |");
        System.out.println("+----------------------------------------------------------+");

        System.out.println("1. 显示默认已添加路径        2. 启动默认程序       3.退出程序");
        File file = new File("info.txt");       //创建配置文件
        Scanner scanner = new Scanner(System.in);
        while(true){
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    try{
                        FileReader fileReader = new FileReader(file);
                        int read = 0;
                        try{
                            char ch[] = new char[100];
                            while ((read = fileReader.read(ch,0,100)) != -1){

                            }
                            for(int i=0;i<ch.length;i++)
                                System.out.print(ch[i]);
                        }
                        catch (IOException e1){
                            System.out.println("不能读取或打开info.txt配置文件,请查看是否被其他程序占用");
                        }

                    }
                    catch (FileNotFoundException e){
                        System.out.println("找不到配置文件,请在程序运行目录下创建info.txt文本文档");
                    }

                    break;
                case 2:
                    Runtime runtime = Runtime.getRuntime();
                    try{
                        runtime.exec("D:\\网易云音乐\\CloudMusic\\cloudmusic.exe");
                        runtime.exec("D:\\腾讯QQ\\Bin\\QQ.exe");
                        runtime.exec("D:\\HBuilder\\HBuilderX\\HBuilderX.exe");
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.write("D:\\网易云音乐\\CloudMusic\\cloudmusic.exe");
                        fileWriter.write("D:\\腾讯QQ\\Bin\\QQ.exe");
                        fileWriter.write("D:\\HBuilder\\HBuilderX\\HBuilderX.exe");
                        fileWriter.flush();
                    }
                    catch (IOException e){
                        System.out.println("程序不能被打开,因为不是合法的EXE可执行二进制程序");
                    }
                    break;
                case 3:
                    return;

                default:
                    System.out.println("不合法的操作");
            }

        }
    }
}
