/*
4 - Utilizando operaciones con String, invertir una cadena sin destruir su valor original (inmutabilidad).
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<locale.h>
#include<conio.h>
#include<ctime> // o tambien
#include<time.h>

main()
{
    char palabra[25],palabra1[25];
    int i,longitud,x;
    printf("INGRESE UNA PALABRA: ");
    _flushall();
    gets(palabra);
    puts(palabra);
    longitud=strlen(palabra);
    x=longitud-1;
    for ( i = 0; i < x; i++)
    {          
        palabra1[longitud]=palabra[i];
        //printf("%c",palabra[i]);
        printf("\n\nvalor i: %d",i); 
        printf("\nvalor longitud: %d",longitud);
        longitud--;
    }    
    printf("PALABRA ORIGINAL: ");
    puts(palabra);
    printf("PALABRA INVERTIDA: ");
    puts(palabra1);
    printf("\n");
    system("pause");    
}