// Práctica 09: Crear un algoritmo que le solicite al usuario un número y muestre la
// tabla de multiplicar para ese número. Hacerlo para los tres tipos de bucles que
// hemos visto.

Algoritmo practica09DossierT1
	
	definir num, option, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "MENU.";
	Escribir "1) Ejecutar con el bucle mientras.";
	Escribir "2) Ejecutar con el bucle repetir.";
	Escribir "3) Ejecutar con el bucle para.";
	Leer option;
	Escribir "Que tabla quieres ver."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	
	Si option = 1 Entonces // Si cumple la condición. 1 mientras.
		i <- 1; // Inicializamos la variable i.
		Mientras i < 11 Hacer
			Escribir num, "x", i ," = ", num*i;  // Muestra un mensaje por pantalla de una tabla de multiplicar.
			i <- i + 1; // Incrementa la variable i.
		FinMientras
	SiNo
		Si option = 2 Entonces // Si cumple la condición. 2 repetir.
			i <- 1; // Inicializamos la variable i.
			Repetir
				Escribir num ,"x", i ,"=", num*i;  // Muestra un mensaje por pantalla de una tabla de multiplicar.
				i <- i + 1; // Incrementa la variable i.
			Hasta que i > 10
		Sino 
			Si option = 3 Entonces // Si cumple la condición. 3 para.
				Para i <- 1 Hasta 10 Con Paso 1 Hacer
					Escribir num ,"x", i ," = ", num*i;  // Muestra un mensaje por pantalla de una tabla de multiplicar.
				Fin Para
			SiNo // Otros casos.
				Escribir "El número no es correcto.";  // Muestra un mensaje por pantalla.
			FinSi
		FinSi
	FinSi 
	
FinAlgoritmo
