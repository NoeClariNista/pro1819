// Práctica 02: Realizar un un algoritmo que calcule el IVA (16%) de un
// producto dado su precio de venta sin IVA.

// Esta práctica también es la Práctica 1 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica02DossierT1
	
	Definir precio, IVA, resultado Como Real; // Definimos las variables como enteras.
	
	Escribir "Introduce el precio del producto."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer precio;
	IVA <- 0.21;
	
	resultado <- IVA * precio; // Hace la operación resultado.
	
	Escribir "El IVA de ", precio ," es de ", resultado; // Muestra un mensaje por pantalla del IVA.
	
FinAlgoritmo
