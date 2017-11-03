#include <stdio.h>


float addieren (float a, float b, float c, float d)
{
	
	float sum;
	sum=a+b+c+d;
	
	
return sum;
}



int main ()
{
	float a;
	float b;
	float c;
	float d;
	
	
	printf("Bitte geben sie die erste Zahl ein !\n");
	scanf("%f", &a);
	printf("Bitte geben sie die zweite Zahl ein !\n");
	scanf("%f", &b);
	printf("Bitte geben sie die dritte Zahl ein !\n");
	scanf("%f", &c);
	printf("Zum Schluss geben sie die letzte Zahl ein !\n");
	scanf("%f", &d);
	
	float erg  =  addieren(a,b,c,d); 
	
	printf("Die Summe aller Zahlen ergibt %f", erg);
	
	
	
	return 0;
}
