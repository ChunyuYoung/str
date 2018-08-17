//FXÇ¶Ì×Ñ­»·
#include<stdio.h>
int main(void) 
{
	const int HANG=10;
	const int LIE=10;
	int hang;
	char lie;

	for (hang=0;hang<HANG;hang++)
	{
		for(lie='A';lie<('A'+LIE);lie++)
		 	printf("%c",lie);
		 		printf("\n");
	 } 
	return 0;
}
