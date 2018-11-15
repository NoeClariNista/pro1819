// Pr�ctica 13: Queremos hacer un algoritmo que calcule el factorial de un n�mero entero
// positivo. El factorial de n se denota con n!, pero no existe ning�n operador que permita
// efectuar este c�lculo directamente. Sabiendo que n! = 1 � 2 � 3 � . . . � (n - 1) � n y que 0! = 1,
// haz un algoritmo que pida el valor de n y muestre por pantalla el resultado de calcular n!.

// Esta pr�ctica tambi�n es la Pr�ctica 4 en Pr�cticas propuestas 
// de pseudoc�digo II - Estructuras Iterativas.

Algoritmo practica13DosDossierT1
	
	Definir factor, num, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el n�mero que quieres factorizar."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num;
	factor <- 1; // Inicializamos la variable factor.
	
	Si num <- 0 Entonces // Si cumple la condici�n.
		Escribir "El factorial de", num, "Es 1."; // Muestra un mensaje por pantalla del factorial.
	SiNo
		Para i <- num Hasta 1 Con Paso -1 Hacer // Realiza un bucle para realizar la operaci�n.
			factor <- factor * i; // Hace la operaci�n factor.
		Fin Para
		
		Escribir "El factorial de ", num, " es ", factor;  // Muestra un mensaje por pantalla del resultado.
	FinSi
	
FinAlgoritmo
