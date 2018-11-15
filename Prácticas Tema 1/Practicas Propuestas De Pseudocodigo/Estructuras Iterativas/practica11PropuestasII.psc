// 11. Haz un algoritmo que pida el valor de dos enteros n y m y que muestre por
// pantalla el valor del sumatorio desde i=n hasta m de i.

Algoritmo practica11PropuestasII
	
	Definir n, m, temp, i, acumulador Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce el número n."; // Muestra un mensaje por pantalla pidiendo un número n y lo guarda en una variable.
	Leer n;
	Escribir "Introduce el número m."; // Muestra un mensaje por pantalla pidiendo un número m y lo guarda en una variable.
	Leer m;
	acumulador <- 0;
	
	Si n > m Entonces // Si ocurre que el número n es mayor que el número m realiza esta condición.
		temp <- n;
		n <- m;
		m <- temp;		
	FinSi
	
	Para i <- n Hasta m Con Paso 1 Hacer // Realiza un bucle para realizar la operación.
		acumulador <- i + acumulador; // Vamos guardando el valor del acumulador.
	FinPara
	
	Escribir "El sumatorio es ", acumulador; // Muestra un mensaje por pantalla el sumatorio.
	
FinAlgoritmo
