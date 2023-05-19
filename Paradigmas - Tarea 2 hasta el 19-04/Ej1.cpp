#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

/*Por cada apartado, construir una funcion

1) Que calcule la suma de los N primeros numeros naturales
2) Que imprima una lista de numeros naturales comprentidos entre dos valores "a" y "d"
3) Que devuelva los digitos de un numero entero
4) Que calcule X^Y mediente multiplicaciones sucesivas, siendo "x" e "y" dos numeros enteros
5) Que calcule X*Y mediente sumas sucesivas, siendo "x" e "y" dos numeros enteros*/

int sumaNatural(int cantidadF);

main()
{
	int cantidad=0, resultado;
	printf("Ingrese la cantidad de numeros: ");
	scanf("%i",&cantidad);
	
	printf("\n");
	resultado = sumaNatural(cantidad);
	
	printf("\nLa suma de los primeros %i numeros naturales es de: %i\n\n",cantidad, resultado);
	system("pause");
}

int sumaNatural(int cantidadF)
{
	if (cantidadF>0)
	{
		//Habilitando estas lineas, se muestra en pantalla el trayecto de la recursion
		/*printf("%i",cantidadF);
		if (cantidadF!=1) printf(" + ");*/
		return sumaNatural(cantidadF-1) + cantidadF;
	}
	else return 0;
}
