// Ejemplo de introducir n�meros entre 1 y 3 y te escribe de que n�mero se trata.

Algoritmo practica01Extra
	
	Definir num Como Entero; // Definimos la variable como entero.
	
	Escribir "Introduce un numero entero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num;
	
	Si num = 1 Entonces // Si se cumple la condici�n.
		Escribir "uno"; // Muestra un mensaje por pantalla.
	SiNo
		Si num = 2 Entonces // Si se cumple la condici�n.
			Escribir "dos"; // Muestra un mensaje por pantalla.
		SiNo
			Si num = 3 Entonces // Si se cumple la condici�n.
				Escribir "Tres"; // Muestra un mensaje por pantalla.
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
