// Crear un algoritmo que nos pida 5 n�meros y los guarde en un array.
// Posteriormente deber�n mostrar el contenido del array. Finalmente
// cambiar�n las posiciones y que quede al rev�s.
// Ejemplo: Si un usuario ha introducido: [ 3, 7, 2, 9, 1] quedar�:
// [1, 9, 2, 7, 3]. Por �ltimo se mostrar� por pantalla el nuevo array.

Algoritmo practica09Extra
	
	Definir array, temporal, temporal1, i Como Entero; // Definimos las variables como enteros.
	n <- 5; // Inicializamos la variable n.
	Dimension array[n]; // Ponemos la dimensi�n que tiene el array.
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Introduce n�mero ", i+1; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en un array.
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