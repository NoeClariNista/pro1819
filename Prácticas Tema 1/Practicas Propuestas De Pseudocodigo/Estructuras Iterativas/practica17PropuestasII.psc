// 17. Haz un algoritmo que vaya leyendo n�meros hasta que el usuario introduzca un
// n�mero negativo. En ese momento, el algoritmo mostrar� por pantalla el n�mero
// mayor de cuantos ha visto.

Algoritmo practica17PropuestasII
	
	Definir num, maximo Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce una serie de n�meros."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num;
	maximo <- 0; // Inicializamos la variable maximo.
	
	Mientras (0 <= num) Hacer // Realiza un bucle mientras que se cumpla la condici�n.
		Si num > maximo Entonces
			maximo <- num; // Si el n�mero es mayor que el m�ximo se convierte este n�mero en el m�ximo.
		FinSi
		Leer num;
	FinMientras
	
	Escribir "El n�mero m�ximo de la serie es ", maximo; // Muestra un mensaje por pantalla del n�mero m�ximo que se ha introducido.
	
FinAlgoritmo
