#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

/*Por cada apartado, construir una funcion

//1) Que calcule la suma de los N primeros numeros naturales
//2) Que imprima una lista de numeros naturales comprentidos entre dos valores "a" y "d"
3) Que devuelva los digitos de un numero entero
4) Que calcule X^Y mediente multiplicaciones sucesivas, siendo "x" e "y" dos numeros enteros
5) Que calcule X*Y mediente sumas sucesivas, siendo "x" e "y" dos numeros enteros*/

int digitos(int numero1);

main ()
{
	int numero, nums;
	printf("Ingrese un numero para encontrar sus digitos: ");
	scanf("%i",&numero);
	
	printf("\n\nLos digitos del numero son: \n\n\t");
	nums=digitos(numero);
	printf("\n\n");

	system("pause");
}

int digitos(int numero1)
{
	if (numero1<10)
	{
		printf("%i | ",numero1);
		return numero1;
	}
	else
	{
		return ((numero1%10) + digitos(numero1/10))/digitos(numero1%10);
	}
}
