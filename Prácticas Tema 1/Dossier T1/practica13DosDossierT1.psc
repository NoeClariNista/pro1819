// Práctica 13: Queremos hacer un algoritmo que calcule el factorial de un número entero
// positivo. El factorial de n se denota con n!, pero no existe ningún operador que permita
// efectuar este cálculo directamente. Sabiendo que n! = 1 · 2 · 3 · . . . · (n - 1) · n y que 0! = 1,
// haz un algoritmo que pida el valor de n y muestre por pantalla el resultado de calcular n!.

// Esta práctica también es la Práctica 4 en Prácticas propuestas 
// de pseudocódigo II - Estructuras Iterativas.

Algoritmo practica13DosDossierT1
	
	Definir factor, num, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el número que quieres factorizar."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num;
	factor <- 1; // Inicializamos la variable factor.
	
	Si num <- 0 Entonces // Si cumple la condición.
		Escribir "El factorial de", num, "Es 1."; // Muestra un mensaje por pantalla del factorial.
	SiNo
		Para i <- num Hasta 1 Con Paso -1 Hacer // Realiza un bucle para realizar la operación.
			factor <- factor * i; // Hace la operación factor.
		Fin Para
		
		Escribir "El factorial de ", num, " es ", factor;  // Muestra un mensaje por pantalla del resultado.
	FinSi
	
FinAlgoritmo
