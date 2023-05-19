% problema de la familia
% dados los hechos padre y madre
% averiaguar otros parentezcos
% clausula de horm
% formato normal cabeza :- cuerpo
%
padre(fernando,ubaldo).
padre(fernando,frida).
padre(luis,marta).
padre(luis,claudia).
padre(ubaldo, andres).
padre(ubaldo, jose).
padre(ubaldo, alejo).
padre(ubaldo, lautaro).

madre(aurelia,ubaldo).
madre(aurelia,frida).
madre(angela,marta).
madre(angela,claudia).
madre(marta, andres).
madre(marta, jose).
madre(marta, alejo).
madre(marta, lautaro).

hermano(X,Y) :- padre(P,X), padre(P,Y), madre(M,X), madre(M,Y), X \== Y.

esposos(X,Y) :- ((padre(X,H), madre(Y,H)); (madre(X,H), padre(Y,H))), !.

abuelo(X,Y) :- ((padre(X,H), (padre(H,Y); madre(H,Y)))); ((madre(X,H), (padre(H,Y); madre(H,Y)))).

hermanos(X,Lista) :- findall(Hermano,(hermano(X,Hermano)),Lista).

abuelos(X,Lista) :- findall(Abuelo,(abuelo(Abuelo,X);abuelo(X,Abuelo)),Lista).

hijos(X,Hijos) :- findall(Hijo,(padre(X,Hijo); madre(X,Hijo)),Hijos).

tio(X,Y) :- hermano(X,Hermano),(padre(Hermano,Y);madre(Hermano,Y)).


