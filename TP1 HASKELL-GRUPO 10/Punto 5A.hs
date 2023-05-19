extraerAnio :: Int -> Int
extraerAnio x = mod x 10000

extraerMes :: Int -> Int
extraerMes x = mod (div x 10000) 100

extraerDia :: Int -> Int
extraerDia x = div x 1000000

aprobacion :: Float -> Bool
aprobacion nota = nota >= 6

promedio :: Float -> Float -> Float -> Float
promedio x y z = (x+y+z)/3

volumenEsfera :: Float -> Float
volumenEsfera v = (4/3)*pi*v^3

areaCirculo :: Float -> Float
areaCirculo a = pi*a^2

ultimaCifra :: Int -> Int
ultimaCifra x = mod x 10

triangulo :: (Float,Float,Float) -> Bool
tpositivo (a,b,c) = (a>0) && (b>0) && (c>0)
tcorrecto (a,b,c) = (a<=c) && (b<=c) && (a+b>c) || (a<=b) && (c<=b) && (a+c>b) || (c<=a) && (b<=a) && (b+c>a)
triangulo (a,b,c) = tpositivo (a,b,c) && tcorrecto (a,b,c)

puedoAvanzar :: String -> Bool
puedoAvanzar color = color == "verde"