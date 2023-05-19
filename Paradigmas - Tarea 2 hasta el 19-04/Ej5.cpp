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

int multiplicacionesSucesivas(int X1, int Y1);

main()
{
	int X,Y;
	printf("Ingrese el valor de X: ");
	scanf("%i",&X);
	printf("Ingrese el valor de Y: ");
	scanf("%i",&Y);
	
	int resultado= multiplicacionesSucesivas(X,Y);
	
	printf("\nEl resultado de %i*%i es: %i\n\n",X,Y,resultado);
	system("pause");
}

int multiplicacionesSucesivas(int X1, int Y1)
{
	if (Y1==1) return X1;
	if (Y1>0)
	{
		return X1+multiplicacionesSucesivas(X1,Y1-1);
	}
	else
	{
		return -X1+multiplicacionesSucesivas(X1,Y1+1);
	}
	return 0;
}
