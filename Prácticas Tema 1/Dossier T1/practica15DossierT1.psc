// Práctica 15: Calcular usando un array, el valor  mínimo, máximo y valor medio de 7 números
// introducidos por el usuario. El programa le irá pidiendo todos los números y cuando se hayan
// introducido mostrará el menor de los números, el mayor y el valor medio.

Algoritmo practica15DossierT1
	
	Definir array, minimo, maximo, medio, acumulador Como Real; // Definimos las variables como reales.
	Dimension array[7]; // Ponemos la dimensión que tiene la variable array.
	
	Escribir "Programa para nota mínima, máxima y media.";
	medio <- 0; // Inicializamos la variable medio.
	
	Para i <- 0 Hasta 6 Con Paso 1 Hacer
		Escribir "Introduce número ", i+1; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en un array.
		Leer array[i];
	Fin Para
	
	minimo <- array[0]; // Ponemos el valor de la variable array[0] en la variable minimo.
	maximo <- array[0]; // Ponemos el valor de la variable array[0] en la variable maximo.
	acumulador <- array[0]; // Ponemos el valor de la variable array[0] en la variable acumulador.
	
	Para i <- 1 Hasta 6 Con Paso 1 Hacer // Realiza un bucle para realizar la operación.
		Si array[i] > maximo Entonces // Si se cumple la condición.
			maximo <- array[i]; // Ponemos el valor de la variable array[i] en la variable maximo.
		FinSi
		Si array[i] < minimo Entonces // Si se cumple la condición.
			minimo <- array[i]; // Ponemos el valor de la variable array[i] en la variable minimo.
		FinSi
		acumulador <- array[i] + acumulador; // Vamos guardando el valor del acumulador.
	Fin Para
	
	medio <- acumulador / 7; // Ponemos el valor de la variable acumulador entre 7 en la variable medio.
	
	Escribir "El maximo es ", maximo; // Muestra un mensaje por pantalla del maximo.
	Escribir "El minimo es ", minimo; // Muestra un mensaje por pantalla del minimo.
	Escribir "El valor medio es ", medio; // Muestra un mensaje por pantalla del medio.
	
FinAlgoritmo
