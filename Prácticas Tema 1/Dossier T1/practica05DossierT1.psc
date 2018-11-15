// Práctica 05: Diseña un algoritmo que pida el valor de los dos lados de
// un rectángulo y muestre el valor de su perímetro y el de su área.

// Esta práctica también es la Práctica 5 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica05DossierT1
	
	Definir base, altura, perimetro, area Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el tamaño de la base del rectangulo."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer base;
	Escribir "Introduce el tamaño de la altura del rectangulo."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer altura;
	
	perimetro <- (2 * base) + (2 * altura); // Hace la operación perimetro.
	area <- base * altura; // Hace la operación area.
	
	Escribir "El perímetro del rectangulo es ", perimetro, " y el área es ", area; // Muestra un mensaje por pantalla del area.
	
FinAlgoritmo
