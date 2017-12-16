/*
 ***************************************************
 *                                                 *
 *              ��Ϸ��Ŀ��������                   *
 *                                                 *
 *              ��ֹʱ�䣺2016.08.09               *
 *                                                 *
 *              ��������Dev C++ 5.10               *
 *                                                 *
 * 	            ������أ�����                     *
 *                                                 *
 ***************************************************
*/
/*
�յ�         0
ǽ           1
��           2
��           3
Ŀ�ĵ�       4
�䵽��Ŀ�ĵ� 7 
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
    system("title ������") ;
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
		color(15);  //��ɫ 
		printf("\t������\n");
		DrawMap();
		color(7);
		for(i=0;i<10;i++)     //i���� 
		{
			for(j=0;j<10;j++)    //���� 
			{
				if(map[i][j]==2)
				{
					printf("�˵�ǰλ��(x,y)��%d��%d\n",j-1,i);
				    goto loop;
				}				    
			}
		}  	
		//�������2��λ�� map[i][j] 
		loop:
		color(13);
		printf("��ǰ��Ч�ƶ����� %d ��\n",bushu);
		color(3);
		printf("wsad�����ƶ�\npֱ�ӽ�����Ϸ\n��Ϊ��ҿ��ƶ���\n"); 
		color(128);
		printf("��ע�����뷨������Ӱ����Ϸ��");
		input=getch();    //getch()=getchar()+enter
		
		switch(input)
		{
			case 'W':       //�����ƶ� 
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
			case 'S':case 's':   //�����ƶ� 
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
			case 'A':case 'a':   //�����ƶ� 
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
			case 'D':case 'd':   //�����ƶ� 
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
			printf("\n\t�ƶ�����һ�� %d ��",bushu); 
			goto loop1;
		}
	}
	loop1:getch();
 } 
 
/*
�յ�         0
ǽ           1
��           2
��           3
Ŀ�ĵ�       4
�䵽��Ŀ�ĵ� 7 
*/ 
//����ͼ�� 
 void DrawMap()
 {
 	for(i=0;i<10;i++)
 	{
 		for(j=0;j<10;j++)
 		{
 			switch(map[i][j])
 			{
 				case 0:printf("  ");break;              //�յ� 
 				case 1:color(15);printf("��");break;    //ǽ 
 				case 2:color(10);printf("��");break;    //�� 
 				case 3:color(9);printf("��");break;     //�� 
 				case 4:color(11);printf("��");break;    //Ŀ�ĵ� 
 				case 7:color(11);printf("��");break;    //����+Ŀ�ĵ� 
			}
		}
		printf("\n");
	 }
 }
 
 
 //������ɫ����   ��ɫ���ż���c�����ŵ���ͨ�� 
 void color(int ncolor)
{
	HANDLE hColor=GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(hColor,ncolor);   //ʵ��API���ñ������ı�����ɫ 
} 
