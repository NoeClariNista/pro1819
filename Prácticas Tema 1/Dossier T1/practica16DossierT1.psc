// Pr�ctica 16:  Mostrar usando un array los dos n�meros mayores de 10 n�meros introducidos
// por teclado

Algoritmo practica16DossierT1
	
	Definir array, maximo1, maximo2, i Como Entero; // Definimos las variables como enteros.
	Dimension array[10]; // Ponemos la dimensi�n que tiene la variable array.
	
	Escribir "Programa para ver los dos n�meros mayores introducidos.";

	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Introduce n�mero ", i+1; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en un array.
		Leer array[i];
	Fin Para
	
	Si array[0] > array[1] Entonces
		maximo1 <- array[0]; // Ponemos el valor de la variable array[0] en la variable maximo1.
		maximo2 <- array[1]; // Ponemos el valor de la variable array[1] en la variable maximo2.
	SiNo
		maximo1 <- array[1]; // Ponemos el valor de la variable array[1] en la variable maximo1.
		maximo2 <- array[0]; // Ponemos el valor de la variable array[0] en la variable maximo2.
	FinSi

	Para i <- 2 Hasta 9 Con Paso 1 Hacer // Realiza un bucle para realizar la operaci�n.
		Si array[i] > maximo1 Entonces // Si se cumple la condici�n.
			maximo2 <- maximo1; // Ponemos el valor de la variable maximo1 en la variable maximo2.
			maximo1 <- array[i]; // Ponemos el valor de la variable array[i] en la variable maximo1.
		SiNo
			Si array[i] > maximo2 Entonces // Si se cumple la condici�n.
				maximo2 <- array[i]; // Ponemos el valor de la variable array[i] en la variable maximo2.
			FinSi
		FinSi
	Fin Para
	
	Escribir "El primer n�mero maximo es ", maximo1; // Muestra un mensaje por pantalla del maximo1.
	Escribir "El segundo n�mero maximo es ", maximo2; // Muestra un mensaje por pantalla del maximo2.
	
FinAlgoritmo
