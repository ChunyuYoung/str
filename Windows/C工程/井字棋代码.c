#include<stdio.h>
#include<windows.h>
#include<conio.h>

int i,j,who;
int map[9][7]={{0,0,0,0,0,0,0}, 
               {1,2,3,2,3,2,4},
               {5,0,5,0,5,0,5},
			   {6,2,7,2,7,2,8},
			   {5,0,5,12,5,0,5},
			   {6,2,7,2,7,2,8},
			   {5,0,5,0,5,0,5},
			   {9,2,11,2,11,2,10},
			   {0,0,0,0,0,0,0}};

void DrawMap();
void color(int ncolor);
void PlayGame();

int main()
{
	system("Title 井字棋");
	system("mode con cols=41 lines=16");
	PlayGame();
	return 0;
}

void PlayGame()
{
	who=rand()%2;
	switch(who)
	{
		case 0:
			who=13;
			break;
		case 1:
			who=14;
			break;
	}
	DrawMap();
	char input;
	input=getch();
	while(1)
	{
		for(i=0;i<9;i++)    //取得准心位置 
		{
			for(j=0;j<7;j++)
			{
				if(map[i][j]==12)
				     goto loop;
			}
		}
		loop:
		 switch(input)
		 {
		 	case 'W': 
			case 'w':
				if(map[i-2][j]==0)
				{
					if(i!=2)
					{
						map[i-2][j]=12;
						map[i][j]=0;
					}else{
						if(map[6][j]==0)
					{
						map[6][j]=12;
						map[i][j]=0;
					}
					}
				}
		 		break;
		 	case 'A': 
			case 'a':
				if(map[i][j-2]==0)
				{
					if(j!=1)
					{
						map[i][j-2]=12;
						map[i][j]=0;
					}
				 } 
				 else if(j==1)
				 {
				 	if(map[i][5]==0)
						{
							map[i][5]=12;
						    map[i][j]=0;
						}
				 }
				break;
		 	case 'S': 
			case 's':
				if(map[i+2][j]==0)
				{
					if(i!=6)
					{
						map[i+2][j]=12;
						map[i][j]=0;
					}else{
						if(map[2][j]==0)
					{
						map[2][j]=12;
						map[i][j]=0;
					}
					}
				}
				break;
		 	case 'd': 
			case 'D':
				if(map[i][j+2]==0)
				{
					if(j!=5)
					{
						map[i][j+2]=12;
						map[i][j]=0;
					}
				 }
				 else if (j==5)
				 {
				 	if(map[i][1]==0)
						{
							map[i][1]=12;
						    map[i][j]=0;
						}
				 }		        
				break;
			case 'q':
			case 'Q':
				if(map[i-2][j-2]==0)
				{
					if(i!=2&&j!=1)
					{
						map[i-2][j-2]=12;
						map[i][j]=0;
					}else{
						if(map[6][5]==0)
						{
							map[i][j]=0;
							map[6][5]=12;
						}
					}
				}
				break;
			case 'z':
			case 'Z':
				if(map[i+2][j-2]==0)
				{
					if(i!=6&&j!=1)
					{
						map[i+2][j-2]=12;
						map[i][j]=0;
					}else{
						if(map[2][5]==0)
						{
							map[2][5]=12;
							map[i][j]=0;
						}
					}
				}
				break;
			case 'C':
			case 'c':
				if(map[i+2][j+2]==0)
				{
					if(i!=6&&j!=5)
					{
						map[i+2][j+2]=12;
						map[i][j]=0;
					}else{
						if(map[2][1]==0)
						{
							map[i][j]=0;
							map[2][1]=12;
						}
					}
				}
				break;
			case 'e':
			case 'E':
				if(map[i-2][j+2]==0)
				{
					if(i!=2&&j!=5)
					{
						map[i-2][j+2]=12;
						map[i][j]=0;
					}else{
						if(map[6][1]==0)
						{
							map[i][j]=0;
							map[6][1]=12;
						}
					}
				}
				break;
			case 'X':
			case 'x':
				if(who==13)
				{
					map[i][j]=13;
					who=14;
				 }else{
				 	map[i][j]=14;
					who=13;
				 }
				 if(map[2][1]==0)
				 {
				 	map[2][1]=12;
				  }
				  else if(map[2][3]==0) 
				  {
				  	map[2][3]=12;
				  }
				  else if(map[2][5]==0)
				  {
				  	map[2][5]=12;
				  }
				  else if(map[4][1]==0)
				 {
				 	map[4][1]=12;
				  }
				  else if(map[4][3]==0) 
				  {
				  	map[4][3]=12;
				  }
				  else if(map[4][5]==0)
				  {
				  	map[4][5]=12;
				  }
				  else if(map[6][1]==0)
				 {
				 	map[6][1]=12;
				  }
				  else if(map[6][3]==0) 
				  {
				  	map[6][3]=12;
				  }
				  else if(map[6][5]==0)
				  {
				  	map[6][5]=12;
				  }
				break;
			case 'P':
			case 'p':
				return 0;
		  } 
		  if(map[2][1]==13&&map[2][3]==13&&map[2][5]==13)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[4][1]==13&&map[4][3]==13&&map[4][5]==13)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[6][1]==13&&map[6][3]==13&&map[6][5]==13)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[2][1]==13&&map[4][3]==13&&map[6][5]==13)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[2][6]==13&&map[4][4]==13&&map[6][2]==13)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[2][1]==13&&map[4][1]==13&&map[6][1]==13)
		  {
		  	printf("黑棋方胜！！");
			return 0; 
		  }
		  else if(map[2][3]==13&&map[4][3]==13&&map[6][3]==13)
		  {
		  	printf("黑棋方胜！！");
			return 0; 
		  }
		  else if(map[2][5]==13&&map[4][5]==13&&map[6][5]==13)
		  {
		  	printf("黑棋方胜！！");
			return 0; 
		  }
		  else if(map[2][1]==14&&map[2][3]==14&&map[2][5]==14)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[4][1]==14&&map[4][3]==14&&map[4][5]==14)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[6][1]==14&&map[6][3]==14&&map[6][5]==14)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[2][1]==14&&map[4][3]==14&&map[6][5]==14)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[2][6]==14&&map[4][4]==14&&map[6][2]==14)
		  {
		  	printf("黑棋方胜！！");
			  return 0; 
		  }
		  else if(map[2][1]==14&&map[4][1]==14&&map[6][1]==14)
		  {
		  	printf("黑棋方胜！！");
			return 0; 
		  }
		  else if(map[2][3]==14&&map[4][3]==14&&map[6][3]==14)
		  {
		  	printf("黑棋方胜！！");
			return 0; 
		  }
		  else if(map[2][5]==14&&map[4][5]==14&&map[6][5]==14)
		  {
		  	printf("黑棋方胜！！");
			return 0; 
		  }
		  else if(map[2][1]!=0&&map[2][3]!=0&&map[2][5]!=0&&map[4][1]!=0&&map[4][3]!=0&&map[4][5]!=0&&map[6][1]!=0&&map[6][3]!=0&&map[6][5]!=0)
		  {
		  	printf("和局"); 
		  	return 0;
		  }
		  system("cls");
		  DrawMap();
		  input=getch();
	}
}


