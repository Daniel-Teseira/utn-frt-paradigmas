/*
3 - Con operaciones bit a bit, verificar si un número dado entero es impar.
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
    int i,buscar,j;
    bool esta=false;
    
    printf("INGRESE UN NUMERO: ");
    scanf("%d",&buscar);
    if(buscar&&2)
    {
        esta=true;       
    }
    //system("pause");
    
    if (esta==true)
    {
        printf("EL NUMERO BUSCADO (%d), SI ESTA!!!",buscar);
    }
    if(esta==false)
    {
        printf("EL NUMERO BUSCADO (%d), NO ESTA!!!",buscar);
    }
    printf("\n");
    system("pause");    
}