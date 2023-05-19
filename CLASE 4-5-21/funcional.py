from functools import reduce

print("Hola alumnos de Paradigmas de Programación")

# declaracion de funciones imperativas pura
def suma(a,b):
   return a + b

print(f"Suma a + b : {suma(2,3)} ")

a = 10
# funcion imperativa impura
def fimpura(x):
    global a
    a += 1
    return a + x

print(f"fimpura : {fimpura(10)}")
print(f"fimpura : {fimpura(10)}")

# serie de fibonacci
def fibonacci(n):
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)
        a, b = b, a+b
    return result

print(f"Fibonacci < que 1000 : {fibonacci(1000)}")

#factorial con funcion imperativa pura
def fac(n):
    total = 1
    for i in range(n):
        total += total * i
    return total

print(f"Factorial Imperativo : {fac(3)}")

#factorial con funcion imperativa pura de gran similitud a declarativo
def factorial(n):
    return 1 if n == 0 else n * factorial(n - 1)

print(f"Factorial Imperativo casi funcional : {factorial(3)}")

#funciones para manejo de listas, imperativas tipo declarativo
#devuelve la cabecera, primer elemento
def head(xs):
    return xs[0] if len(xs) > 0 else []

lista = [1,2,3,4,5]
print(f"Cabecera de una lista : {head(lista)}")

#devuelve la cola de la lista o sea todos los elemento exepto el primero
def tail(xs):
    return xs[1:] if len(xs) else []

print(f"Cola de una lista : {tail(lista)}")

#suma los elemento de una lista numerica
def sumarLista(xs):
    return head(xs) + sumarLista(tail(xs)) if len(xs) else 0

print(f"Suma lista : {sumarLista(lista)}")

#cuenta cuantos elementos tiene una lista
def contarLista(xs):
    return 1 + contarLista(tail(xs)) if len(xs) else 0

print(f"Cantidad de elementos de una lista : {contarLista(lista)}")


#devuelve los numeros pares de una lista
def filtrarPares(xs):
    return [] if len(xs) == 0 else [head(xs)] + filtrarPares(tail(xs)) if head(xs) %2 == 0 else filtrarPares(tail(xs))

print(f"Numeros pares de la lista : {filtrarPares(lista)}")

def par(n):
    return (lambda x : x %2 == 0)(n)

print("si" if par(5) else "no")


#funcional en Python
v1 = lambda x : x + 1
print(v1(6))

v2 = (lambda x : x * x) (4)
print(v2)

lista2 = list(map(lambda x : x * x, lista))
print(lista2)

lista3 = list(filter(lambda x : x %2 == 0, lista))
print(lista3)

lista4 = list(map(lambda x : x * x, filter(lambda x : x %2 == 0, lista)))
print(lista4)

fib = lambda n: reduce(lambda x, _: x+[x[-1]+x[-2]], range(n-2), [0, 1])
print(fib(100))

