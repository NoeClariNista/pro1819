// 8. Haz un algoritmo que muestre todos los n�meros pares comprendidos entre 0 y
// 200 (ambos inclusive).

Algoritmo practica08PropuestasII
	
	Definir num Como Entero; // Definimos la variable como entera.
	
	Escribir "Los n�meros pares entre 0 y 200"; // Muestra un mensaje por pantalla.
	num <- 0; // Inicializamos la variable num.
	
	Mientras num <= 200 Hacer // Mientras se cumpla la condici�n.
		Si (num % 2) = 0 Entonces
			Escribir num; // Muestra por pantalla todos los n�meros que cumplan la condici�n.
		FinSi
		num <- num + 1; // Incrementamos el valor de num.
	FinMientras
	
FinAlgoritmo
