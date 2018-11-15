// 10. Escribe un programa que muestre los números pares que hay entre dos números
// que introduzca el usuario por teclado.

Algoritmo practica10PropuestasII
	
	Definir num1, num2, temp Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce un número."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce otro número."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num2;
	
	Si num1 > num2 Entonces // Si ocurre que el primer número es mayor que el segundo número realiza esta condición.
		temp <- num1;
		num1 <- num2;
		num2 <- temp;
	FinSi
	
	Escribir "Los números pares entre ", num1," y ", num2;
	
	Mientras num1 <= num2 Hacer // Mientras se cumpla la condición.
		Si (num1 % 2) = 0 Entonces
			Escribir num1; // Muestra por pantalla todos los números que cumplan la condición.
		FinSi
		num1 <- num1 + 1; // Incrementamos el valor de num1.
	FinMientras
	
FinAlgoritmo
