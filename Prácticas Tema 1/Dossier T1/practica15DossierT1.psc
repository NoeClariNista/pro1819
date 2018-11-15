// Pr�ctica 15: Calcular usando un array, el valor  m�nimo, m�ximo y valor medio de 7 n�meros
// introducidos por el usuario. El programa le ir� pidiendo todos los n�meros y cuando se hayan
// introducido mostrar� el menor de los n�meros, el mayor y el valor medio.

Algoritmo practica15DossierT1
	
	Definir array, minimo, maximo, medio, acumulador Como Real; // Definimos las variables como reales.
	Dimension array[7]; // Ponemos la dimensi�n que tiene la variable array.
	
	Escribir "Programa para nota m�nima, m�xima y media.";
	medio <- 0; // Inicializamos la variable medio.
	
	Para i <- 0 Hasta 6 Con Paso 1 Hacer
		Escribir "Introduce n�mero ", i+1; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en un array.
		Leer array[i];
	Fin Para
	
	minimo <- array[0]; // Ponemos el valor de la variable array[0] en la variable minimo.
	maximo <- array[0]; // Ponemos el valor de la variable array[0] en la variable maximo.
	acumulador <- array[0]; // Ponemos el valor de la variable array[0] en la variable acumulador.
	
	Para i <- 1 Hasta 6 Con Paso 1 Hacer // Realiza un bucle para realizar la operaci�n.
		Si array[i] > maximo Entonces // Si se cumple la condici�n.
			maximo <- array[i]; // Ponemos el valor de la variable array[i] en la variable maximo.
		FinSi
		Si array[i] < minimo Entonces // Si se cumple la condici�n.
			minimo <- array[i]; // Ponemos el valor de la variable array[i] en la variable minimo.
		FinSi
		acumulador <- array[i] + acumulador; // Vamos guardando el valor del acumulador.
	Fin Para
	
	medio <- acumulador / 7; // Ponemos el valor de la variable acumulador entre 7 en la variable medio.
	
	Escribir "El maximo es ", maximo; // Muestra un mensaje por pantalla del maximo.
	Escribir "El minimo es ", minimo; // Muestra un mensaje por pantalla del minimo.
	Escribir "El valor medio es ", medio; // Muestra un mensaje por pantalla del medio.
	
FinAlgoritmo
