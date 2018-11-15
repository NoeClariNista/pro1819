// 10. Diseña un algoritmo que lea un carácter cualquiera desde el teclado, y muestre
// el mensaje "Es una MAYUSCULA" cuando el carácter sea una letra mayúscula y el mensaje
// "Es una MINUSCULA" cuando sea una minúscula. En cualquier otro caso, no mostrará
// mensaje alguno. (Considera únicamente letras del alfabeto inglés.) Pista: aunque
// parezca una obviedad, recuerda que una letra es minúscula si está entre la 'a' y la
// 'z', y mayúscula si está entre la 'A' y la 'Z'.

Algoritmo practica10Propuestas
	
	Definir letra Como Caracter; // Definimos la variable como caracter.
	
	Escribir "Introduce una letra."; // Muestra un mensaje por pantalla pidiendo una letra y la guarda en una variable.
	Leer letra;
	
	Si Mayusculas(letra) <> Minusculas(letra) Entonces // Comprueba que la mayúscula y la minúscula son distintas.
		Si Mayusculas(letra) = letra Entonces // Si la letra mayúscula es igual a la letra.
			Escribir "La letra ", letra ," es mayúscula."; // Muestra un mensaje por pantalla si la letra es mayúscula.
		SiNo
			Escribir "La letra ", letra ," es minúscula."; // Muestra un mensaje por pantalla si la letra es minúscula.
		FinSi
	SiNo
		Escribir "No es una letra."; // Muestra un mensaje por pantalla si son iguales la letra mayúscula y la letra minúscula.
	FinSi
	
FinAlgoritmo
