sumaComp :: [(Int,Int)] -> Int
sumaComp [] = 0
sumaComp ((x,y):xs) = x + y + sumaComp xs

maxmin :: Int -> Int -> (Int, Int)
maxmin x y | x > y = (x,y)
	   |otherwise = (y,x)

sumaX [] = 0
sumaX (x:xs) = x + sumaX xs

verTodas :: [(String, Int, Int, String)] -> Int
verTodas [] = 0
verTodas ((_,_,d,_):xs) = d + verTodas xs

estrenos :: [(String, Int, Int, String)] -> [String]
estrenos [] = []
estrenos ((p,a,_,_):xs) | a == 2019 = (p : estrenos xs)
			|otherwise = estrenos xs

cuadSig :: [Int] -> [Int]
cuadSig [] = []
cuadSig (x:xs) = (x + 1)*(x + 1) : cuadSig xs