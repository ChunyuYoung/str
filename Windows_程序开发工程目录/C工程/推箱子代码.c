/*
 ***************************************************
 *                                                 *
 *              游戏项目：推箱子                   *
 *                                                 *
 *              截止时间：2016.08.09               *
 *                                                 *
 *              编译器：Dev C++ 5.10               *
 *                                                 *
 * 	            作者相关：星羽                     *
 *                                                 *
 ***************************************************
*/
/*
空地         0
墙           1
人           2
箱           3
目的地       4
箱到达目的地 7 
*/ 
#include<stdio.h>
#include<windows.h>
#include<conio.h>

int i,j;
int map[10][10]={{0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,0,0,0},
                {0,0,0,1,0,2,1,1,1,0},
				{0,0,0,1,0,3,0,0,1,0},
				{0,0,1,1,1,0,1,0,1,1},
				{0,0,1,4,1,0,1,0,0,1},
                {0,0,1,4,3,0,0,1,0,1},
                {0,0,1,4,0,0,0,3,0,1},
				{0,0,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0}}; 

void color(int ncolor);
void PlayGame();
void DrawMap();

int main()
{	 
    system("title 推箱子") ;
	system("mode con cols=30 lines=21");
	PlayGame();
	return 0;
 } 
 
void PlayGame()
{
	char input;
	int bushu=0; 
	while(1)
	{
		system("cls");
		color(15);  //白色 
		printf("\t推箱子\n");
		DrawMap();
		color(7);
		for(i=0;i<10;i++)     //i横行 
		{
			for(j=0;j<10;j++)    //竖行 
			{
				if(map[i][j]==2)
				{
					printf("人当前位置(x,y)：%d，%d\n",j-1,i);
				    goto loop;
				}				    
			}
		}  	
		//标记人物2的位置 map[i][j] 
		loop:
		color(13);
		printf("当前有效移动步数 %d 步\n",bushu);
		color(3);
		printf("wsad进行移动\np直接结束游戏\n♀为玩家控制对象\n"); 
		color(128);
		printf("请注意输入法！可能影响游戏性");
		input=getch();    //getch()=getchar()+enter
		
		switch(input)
		{
			case 'W':       //向上移动 
			case 'w':    
				if(map[i-1][j]==0)
				{
					map[i][j]=0;
					map[i-1][j]=2;
				}
				 else if(map[i-1][j]==3)
				 {
				 	if(map[i-2][j]==0)
				 	{
				 		map[i-2][j]=3;
				 		map[i-1][j]=2;
				 		map[i][j]=0;
					 }
					 if(map[i-2][j]==4)
					 {
					 	map[i-2][j]=7;
				 		map[i-1][j]=2;
				 		map[i][j]=0;
					 }
				 }
				 else if(map[i-1][j]==7)
				 {
				 	if(map[i-2][j]==4)
				 	{
				 		map[i-2][j]=7;
				 		map[i-1][j]=2;
				 		if((i==7&&j==3)||(i==6&&j==3))
				 		{
				 			map[i][j]=4;
						 }else{
						 	map[i][j]=0;
						 }
					}
				 }
				 else if(map[i-1][j]==4)
				 {
				 	map[i-1][j]=2;
				 	map[i][j]=4;
				 }
				 bushu++;
				break;
			case 'S':case 's':   //向下移动 
			    if(map[i+1][j]==0)
				{
					map[i][j]=0;
					map[i+1][j]=2;
				}
				else if(map[i+1][j]==3)
				{
					if(map[i+2][j]==0)
				 	{
				 		map[i+2][j]=3;
				 		map[i+1][j]=2;
				 		map[i][j]=0;
					 }
					 if(map[i+2][j]==4)
				 	{
				 		map[i+2][j]=7;
				 		map[i+1][j]=2;
				 		map[i][j]=0;
					 }
				}
				else if(map[i+1][j]==4)
				{
					map[i][j]=4;
					map[i+1][j]=2;
				}
				bushu++;
				break;
			case 'A':case 'a':   //向左移动 
			    if(map[i][j-1]==0||map[i][j-1]==4)
				{
					map[i][j]=0;
					map[i][j-1]=2;
				}
				else if(map[i][j-1]==3)
				{
					if(map[i][j-2]==0)
					{
						map[i][j-2]=3;
						map[i][j-1]=2;
						map[i][j]=0;
					}
					if(map[i][j-2]==4)
					{
						map[i][j-2]=7;
						map[i][j-1]=2;
						map[i][j]=0;
					}
				}
				bushu++;
				break;
			case 'D':case 'd':   //向右移动 
			    if(map[i][j+1]==0)
				{
					if((i==7&&j==3)||(i==6&&j==3))
					{
						map[i][j]=4;
						map[i][j+1]=2;
					}else{
						map[i][j]=0;
				    	map[i][j+1]=2;
					}
					
				}
				else if(map[i][j+1]==3)
				{
					if((i==7&&j==3)||(i==6&&j==3))
					{
						if(map[i][j+2]==0)
						map[i][j+2]=3;
						map[i][j+1]=2;
						map[i][j]=4;
					}
					else if(map[i][j+2]==0)
					{
						map[i][j+2]=3;
						map[i][j+1]=2;
						map[i][j]=0;
					}
					if(map[i][j+2]==4)
					{
						map[i][j+2]=7;
						map[i][j+1]=2;
						map[i][j]=0;
					}
				}
				bushu++;
				break;
			case 'P': case 'p':
				return ;
		}
		if((map[5][3]==7)&&(map[6][3]==7)&&(map[7][3]==7))
		{
			system("cls");
			map[5][3]==7;
			map[6][3]==7;
			map[7][3]==7;
			DrawMap();
			color(13);
			printf("\n\tYou win!");
			printf("\n\t移动步数一共 %d 步",bushu); 
			goto loop1;
		}
	}
	loop1:getch();
 } 
 
/*
空地         0
墙           1
人           2
箱           3
目的地       4
箱到达目的地 7 
*/ 
//画地图： 
 void DrawMap()
 {
 	for(i=0;i<10;i++)
 	{
 		for(j=0;j<10;j++)
 		{
 			switch(map[i][j])
 			{
 				case 0:printf("  ");break;              //空地 
 				case 1:color(15);printf("■");break;    //墙 
 				case 2:color(10);printf("♀");break;    //人 
 				case 3:color(9);printf("□");break;     //箱 
 				case 4:color(11);printf("☆");break;    //目的地 
 				case 7:color(11);printf("□");break;    //箱子+目的地 
			}
		}
		printf("\n");
	 }
 }
 
 
 //定义颜色代码   颜色代号见《c从入门到精通》 
 void color(int ncolor)
{
	HANDLE hColor=GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(hColor,ncolor);   //实现API设置背景和文本的颜色 
} 
