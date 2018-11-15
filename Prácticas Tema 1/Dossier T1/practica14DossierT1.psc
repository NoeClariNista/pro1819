// Práctica 14: Usando el código anterior como una función desarrollar el siguiente programa:
// El número de combinaciones que podemos formar tomando m elementos de un conjunto con n elementos
// es: C(m,n) = n! / (n - m)!m! . Diseña un algoritmo que pida el valor de n y m y calcule Cm n .
// (Ten en cuenta que n ha de ser mayor o igual que m.) (Puedes comprobar la validez de tu programa
// introduciendo los valores n = 15 y m = 10: el resultado es 3003.)

// Esta práctica también es la Práctica 5 en Prácticas propuestas 
// de pseudocódigo II - Estructuras Iterativas.

Funcion factor <- factorial(cantidad)
	
	Definir acumulador, i Como Real; // Definimos las variables como reales.
	
	acumulador <- 1; // Inicializamos la variable acumulador.
	
	Si cantidad = 0 Entonces // Si se cumple la condición.
		factor <- 1; // Igualamos la variable factor a 1
	SiNo
		Para i <- 1 Hasta cantidad Con Paso 1 Hacer // Realiza un bucle para realizar la operación.
			acumulador <- acumulador * i; // Se va acumulando el valor en la variable acumulador.
		Fin Para
		factor <- acumulador;  // Ponemos el valor de la variable acumulador en la variable factor.
	FinSi
	
FinFuncion

Algoritmo practica14DossierT1
	
	Definir n, m Como Entero; // Definimos las variables como enteros.
	Definir combinacion Como Real; // Definimos la variable como real.
	
	combinacion <- 1; // Inicializamos la variable combinación.
	
	Escribir "Introduce el valor m."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer m;
	Escribir "Introduce el valor n."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer n;
	
	Si m > n Entonces
		Escribir "No puede hacerse."; // Muestra un mensaje por pantalla.
	SiNo
		combinacion <- factorial(n) / (factorial((n-m)) * factorial(m)); // Realiza la operación.
		Escribir "Las combinaciones de ", m, " Y ", n, " son ", combinacion;  // Muestra un mensaje por pantalla de las combinaciones.
	FinSi
	
FinAlgoritmo
