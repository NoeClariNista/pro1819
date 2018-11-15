// 13. Haz un algoritmo que pida el valor de dos enteros n y m y calcule el sumatorio
// de todos los números pares comprendidos entre ellos (incluyéndolos en el caso de que
// sean pares).

Algoritmo practica13PropuestasII
	
	Definir n, m, temp, i, acumulador Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce el número n."; // Muestra un mensaje por pantalla pidiendo un número n y lo guarda en una variable.
	Leer n;
	Escribir "Introduce el número m."; // Muestra un mensaje por pantalla pidiendo un número m y lo guarda en una variable.
	Leer m;
	acumulador <- 0; // Inicializamos la variable acumulador.

	Si n > m Entonces // Si ocurre que el número n es mayor que el número m realiza esta condición.
		temp <- n;
		n <- m;
		m <- temp;		
	FinSi

	Si (n % 2) != 0 Entonces  
		n <- n + 1; // Incrementamos el valor de n.
	FinSi
	
	Si (m % 2) != 0 Entonces  
		m <- m - 1; // Disminuimos el valor de m.
	FinSi
	
	Para i <- n Hasta m Con Paso 2 Hacer // Realiza un bucle para realizar la operación.
		acumulador <- i + acumulador; // Vamos guardando el valor del acumulador.
	FinPara
	
	Escribir "El Resultado es ", acumulador; // Muestra un mensaje por pantalla el sumatorio.
	
FinAlgoritmo
