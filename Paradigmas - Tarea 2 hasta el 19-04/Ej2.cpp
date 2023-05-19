#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

/*Por cada apartado, construir una funcion

//1) Que calcule la suma de los N primeros numeros naturales
2) Que imprima una lista de numeros naturales comprentidos entre dos valores "a" y "d"
3) Que devuelva los digitos de un numero entero
4) Que calcule X^Y mediente multiplicaciones sucesivas, siendo "x" e "y" dos numeros enteros
5) Que calcule X*Y mediente sumas sucesivas, siendo "x" e "y" dos numeros enteros*/

void distancia(int a1, int d1);

main()
{
	int a, d;
	printf("Ingrese el valor de 'a': ");
	scanf("%i",&a);
	
	printf("Ingrese el valor de 'd': ");
	scanf("%i",&d);
	
	printf("\n");
	
	printf("Los numeros entre el %i y el %i son:\n\n\t",a,d);
	distancia(a,d);
	
	printf("\n\n");
	system("pause");
}

void distancia(int a1, int d1)
{
	if (a1>d1 and a1-1!=d1) // A > D
	{
		printf("%i",a1-1);
		if (a1>d1+2) printf(" | ");
		distancia(a1-1,d1);
	}
	else if (a1<d1 and a1+1!=d1) //D > A
	{
		printf("%i",a1+1);
		if (a1<d1-2) printf(" | ");
		distancia(a1+1,d1);
	}
}
