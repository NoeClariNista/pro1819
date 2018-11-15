// Práctica 07: Diseña un algoritmo que, dado un número entero, determine si éste
// es el doble de un número impar. (Ejemplo: 14 es el doble de 7, que es impar.)

// Esta práctica también es la Práctica 7 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica07DossierT1
	
	Definir candidato, num, resto Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un número entero.";  // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer candidato;
	
	num <- candidato / 2; // Hacemos la operación y la guarda en la variable num.
	resto <- num % 2;  // Hacemos la operación y la guarda en la variable resto.
	
	Si resto = 0 Entonces // Si se cumple la condición.
		Escribir "Viene de par."; // Muestra un mensaje por pantalla.
	SiNo
		Escribir "Viene de impar."; // Muestra un mensaje por pantalla.
	FinSi
	
FinAlgoritmo
