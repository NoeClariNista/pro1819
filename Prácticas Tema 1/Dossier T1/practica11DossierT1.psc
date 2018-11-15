// Pr�ctica 11: Implementa un algoritmo que muestre todos los m�ltiplos de n entre
// n y m�n, ambos inclusive, donde n y m son n�meros introducidos por el usuario.

// Esta pr�ctica tambi�n es la Pr�ctica 2 en Pr�cticas propuestas 
// de pseudoc�digo II - Estructuras Iterativas.

Algoritmo practica11DossierT1
	
	Definir m, n Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el numero n."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer n;
	Escribir "Introduce el numero m."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer m;
	
	Para i <- n Hasta (n * m) Con Paso n Hacer // Realiza un bucle para realizar la operaci�n.
		Escribir i; // Muestra un mensaje por pantalla los valores de i.
	Fin Para
	
FinAlgoritmo
