// Ejemplo de una sucesión de números donde primero se suma dos y luego se
// suma tres entre los números 13 y 30 (incluidos).

Algoritmo practica02Extra
	
	Definir dato, n Como Entero; // Definimos las variables como enteros.
	
	dato <- 2; // Inicializamos la variable dato.
	n <- 2; // Inicializamos la variable n.
	
	Mientras n <= 30 Hacer // Mientras se cumpla la condición.
		Si n >= 13 Entonces // Si se cumple la condición.
			Escribir n; // Muestra un mensaje por pantalla n.
	    FinSi
		n <- n + 2; // Incrementamos la variable n.
		Si n >= 13  Entonces // Si se cumple la condición.
			Escribir n; // Muestra un mensaje por pantalla n.
	    FinSi
		n <- n + 3 // Incrementamos la variable n.
	Fin Mientras
	
FinAlgoritmo
