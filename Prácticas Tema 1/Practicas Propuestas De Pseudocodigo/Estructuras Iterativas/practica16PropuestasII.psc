// 16. Haz un algoritmo que vaya leyendo números y mostrándolos por pantalla hasta
// que el usuario introduzca un número negativo. En ese momento, el algoritmo mostrará
// un mensaje de despedida y finalizará su ejecución.

Algoritmo practica16PropuestasII
	
	Definir num Como Entero; // Definimos la variable como entera.
	
	Escribir "Introduce un número."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	
	Mientras (0 <= num) Hacer
		Escribir "El número que pusiste es ", num; // Muestra por pantalla todos los números que cumplan la condición.
		Escribir "Introduce un número."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
		Leer num;
	FinMientras
	
	Escribir "Adios"; // Muestra un mensaje por pantalla cuando termina el programa.
	
FinAlgoritmo
