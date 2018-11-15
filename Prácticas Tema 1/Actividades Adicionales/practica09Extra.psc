// Crear un algoritmo que nos pida 5 números y los guarde en un array.
// Posteriormente deberán mostrar el contenido del array. Finalmente
// cambiarán las posiciones y que quede al revés.
// Ejemplo: Si un usuario ha introducido: [ 3, 7, 2, 9, 1] quedará:
// [1, 9, 2, 7, 3]. Por último se mostrará por pantalla el nuevo array.

Algoritmo practica09Extra
	
	Definir array, temporal, temporal1, i Como Entero; // Definimos las variables como enteros.
	n <- 5; // Inicializamos la variable n.
	Dimension array[n]; // Ponemos la dimensión que tiene el array.
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Introduce número ", i+1; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en un array.
		Leer array[i];
	Fin Para
	
	Escribir Sin Saltar "["
	Para i<-0 Hasta n-2 Con Paso 1 Hacer
		Escribir Sin Saltar array[i], ", "; // Muestra un mensaje por pantalla del array.
	FinPara
	Escribir Sin Saltar array[n-1], "]";
	Escribir " "
	
	Escribir Sin Saltar "["
	Para i<-0 Hasta n-2 Con Paso 1 Hacer
		temporal <- array[i]; 
		temporal1 <- array[n-i-1];
		array[i] <- temporal;
		array[n-i-1] <- temporal1;
		Escribir Sin Saltar array[n-i-1], ", "; // Muestra un mensaje por pantalla del array inverso.
	FinPara	
	Escribir Sin Saltar array[i], "]";
	Escribir " "	
	
FinAlgoritmo