/*
┏   1
┅   2
┳   3
┓   4
┇   5
     0
┣   6
╋   7
┫   8
┗   9
┛   10
┻   11
¤   12   //准心
●    13
○  14 
*/               
 void DrawMap()
 { 	
 	for(i=0;i<9;i++)
 	{
 		printf("  ");
 		for(j=0;j<7;j++)
 		{
 			switch(map[i][j])
 			{
 				case 0:printf("  ");break;              
 				case 1:color(15);printf("┏");break;  
 				case 2:color(15);printf("┅");break; 
 				case 3:color(15);printf("┳");break;    
 				case 4:color(15);printf("┓");break; 
				case 5:color(15);printf("┇");break;  
				case 6:color(15);printf("┣");break;  
 				case 7:color(15);printf("╋");break;  
				 case 8:color(15);printf("┫");break; 
				 case 9:color(15);printf("┗");break; 
				 case 10:color(15);printf("┛");break; 
				 case 11:color(15);printf("┻");break;
				 case 12:color(14);printf("¤");break;
				 case 13:color(13);printf("●");break; 
				 case 14:color(13);printf("○");break; 
			}
		}
		color(5);
		printf("  ||  ");
		if(i==1)
		{
			color(15);
 	        printf("游戏名：井字棋"); 
		}
		else if(i==3)
		{
			color(15);
 	        printf("wsadqezc控制准心¤");
		}
		else if(i==4)
		{
			color(15);
 	        printf("x下棋 p结束游戏");
		}
		else if(i==6)
		{
			color(7);
 	        printf("作者：星羽");
		}
		else if(i==7)
		{
			color(128);
 	        printf("！游戏愉快！");
 	        color(0);
		}
		printf("\n");
	 }
 }

void color(int ncolor)
{
	HANDLE hColor=GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(hColor,ncolor);   //实现API设置背景和文本的颜色 
} 
