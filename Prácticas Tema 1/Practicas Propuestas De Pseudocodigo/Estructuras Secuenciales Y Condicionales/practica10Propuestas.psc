// 10. Dise�a un algoritmo que lea un car�cter cualquiera desde el teclado, y muestre
// el mensaje "Es una MAYUSCULA" cuando el car�cter sea una letra may�scula y el mensaje
// "Es una MINUSCULA" cuando sea una min�scula. En cualquier otro caso, no mostrar�
// mensaje alguno. (Considera �nicamente letras del alfabeto ingl�s.) Pista: aunque
// parezca una obviedad, recuerda que una letra es min�scula si est� entre la 'a' y la
// 'z', y may�scula si est� entre la 'A' y la 'Z'.

Algoritmo practica10Propuestas
	
	Definir letra Como Caracter; // Definimos la variable como caracter.
	
	Escribir "Introduce una letra."; // Muestra un mensaje por pantalla pidiendo una letra y la guarda en una variable.
	Leer letra;
	
	Si Mayusculas(letra) <> Minusculas(letra) Entonces // Comprueba que la may�scula y la min�scula son distintas.
		Si Mayusculas(letra) = letra Entonces // Si la letra may�scula es igual a la letra.
			Escribir "La letra ", letra ," es may�scula."; // Muestra un mensaje por pantalla si la letra es may�scula.
		SiNo
			Escribir "La letra ", letra ," es min�scula."; // Muestra un mensaje por pantalla si la letra es min�scula.
		FinSi
	SiNo
		Escribir "No es una letra."; // Muestra un mensaje por pantalla si son iguales la letra may�scula y la letra min�scula.
	FinSi
	
FinAlgoritmo
