// Práctica 12: Implementa un algoritmo que muestre todos los números potencia de
// 2 entre 20 y 230, ambos inclusive.

// Esta práctica también es la Práctica 3 en Prácticas propuestas 
// de pseudocódigo II - Estructuras Iterativas.

Algoritmo practica12DossierT1
	
	Definir dato Como Entero; // Definimos la variable como entero.
	
	dato <- 1; // Inicializamos la variable dato.
	
	Mientras dato <= 230 Hacer // Mientras se cumpla la condición.
		dato <- dato * 2; // Hace la operación.
		Si dato >= 20 Y dato <= 230 Entonces // Si se cumple la condición.
			Escribir dato; // Muestra por pantalla la variable dato.
		FinSi
	FinMientras
	
FinAlgoritmo
