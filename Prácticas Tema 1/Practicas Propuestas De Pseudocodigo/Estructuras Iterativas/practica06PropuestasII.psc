// 6. Diseña un algoritmo que solicite la lectura de un número entre 0 y 10
// (ambos inclusive). Si el usuario teclea un número fuera del rango válido,
// el programa solicitará nuevamente la introducción del valor cuantas veces sea
// necesario.

Algoritmo practica06PropuestasII
	
	Definir num Como Entero; // Definimos la variable como entera.
	
	Escribir "Introduce un múmero entre 0 y 10.";  // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	
	Mientras (num > 10) O (0 > num) Hacer // Mientras el número cumpla estas condiciones. 
		Escribir "Introduce bien el número.";  // Muestra un mensaje por pantalla pidiendo otro número pero que cumpla las condiciones anteriores y lo vuelve a guardar en una variable.
		Leer num;
	FinMientras
	
	Escribir "El número que pusiste es el ", num;  // Muestra un mensaje por pantalla con el número que se puso.
	
FinAlgoritmo
