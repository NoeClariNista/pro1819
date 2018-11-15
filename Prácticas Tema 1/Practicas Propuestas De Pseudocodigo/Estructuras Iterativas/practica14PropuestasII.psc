// 14. Haz un algoritmo que calcule el máximo común divisor (mcd) de dos enteros
// positivos. El mcd es el número más grande que divide exactamente a ambos números.

Algoritmo practica14PropuestasII
	
	Definir dividendo, divisor, mcd Como Entero; // Definimos las variables como enteras.
	Definir cociente, resto Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce el número 1."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer dividendo;
	Escribir "Introduce el número 2."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer divisor;
	resto <- 1; // Inicializamos la variable resto.
	
	Mientras (resto != 0) Hacer
		cociente <- trunc(dividendo / divisor); // Calcula el valor del cociente.
		resto <- dividendo % divisor; // Calcula el valor del resto.
		
		dividendo <- divisor // Ponemos el valor de la variable divisor en la variable dividendo.
		divisor <- resto // Ponemos el valor de la variable resto en la variable divisor.
	Fin Mientras
	
	mcd <- dividendo; // Ponemos el valor de la variable dividendo en la variable mcd.
	Escribir "El mcd es ", mcd; // Muestra un mensaje por pantalla el mcd de dos números.
	
FinAlgoritmo
