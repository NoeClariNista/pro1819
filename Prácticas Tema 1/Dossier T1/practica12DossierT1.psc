// Pr�ctica 12: Implementa un algoritmo que muestre todos los n�meros potencia de
// 2 entre 20 y 230, ambos inclusive.

// Esta pr�ctica tambi�n es la Pr�ctica 3 en Pr�cticas propuestas 
// de pseudoc�digo II - Estructuras Iterativas.

Algoritmo practica12DossierT1
	
	Definir dato Como Entero; // Definimos la variable como entero.
	
	dato <- 1; // Inicializamos la variable dato.
	
	Mientras dato <= 230 Hacer // Mientras se cumpla la condici�n.
		dato <- dato * 2; // Hace la operaci�n.
		Si dato >= 20 Y dato <= 230 Entonces // Si se cumple la condici�n.
			Escribir dato; // Muestra por pantalla la variable dato.
		FinSi
	FinMientras
	
FinAlgoritmo
