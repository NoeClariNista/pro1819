// 6. Dise�a un algoritmo que solicite la lectura de un n�mero entre 0 y 10
// (ambos inclusive). Si el usuario teclea un n�mero fuera del rango v�lido,
// el programa solicitar� nuevamente la introducci�n del valor cuantas veces sea
// necesario.

Algoritmo practica06PropuestasII
	
	Definir num Como Entero; // Definimos la variable como entera.
	
	Escribir "Introduce un m�mero entre 0 y 10.";  // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num;
	
	Mientras (num > 10) O (0 > num) Hacer // Mientras el n�mero cumpla estas condiciones. 
		Escribir "Introduce bien el n�mero.";  // Muestra un mensaje por pantalla pidiendo otro n�mero pero que cumpla las condiciones anteriores y lo vuelve a guardar en una variable.
		Leer num;
	FinMientras
	
	Escribir "El n�mero que pusiste es el ", num;  // Muestra un mensaje por pantalla con el n�mero que se puso.
	
FinAlgoritmo
