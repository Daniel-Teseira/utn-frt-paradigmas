
/*1 - Dada una lista de enteros verificar si uno dado pertenece a la lista, respetando el concepto de programa apropiado.

2 - Utilizar el operador ternario (___) ? ___ : ___
Si un dado entero verifica la relación de pertenencia a una lista de enteros devolver el texto "Pertenece" de lo contrario "No Pertenece".

3 - Con operaciones bit a bit, verificar si un número dado entero es impar.

4 - Utilizando operaciones con String, invertir una cadena sin destruir su valor original (inmutabilidad).

5 - Dados dos strings verificar si alguno es substring del otro.
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
    int a[10],i,buscar,j;
    bool esta;
    printf("INGRESE UNA LISTA DE 10 NUMEROS: ");
    for (i = 0; i < 10; i++)
    {
       printf("Elemento %d: ",i+1);
       scanf("%d",&a[i]);
    }
    printf("INGRESE UN NUMERO A BUSCAR: ");
    scanf("%d",&buscar);

    for ( j = 0; j < 10; j++)
    {
        if (a[j]==buscar)
        {
            esta=true;
        }        
    }
    
    if (esta==true)
    {
        printf("EL NUMERO BUSCADO (%d), SI ESTA!!!",buscar);
    }
    else
    {
        printf("EL NUMERO BUSCADO (%d), NO ESTA!!!",buscar);
    }
    
    



    
}