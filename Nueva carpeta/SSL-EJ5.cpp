#include <stdio.h>
#include <conio.h>
#include <string.h>

main()
{
	char cadena[30], cadenabuscar[30];
	int resultado;
	
	printf("\n\n Ingrese una palabra: ");
	gets(cadena);
	
	printf("\n Ingrese la palabra a buscar: ");
	gets (cadenabuscar);
	
	resultado=strstr(cadena, cadenabuscar)-cadena;
	if(resultado>=0)
	{
		printf ("\n La palabra a buscar se encuentra en la palabra ingresada");
	}
	else
	{
		printf("\n La palabra a buscar no se encuentra en la palabra ingresada");
	}
}
