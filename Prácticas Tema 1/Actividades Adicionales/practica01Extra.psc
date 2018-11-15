// Ejemplo de introducir números entre 1 y 3 y te escribe de que número se trata.

Algoritmo practica01Extra
	
	Definir num Como Entero; // Definimos la variable como entero.
	
	Escribir "Introduce un numero entero."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	
	Si num = 1 Entonces // Si se cumple la condición.
		Escribir "uno"; // Muestra un mensaje por pantalla.
	SiNo
		Si num = 2 Entonces // Si se cumple la condición.
			Escribir "dos"; // Muestra un mensaje por pantalla.
		SiNo
			Si num = 3 Entonces // Si se cumple la condición.
				Escribir "Tres"; // Muestra un mensaje por pantalla.
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
