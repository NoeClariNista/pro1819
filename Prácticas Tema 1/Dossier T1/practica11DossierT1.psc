// Práctica 11: Implementa un algoritmo que muestre todos los múltiplos de n entre
// n y m·n, ambos inclusive, donde n y m son números introducidos por el usuario.

// Esta práctica también es la Práctica 2 en Prácticas propuestas 
// de pseudocódigo II - Estructuras Iterativas.

Algoritmo practica11DossierT1
	
	Definir m, n Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el numero n."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer n;
	Escribir "Introduce el numero m."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer m;
	
	Para i <- n Hasta (n * m) Con Paso n Hacer // Realiza un bucle para realizar la operación.
		Escribir i; // Muestra un mensaje por pantalla los valores de i.
	Fin Para
	
FinAlgoritmo
