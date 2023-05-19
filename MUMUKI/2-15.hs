pesoPino n = if n < 3 then ((100*n)*3) else (((3*100)*3) + ((n-3)*100)*2)
esPesoUtil n = if ((pesoPino n)>=400)&&((pesoPino n) <=1000) then True else False
sirvePino n = if (esPesoUtil n) then True else False

esCuadradoPerfecto n = (sqrt n)