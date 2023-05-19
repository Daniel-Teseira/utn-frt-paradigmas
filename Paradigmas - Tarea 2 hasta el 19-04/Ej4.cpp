#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

/*Por cada apartado, construir una funcion

//1) Que calcule la suma de los N primeros numeros naturales
//2) Que imprima una lista de numeros naturales comprentidos entre dos valores "a" y "d"
??3) Que devuelva los digitos de un numero entero
4) Que calcule X^Y mediente multiplicaciones sucesivas, siendo "x" e "y" dos numeros enteros
5) Que calcule X*Y mediente sumas sucesivas, siendo "x" e "y" dos numeros enteros*/

int potenciar(int X1, int Y1);

main()
{
	int X,Y;
	printf("Ingrese el valor de X: ");
	scanf("%i",&X);
	printf("Ingrese el valor de Y: ");
	scanf("%i",&Y);
	
	int resultado= potenciar(X,Y);
	
	printf("\nEl resultado de %i^%i es: %i\n\n",X,Y,resultado);
	system("pause");
}

int potenciar(int X1, int Y1)
{
	int result;
	if (Y1==1) result=X1;
	else if (Y1>1)
	{
		result = X1 * potenciar(X1, Y1-1);
	}
	else if (Y1<0)
	{
		result = X1 * potenciar(X1, Y1+1);
	}

}
