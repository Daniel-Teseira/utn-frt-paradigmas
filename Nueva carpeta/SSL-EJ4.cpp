#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 4 - Utilizando operaciones con String, invertir una cadena sin destruir su valor original (inmutabilidad).

int main() {
	int n;
	char *cadena, *cadenaInvertida;
	
	printf("Ingresar la cantidad de caracteres o espacio de memoria para la el string: ");
	scanf("%d",&n);
	getchar();
	
	cadena = (char *)malloc(n*sizeof(char));
	cadenaInvertida = (char *)malloc(strlen(cadena)+1);
	
	if(NULL == cadena){
		printf("\nError al asignar memoria.");
	}
	else{
		printf("\nSe asigno %d caracteres de memoria correctamente.",n);
	}
	
	printf("\n\nIngresar cadena de caracteres a invertir: ");
	gets(cadena);
	
	strcpy(cadenaInvertida, cadena);
	strrev(cadenaInvertida);
	
	printf("\nCadena ingresada invertida:  ",cadenaInvertida);
	puts(cadenaInvertida);
	free(cadenaInvertida);
	printf("\nCadena ingresada por el usuario:  ",cadena);
	puts(cadena);
	free(cadena);
}	
