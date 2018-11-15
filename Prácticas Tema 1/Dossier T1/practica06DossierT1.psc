// Pr�ctica 06: Dise�a un algoritmo que, dado un n�mero entero, muestre por
// pantalla el mensaje "El n�mero es par." cuando el n�mero sea par y el mensaje
// "El n�mero es impar." cuando sea impar. (Una pista: un n�mero es par si el
// resto de dividirlo por 2 es 0, e impar en caso contrario.)

// Esta pr�ctica tambi�n es la Pr�ctica 6 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica06DossierT1
	
	Definir num, resto Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un n�mero entero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num;
	
	resto <- num % 2; // Hacemos la operaci�n y la guarda en la variable resto.
	
	Si resto = 0 Entonces // Si se cumple la condici�n.
		Escribir "El n�mero es par."; // Muestra un mensaje por pantalla.
	SiNo
		Escribir "El n�mero es impar."; // Muestra un mensaje por pantalla.
	FinSi
	
FinAlgoritmo
