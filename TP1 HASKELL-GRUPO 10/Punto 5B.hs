longCadena :: String -> Int
longCadena [] = 0
longCadena (x:xs) = (1 + longCadena xs)

invertirCadena :: String -> String
invertirCadena [] = []
invertirCadena (x : xs) = invertirCadena xs ++ [x] 

verificaElem :: Char -> String -> Bool
verificaElem x [] = False
verificaElem x (y:ys) | x == y = True
		      |otherwise = verificaElem x ys

eliminaRep :: String -> Bool
eliminaRep [] = False
eliminaRep (x:xs) | not (x `elem` xs) = not(eliminaRep [])
	          | otherwise = eliminaRep []

unirListaConrep :: [String] -> [String] -> [String]
unirListaConrep [] [] = []
unirListaConrep (x:xs) (y:ys) = (x ++ y) : unirListaConrep xs ys

elimElemRep :: String -> String
elimElemRep [] = []
elimElemRep (x:xs) = x : elimElemRep (filter (/=x) xs)
unirListaSinrep (x:xs) (y:ys) = elimElemRep (x++y)

vocales :: String -> String
vocales [] = []
vocales (x:xs) | not (x `elem` "aeiou") = vocales xs
	       | otherwise = x: vocales xs