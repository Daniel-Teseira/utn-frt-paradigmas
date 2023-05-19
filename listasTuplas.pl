% dada una lista de personas encontrar las de una edad determinada
% porEdad([(sebastian,20),(ruth,29),(celeste,20)], 20, L).
%

porEdad([],_,[]).
%porEdad([(Nombre,Edad)],Ed,[Nombre]) :- Edad =:= Ed.
porEdad([(Nombre, Edad)| Xs],Ed, Lista) :- Edad =:= Ed, porEdad(Xs,Ed,Lista2), append([Nombre],Lista2,Lista).
porEdad([(_, Edad)| Xs],Ed, Lista) :- Edad \== Ed, porEdad(Xs,Ed,Lista).

% para un grupo de personas averiguar quienes tienen una edad
% determinada
persona(juan,30).
persona(ana,23).
persona(sebatian,20).
persona(cesar,20).
buscaPorEdad(Edad,Lista) :- findall((Nombre,Ed),(persona(Nombre,Ed),Ed =:= Edad),Lista).

%Puedo jugar con la clausula append() y con un parametro []
% Ejemplo de invertir una lista con append()
invertir([],[]).
invertir([X|XS],L) :- invertir(XS,L1), append(L1,[X],L).

% Ejemplo de invertir una lista con []
inversa([],Z,Z).
inversa([H|T],Z,Acc) :- inversa(T,Z,[H|Acc]).

% Idem para encontrar la lista de los elementos iguales al indicado
iguales([],_,[]).
iguales([X|T],N,L) :- X =:= N, iguales(T,N,L1), append([X],L1,L).
iguales([X|T],N,L) :- X \== N, iguales(T,N,L).

iguales2([],_,Z,Z).
iguales2([X|T],N,L,L2) :- X == N, iguales2(T,N,L,[X|L2]).
iguales2([X|T],N,L,L2) :- X \== N, iguales2(T,N,L,L2).

% Elimina un elemento especifico de una lista
elimina(_,[],[]).
elimina(X,[A|As],[A|R]):- X \== A, elimina(X,As,R).
elimina(X,[A|As],R):- X == A, elimina(X,As,R).

% Verifica si un elemento determinado pertenece a una lista
miembro(_,[]):- false.
miembro(A,[X|Xs]) :- A == X, !.
miembro(A,[X|Xs]) :- A \== X, miembro(A,Xs).

% Devuelve los elementos repetidos de una lista
rep([],[]).
rep([X|Xs],Re):- miembro(X,Xs), rep(Xs,Re).
rep([X|Xs],[X|Re]):- not(miembro(X,Xs)), rep(Xs,Re).

rep2([],[]).
rep2([X|Xs],[X|R]):- member(X,Xs), elimina(X,Xs,Re), rep2(Re,R).
rep2([X|Xs],[X|Re]):- not(member(X,Xs)), rep2(Xs,Re).

rep3([],[]).
rep3([X|Xs],[X|R]):- elimina(X,Xs,Re), rep3(Re,R).


%los vecinos compran productos en un almacen
% 1. averiaguar cuanto gasto un vecino
%
producto(azucar,50).
producto(yerba,200).
producto(aceite,180).
producto(leche,80).

compra(juan,yerba,2).
compra(juan,azucar,1).

compra(ana,leche,3).
compra(ana,aceite,1).

sumaLista([],0).
sumaLista([X|Xs],T) :- sumaLista(Xs,T2), T is T2 + X.

cuantoGasto(Persona,Total) :- findall(SubT,(compra(Persona,Prod,Cant), producto(Prod,Precio), SubT is Cant * Precio),Lista), sumaLista(Lista,Total).











