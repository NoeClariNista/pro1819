// Pr�ctica 07: Dise�a un algoritmo que, dado un n�mero entero, determine si �ste
// es el doble de un n�mero impar. (Ejemplo: 14 es el doble de 7, que es impar.)

// Esta pr�ctica tambi�n es la Pr�ctica 7 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica07DossierT1
	
	Definir candidato, num, resto Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un n�mero entero.";  // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer candidato;
	
	num <- candidato / 2; // Hacemos la operaci�n y la guarda en la variable num.
	resto <- num % 2;  // Hacemos la operaci�n y la guarda en la variable resto.
	
	Si resto = 0 Entonces // Si se cumple la condici�n.
		Escribir "Viene de par."; // Muestra un mensaje por pantalla.
	SiNo
		Escribir "Viene de impar."; // Muestra un mensaje por pantalla.
	FinSi
	
FinAlgoritmo
