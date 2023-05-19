/*
-- CREAR BASES DE DATOS 

    CREATE DATABASE videoclub; 
    CREATE DATABASE kiosco;
    
-- CREAR TABLAS 
    
    CREATE TABLE pelicula(
    codigo INT, 
    nombre VARCHAR(100), 
    genero VARCHAR(100)
    );

    INSERT INTO pelicula VALUES (1, 'John Wick', 'Accion'); 
    INSERT INTO pelicula VALUES (2, 'Toy Story', 'Aventura'); 
    INSERT INTO pelicula VALUES (3, 'Anabelle', 'Terror'); 
    INSERT INTO pelicula VALUES (4, 'Stars Wars', 'Accion'); 
    INSERT INTO pelicula VALUES (5, 'Mision imposible', 'Accion');
 */
-- OBTENER DATOS
/*
    SELECT nombre, genero FROM pelicula; 
    SELECT * FROM pelicula;
    SELECT * FROM pelicula WHERE genero = 'Accion';
    SELECT * FROM pelicula WHERE genero = 'Accion' OR genero = 'terror';
    SELECT * FROM pelicula ORDER BY nombre;
    SELECT * FROM pelicula ORDER BY genero, nombre; 
    SELECT * FROM pelicula WHERE genero = 'Aventura' ORDER BY nombre; 
    SELECT * FROM pelicula
  
 --BORRAR DATOS

    DELETE FROM pelicula WHERE codigo = 10; basicamente pide borrar las pelis con codigo 10 pero NO hay ninguna
    DELETE FROM pelicula WHERE codigo = 3;
    DELETE FROM pelicula WHERE genero = 'Terror';
    DELETE FROM pelicula; 
   
 --MODFICAR DATOS 

    UPDATE pelicula SET nombre = 'ROBOCOP' WHERE codigo = 1;
    UPDATE pelicula SET nombre = 'ROBOCOP', genero = 'ACCION' WHERE codigo = 1;
    UPDATE pelicula SET nombre = 'ROBOCOP', genero = 'ACCION'
videoclub

*/
