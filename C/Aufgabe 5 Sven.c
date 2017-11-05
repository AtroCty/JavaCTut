#include<stdio.h>
#include<math.h>

int main()
{
	int a,b,c;
    int Wurzel;
   
	printf("Gebe die Seitenlaenge a des Dreiecks an\n");
	scanf("%d",&a);
	printf("Gebe die Seitenlaenge b des Dreiecks an\n");
	scanf("%d",&b);
	printf("Gebe die Seitenlaenge c des Dreiecks an\n");
	scanf("%d",&c);
	
	if( a+b <= c)
	{
		printf("Das Dreick ist ungueltig");
	}
	
	Wurzel= sqrt(a*a+b*b);
	if(Wurzel == c)   
	{
		printf("Es handelt sich um ein rechtwinkliges Dreieck");
	}

	if(a==b && a==c && b==c)
	{
		printf("Es handelt sich um ein gleichseitiges Dreieck");
	} 
		
	
	return 0;
}
