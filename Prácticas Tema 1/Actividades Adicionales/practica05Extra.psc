// Ejemplo de un algoritmo que introduces un número entero y te 
// dice entre que valores es mayor y menor.

Algoritmo practica05Extra
	
	Definir num Como Entero; // Definimos la variable como entero.
	
	Escribir "Introduce un numero."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	
	Si num < 0 Entonces // Si se cumple la condición.
		Escribir "El numero es menor que cero."; // Muestra un mensaje por pantalla.
	SiNo
		Si num < 10 Entonces // Si se cumple la condición.
			Escribir "El numero es mayor o igual a cero y menor que 10."; // Muestra un mensaje por pantalla.
		SiNo
			Si num < 100 Entonces // Si se cumple la condición.
				Escribir "El numero es mayor o igual a 10 y menor que 100."; // Muestra un mensaje por pantalla.
			SiNo
				Escribir "El numero es mayor o igual a 100."; // Muestra un mensaje por pantalla.
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
