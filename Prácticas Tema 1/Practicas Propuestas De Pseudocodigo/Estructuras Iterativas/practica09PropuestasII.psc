// 9. Haz un algoritmo que muestre, en orden inverso, todos los números pares
// comprendidos entre 0 y 200 (ambos inclusive).

Algoritmo practica09PropuestasII
	
	Definir num Como Entero; // Definimos la variable como entera.
	
	Escribir "Los números pares entre 0 y 200"; // Muestra un mensaje por pantalla.
	num <- 200; // Inicializamos la variable num.
	
	Mientras num >= 0 Hacer // Mientras se cumpla la condición.
		Si (num % 2) = 0 Entonces
			Escribir num; // Muestra por pantalla todos los números que cumplan la condición.
		FinSi
		num <- num - 1; // Disminuimos el valor de num.
	FinMientras
	
FinAlgoritmo
