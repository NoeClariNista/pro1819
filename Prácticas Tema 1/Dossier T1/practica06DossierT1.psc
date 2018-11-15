// Práctica 06: Diseña un algoritmo que, dado un número entero, muestre por
// pantalla el mensaje "El número es par." cuando el número sea par y el mensaje
// "El número es impar." cuando sea impar. (Una pista: un número es par si el
// resto de dividirlo por 2 es 0, e impar en caso contrario.)

// Esta práctica también es la Práctica 6 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica06DossierT1
	
	Definir num, resto Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un número entero."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	
	resto <- num % 2; // Hacemos la operación y la guarda en la variable resto.
	
	Si resto = 0 Entonces // Si se cumple la condición.
		Escribir "El número es par."; // Muestra un mensaje por pantalla.
	SiNo
		Escribir "El número es impar."; // Muestra un mensaje por pantalla.
	FinSi
	
FinAlgoritmo
