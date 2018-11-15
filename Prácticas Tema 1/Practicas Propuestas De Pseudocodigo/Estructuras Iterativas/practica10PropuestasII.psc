// 10. Escribe un programa que muestre los n�meros pares que hay entre dos n�meros
// que introduzca el usuario por teclado.

Algoritmo practica10PropuestasII
	
	Definir num1, num2, temp Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce un n�mero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce otro n�mero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num2;
	
	Si num1 > num2 Entonces // Si ocurre que el primer n�mero es mayor que el segundo n�mero realiza esta condici�n.
		temp <- num1;
		num1 <- num2;
		num2 <- temp;
	FinSi
	
	Escribir "Los n�meros pares entre ", num1," y ", num2;
	
	Mientras num1 <= num2 Hacer // Mientras se cumpla la condici�n.
		Si (num1 % 2) = 0 Entonces
			Escribir num1; // Muestra por pantalla todos los n�meros que cumplan la condici�n.
		FinSi
		num1 <- num1 + 1; // Incrementamos el valor de num1.
	FinMientras
	
FinAlgoritmo
