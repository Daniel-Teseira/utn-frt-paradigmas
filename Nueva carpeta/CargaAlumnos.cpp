#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<locale.h>
#include<conio.h>
#include<ctime> // o tambien
#include<time.h>

struct datos 
{
    int legajo;
    char nombre[100];
    char direccion[100];
    char email[100];
};

main()
{
    datos v;
    int y,valor;
	int a=1;  
    FILE *arch,*aux;
    int cargar;
    char buscar[100];
	
	do{
		printf("\t\t  BIENVENIDO\n");
		printf("**************************************************************");	
		printf("\nSELECCIONE UNA OPCION");
		printf("\n\t 1) CARGA DE DATOS DE ALUMNO");
		printf("\n\t 2) CONSULTAR EXISTENCIA DE UN ALUMNO Y BORRARLO");
		printf("\n\t 3) VER DATOS CARGADOS");
		printf("\n\t 4) SALIR");	
		printf("\n**************************************************************");
		printf("\n OPCION: ");
		scanf("%d",&y);
		switch(y)
		{
			case 1:	printf("\n==============================================\n");
					printf("=\tELIGIO CARGA DE DATOS DE ALUMNO          =");					
					printf("\n==============================================\n");
					arch=fopen("ALUMNOS.dat","a+b");
					if(arch==NULL)
					{					
						printf("\nERROR DE APERTURA DE ARCHIVO!");
						printf("\n");
						system("pause");
						exit(1);	
					}
                    cargar=false;
                    do
                    {
                        printf("INGRESE EL LEGAJO: ");
					    scanf("%d",&v.legajo);
                        printf("\nINGRESE EL NOMBRE: ");
                        _flushall();
                        gets(v.nombre);
                        printf("\nINGRESE LA DIRECCION: ");
                        _flushall();
                        gets(v.direccion);
                        printf("\nINGRESE EL EMAIL: ");
                        _flushall();
                        gets(v.email);
                        fwrite(&v,sizeof(datos),1,arch);
                        do
                        {
                            printf("\nDESEA SEGUIR CARGANDO? (1=SI; 0=NO): ");
                            scanf("%d",&cargar);
							printf("\n%d",cargar);
                        } while (cargar>1 || cargar<0);       
                    } while (cargar==1);                    
                    					
					fclose(arch);				
					printf("==============================================\n");
					printf("\n");
					system("pause");
					system("cls");
					break;
										
			case 2:	
					printf("\n\t ELIGIO CONSULTAR EXISTENCIA DE UN ALUMNO Y BORRARLO");										
					arch=fopen("ALUMNOS.dat","rb");	
                    aux=fopen("AUXILIAR.dat","a+b");	
                    bool esta;
					esta=false;				
					if(arch==NULL)
					{
						printf("\nERROR DE APERTURA DE ARCHIVO!");
						printf("\n");
						system("pause");
						exit(1);	
					}		
                    if(aux==NULL)
					{
						printf("\nERROR DE APERTURA DE ARCHIVO!");
						printf("\n");
						system("pause");
						exit(1);	
					}	

					
					printf("\nINGRESE UN ALUMNO A BUSCAR: ");
                    _flushall();
                    gets(buscar);
                    strlwr(buscar);
					fread(&v,sizeof(datos),1,arch);
					while(!feof(arch))
					{
                        strlwr(v.nombre);
                        valor=strcmp(v.nombre,buscar);
						printf("\nvalor= %d",valor);
						if(valor!=0)
						{
                            fwrite(&v,sizeof(datos),1,aux);	
							printf("\ndato cargado");
										                            
						}				
                        else	
                        {
                            esta=true;
                        }
						system("pause");	
						fread(&v,sizeof(datos),1,arch);
					}                    
					fclose(arch);
                    fclose(aux);

                    if (esta==true)
                    {
                        printf("\nEL ALUMNO %s SI ESTA Y FUE BORRADO\n",buscar);
						remove("ALUMNOS.dat");
						system("pause");	
                    	rename("AUXILIAR.dat","ALUMNOS.dat");
                    }
                    else
                    {
                        printf("\nEL ALUMNO %s NO ESTA\n",buscar);
						remove("AUXILIAR.dat");
                    }                       
					
					printf("\n");
					system("pause");
					system("cls");		
					break;

			case 3:	printf("\n==============================================\n");
					printf("=\tELIGIO VER DATOS CARGADOS          =");					
					printf("\n==============================================");
					arch=fopen("ALUMNOS.dat","rb");
					a=1;
					if(arch==NULL)
					{					
						printf("\nERROR DE APERTURA DE ARCHIVO!");
						printf("\n");
						system("pause");
						exit(1);	
					} 					 
					fread(&v,sizeof(datos),1,arch);					            
                    while(!feof(arch))
					{
						printf("\n\n\tALUMNO %d",a);
                        printf("\nLEGAJO: %d",v.legajo);					    
                        printf("\nNOMBRE Y APELLIDO: %s",v.nombre);
                        printf("\nDIRECCION: %s",v.direccion);
                        printf("\nEMAIL: %s",v.email);
						fread(&v,sizeof(datos),1,arch);
						a++;
                    }                   					
					fclose(arch);

					printf("\n==============================================\n");
					printf("\n");
					system("pause");
					system("cls");
					break;
			case 4: 
					break;

			default: printf("EL NUMERO INGRESADO NO CORRESPONDE A LAS OPCIONES\n");				
		}		
	}while(y<4);
	

printf("\n\n");
system("pause");
}