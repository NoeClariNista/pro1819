// 17. Haz un algoritmo que vaya leyendo números hasta que el usuario introduzca un
// número negativo. En ese momento, el algoritmo mostrará por pantalla el número
// mayor de cuantos ha visto.

Algoritmo practica17PropuestasII
	
	Definir num, maximo Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce una serie de números."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	maximo <- 0; // Inicializamos la variable maximo.
	
	Mientras (0 <= num) Hacer // Realiza un bucle mientras que se cumpla la condición.
		Si num > maximo Entonces
			maximo <- num; // Si el número es mayor que el máximo se convierte este número en el máximo.
		FinSi
		Leer num;
	FinMientras
	
	Escribir "El número máximo de la serie es ", maximo; // Muestra un mensaje por pantalla del número máximo que se ha introducido.
	
FinAlgoritmo
