// Práctica 03: Realizar un algoritmo que sirva para convertir pulgadas a
// centímetros. (Recuerda que 1 pulgada = 2.54 centímetros).  ( utilizar
// una variable llamada pulgada ).

// Esta práctica también es la Práctica 2 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica03DossierT1
	
	Definir PULGADA, cantidad Como Real; // Definimos las variables como reales.
	
	Escribir "Introduce las pulgadas."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer cantidad;
	PULGADA <- 2.54; // Inicializamos la variable PULGADA.
	
	resultado <- cantidad * PULGADA; // Hace la operación resultado.
	
	Escribir "El resultado es ", resultado ,"cm."; // Muestra un mensaje por pantalla del resultado.
	
FinAlgoritmo
