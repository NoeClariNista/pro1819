// Pr�ctica 03: Realizar un algoritmo que sirva para convertir pulgadas a
// cent�metros. (Recuerda que 1 pulgada = 2.54 cent�metros).  ( utilizar
// una variable llamada pulgada ).

// Esta pr�ctica tambi�n es la Pr�ctica 2 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica03DossierT1
	
	Definir PULGADA, cantidad Como Real; // Definimos las variables como reales.
	
	Escribir "Introduce las pulgadas."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer cantidad;
	PULGADA <- 2.54; // Inicializamos la variable PULGADA.
	
	resultado <- cantidad * PULGADA; // Hace la operaci�n resultado.
	
	Escribir "El resultado es ", resultado ,"cm."; // Muestra un mensaje por pantalla del resultado.
	
FinAlgoritmo
