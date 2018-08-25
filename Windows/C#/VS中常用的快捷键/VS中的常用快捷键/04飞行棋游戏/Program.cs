﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04飞行棋游戏
{
    class Program
    {
        //用静态字段来模拟全局变量
        public static int[] Maps = new int[100];
        //声明一个静态数组用来存储玩家AA和玩家B的坐标
        public static int[] PlayerPos = new int[2];
        //存储两个玩家的姓名
        public static string[] PlayerNames = new string[2];
        //两个玩家的标记
        public static bool[] Flags = new bool[2];   //Flags[0]默认是false Flags[1]默认是false
        static void Main(string[] args)
        {
            Program.GameShow();
            Console.ForegroundColor = ConsoleColor.Cyan;
            #region 输入玩家姓名
            Console.WriteLine("请输入玩家A的姓名");
            PlayerNames[0] = Console.ReadLine();
            while (PlayerNames[0] == "")
            {
                Console.WriteLine("错误:姓名不能为空,请重新输入");
                PlayerNames[0] = Console.ReadLine();
            }
            Console.WriteLine("请输入玩家B的姓名");
            PlayerNames[1] = Console.ReadLine();
            while (PlayerNames[1] == "" || PlayerNames[1] == PlayerNames[0])
            {
                if (PlayerNames[1] == "")
                {
                    Console.WriteLine("错误:姓名不能为空,请重新输入");
                    PlayerNames[1] = Console.ReadLine();
                }
                else
                {
                    Console.WriteLine("错误:玩家B的姓名不能喝玩家A的相同,请重新输入");
                    PlayerNames[1] = Console.ReadLine();
                }
            }
            #endregion
            Console.Clear();
            GameShow();
            Console.WriteLine("{0}的士兵用A表示", PlayerNames[0]);
            Console.WriteLine("{0}的士兵用B表示", PlayerNames[1]);
            Program.InitailMap();
            Program.DrawMap();
            //当玩家A跟玩家B没有一个人在终点的时候,两个玩家不停地去玩游戏
            while (PlayerPos[0] < 99 && PlayerPos[1] < 99 )
            {
                if (Flags[0] == false)
                {
                    PlayGame(0);
                }
                else
                {
                    Flags[0] = false;
                }
                if (PlayerPos[0]>=99)
                {
                    Console.WriteLine("玩家{0}无耻的赢了玩家{1}", PlayerNames[0], PlayerNames[1]);
                    break;
                }
                if (Flags[1] == false)
                {
                    PlayGame(1);
                }
                else
                {
                    Flags[1] = false;
                }
                if (PlayerPos[1] >=99)
                {
                    Console.WriteLine("玩家{0}无耻的赢了玩家{1}", PlayerNames[1], PlayerNames[0]);
                    break;
                }
            }//while
            Program.Win();
            Console.ReadKey();

        }
        /// <summary>
        /// 画游戏头
        /// </summary>
        public static void GameShow()
        {
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("******************************");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("******************************");
            Console.ForegroundColor = ConsoleColor.White;
            Console.WriteLine("******************************");
            Console.ForegroundColor = ConsoleColor.DarkGreen;
            Console.WriteLine("***********飞行棋*************");
            Console.ForegroundColor = ConsoleColor.DarkCyan;
            Console.WriteLine("******************************");
            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.WriteLine("******************************");
        }
        /// <summary>
        /// 声明地图数据
        /// </summary>
        public static void InitailMap()
        {
            int[] luckyturn = { 6, 23, 40, 55, 69, 83 };    //幸运轮盘◎
            for (int i = 0; i < luckyturn.Length; i++)
            {
                //int index = luckyturn[i];
                Maps[luckyturn[i]] = 1;     //luckyturn[i]是Maps[]中的元素下标
            }
            int[] landMine = { 5, 13, 17, 33, 38, 50, 64, 80, 94 }; //地雷☆
            for (int i = 0; i < landMine.Length; i++)
            {
                Maps[landMine[i]] = 2;
            }
            int[] pause = { 9, 27, 60, 93 };    //暂停▲
            for (int i = 0; i < pause.Length; i++)
            {
                Maps[pause[i]] = 3;
            }
            int[] timeTunnel = { 20, 25, 45, 63, 72, 88, 90 };  //时空隧道卐
            for (int i = 0; i < timeTunnel.Length; i++)
            {
                Maps[timeTunnel[i]] = 4;
            }
            
        }
        /// <summary>
        /// 画地图
        /// </summary>
        public static void DrawMap()
        {
            Console.WriteLine("图例:幸运轮盘◎     地雷☆     暂停▲     时空隧道卐");
            #region 第一横行
            //第一横行
            for (int i = 0; i < 30; i++)
            {
                Console.Write(DrawStringMap(i));
            }
            #endregion
            //画完第一横行后换行
            Console.WriteLine();
            #region 第一竖行
            //第一竖行
            for (int i = 30; i < 35; i++)
            {
                for (int j = 0; j < 29; j++)
                {
                    Console.Write("  ");
                }
                Console.Write(DrawStringMap(i));
                Console.WriteLine();
            }
            #endregion
            #region 第二横行
            for (int i = 64; i >= 35; i--)
            {
                Console.Write(DrawStringMap(i));
            }
            #endregion
            //画完第二恒行
            Console.WriteLine();
            #region 第二竖行
            for (int i = 65; i <= 69; i++)
            {
                Console.WriteLine(DrawStringMap(i));
            }
            #endregion
            #region 第三横行
            for (int i = 70; i < 100; i++)
            {
                Console.Write(DrawStringMap(i));
            }
            #endregion
            //画完最后一行,应该换行
            Console.WriteLine();
        }
        /// <summary>
        /// 从画地图方法中抽象出来的一个方法
        /// </summary>
        /// <param name="i">获取位置</param>
        /// <returns>返回当前的字符</returns>
        public static string DrawStringMap(int i)
        {
                //第一横行
                 string str = "";
                //如果玩家A和玩家B的坐标相同,并且都在这个地图上,画一个<>
                if (PlayerPos[0] == PlayerPos[1] && PlayerPos[0] == i)
                {
                    str ="<>";
                }
                else if (PlayerPos[0] == i)
                {
                    str ="Ａ";
                }
                else if (PlayerPos[1] == i)
                {
                   str = "Ｂ";
                }
                else
                {
                    switch (Maps[i])
                    {
                        case 0:
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            str ="□";
                            break;
                        case 1:
                            Console.ForegroundColor = ConsoleColor.DarkRed;
                            str ="◎";
                            break;
                        case 2:
                            Console.ForegroundColor = ConsoleColor.Gray;
                            str ="☆";
                            break;
                        case 3:
                            Console.ForegroundColor = ConsoleColor.Cyan;
                            str ="▲";
                            break;
                        case 4:
                            Console.ForegroundColor = ConsoleColor.Blue;
                            str ="卐";
                            break;
                    }
                }
                return str;
        }
        /// <summary>
        /// 玩游戏
        /// </summary>
        public static void PlayGame(int playerNumber)
        {
            Random r = new Random();
            int rNumber = r.Next(1, 7);
            Console.WriteLine("{0}按任意键开始掷骰子", PlayerNames[playerNumber]);
            Console.ReadKey(true);
            Console.WriteLine("{0}掷出了{1}", PlayerNames[playerNumber],rNumber);
            PlayerPos[playerNumber] += rNumber;
            ChangePos();
            Console.ReadKey(true);
            Console.WriteLine("{0}按任意键开始行动", PlayerNames[playerNumber]);
            Console.ReadKey(true);
            Console.WriteLine("{0}按任意键开始行动", PlayerNames[playerNumber]);
            Console.ReadKey(true);
            //玩家A有可能猜到了玩家B 方块 幸运轮盘 地雷 暂停 时空隧道
            if (PlayerPos[playerNumber] == PlayerPos[1-playerNumber])
            {
                Console.WriteLine("玩家{0}猜到了玩家{1},玩家{2}退6格", PlayerNames[playerNumber], PlayerNames[1-playerNumber], PlayerNames[1-playerNumber]);
                PlayerPos[1-playerNumber] -= 6;
                ChangePos();
                Console.ReadKey(true);
            }
            else  //踩到了关卡
            {
                //玩家的坐标
                switch (Maps[PlayerPos[playerNumber]])  // 0 1 2 3 4
                {
                    case 0:
                        Console.WriteLine("玩家{0}猜到了方块,安全", PlayerNames[playerNumber]);
                        Console.ReadKey(true);
                        break;
                    case 1:
                        Console.WriteLine("玩家{0}猜到了幸运轮盘,请选择 1--交换位置 2--轰炸对方",PlayerNames[playerNumber]);
                        string input = Console.ReadLine();
                        while (true)
                        {
                            if (input == "1")
                            {
                                Console.WriteLine("玩家{0}选择跟玩家{1}交换位置", PlayerNames[playerNumber], PlayerNames[1-playerNumber]);
                                Console.ReadKey(true);
                                int temp = PlayerPos[playerNumber];
                                PlayerPos[playerNumber] = PlayerPos[1 - playerNumber];
                                PlayerPos[1 - playerNumber] = temp;
                                Console.WriteLine("交换完成!!按任意键继续游戏");
                                Console.ReadKey(true);
                                break;
                            }
                            else if (input == "2")
                            {
                                Console.WriteLine("玩家{0}选择轰炸玩家{1},玩家{2}退6格", PlayerNames[playerNumber], PlayerNames[1-playerNumber],PlayerNames[1-playerNumber]);
                                Console.ReadKey(true);
                                PlayerPos[1 - playerNumber] -= 6;
                                ChangePos();
                                Console.WriteLine("玩家{0}退了6格", PlayerNames[1 - playerNumber]);
                                Console.ReadKey(true);
                                break;
                            }
                            else
                            {
                                Console.WriteLine("只能输入1或者2 1--交换位置 2--轰炸对方");
                                input = Console.ReadLine();
                            }
                        }
                        break;
                    case 2:
                        Console.WriteLine("玩家{0}踩到了地雷,退6格", PlayerNames[playerNumber]);
                        Console.ReadKey(true);
                        PlayerPos[playerNumber] -= 6;
                        ChangePos();
                        break;
                    case 3:
                        Console.WriteLine("玩家{0}踩到了暂停,暂停一回合", PlayerNames[playerNumber]);
                        Flags[playerNumber] = true;
                        Console.ReadKey(true);
                        break;
                    case 4:
                        Console.WriteLine("玩家{0}踩到了时空隧道,前进10格", PlayerNames[playerNumber]);
                        PlayerPos[playerNumber] += 10;
                        ChangePos();
                        Console.ReadKey(true);
                        break;
                }//switch
            }//else
            ChangePos();    //一次性限制
            Console.Clear();
            DrawMap();
        }
        /// <summary>
        /// 当玩家坐标发生改变时调用
        /// </summary>
        public static void ChangePos()
        {
            if (PlayerPos[0] < 0)
            {
                PlayerPos[0] = 0;
            }
            if (PlayerPos[0] >= 99)
            {
                PlayerPos[0] = 99;
            }
            if (PlayerPos[1] < 0)
            {
                PlayerPos[1] = 0;
            }
            if (PlayerPos[1] >= 99)
            {
                PlayerPos[1] = 99;
            }
        }
        //玩家胜利
        public static void Win()
        {
            //Console.WriteLine("■         ■■■          ■    ■■■■■      ■■■■  ");
            //Console.WriteLine("■         ■■■          ■      ■      ■      ■");
            //Console.WriteLine("  ■      ■     ■     ■        ■      ■      ■");
            //Console.WriteLine("  ■      ■     ■     ■        ■      ■      ■");
            //Console.WriteLine("    ■■■          ■■■        ■■■■■    ■      ■");

            //中文全角
            Console.WriteLine("■　　　　　　　■■■　　　　　　　■　　　　■■■■■　　　　　　■■■■　　");
            Console.WriteLine("■　　　　　　　■■■　　　　　　　■　　　　　　■　　　　　　■　　　　　　■");
            Console.WriteLine("　■　　　　　■　　　■　　　　　■　　　　　　　■　　　　　　■　　　　　　■");
            Console.WriteLine("　　■　　　■　　　　　■　　　■　　　　　　　　■　　　　　　■　　　　　　■");
            Console.WriteLine("　　　■■■　　　　　　　■■■　　　　　　　■■■■■　　　　■　　　　　　■");
        }
    }
}
