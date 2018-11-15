// Práctica 04: Diseña un algoritmo que pida el valor del lado de un
// cuadrado y muestre el valor de su perímetro y el de su área.

// Esta práctica también es la Práctica 4 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica04DossierT1
	
	Definir lado, perimetro, area Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el tamaño del lado del cuadrado."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer lado;
	
	perimetro <- lado * 4; // Hace la operación perimetro.
	area <- lado * lado; // Hace la operación area.
	
	Escribir "El perímetro del cuadro es ", perimetro, " y el área es ", area; // Muestra un mensaje por pantalla del area.
	
FinAlgoritmo
