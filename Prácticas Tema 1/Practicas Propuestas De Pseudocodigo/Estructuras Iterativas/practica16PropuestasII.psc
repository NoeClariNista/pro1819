// 16. Haz un algoritmo que vaya leyendo n�meros y mostr�ndolos por pantalla hasta
// que el usuario introduzca un n�mero negativo. En ese momento, el algoritmo mostrar�
// un mensaje de despedida y finalizar� su ejecuci�n.

Algoritmo practica16PropuestasII
	
	Definir num Como Entero; // Definimos la variable como entera.
	
	Escribir "Introduce un n�mero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num;
	
	Mientras (0 <= num) Hacer
		Escribir "El n�mero que pusiste es ", num; // Muestra por pantalla todos los n�meros que cumplan la condici�n.
		Escribir "Introduce un n�mero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
		Leer num;
	FinMientras
	
	Escribir "Adios"; // Muestra un mensaje por pantalla cuando termina el programa.
	
FinAlgoritmo
