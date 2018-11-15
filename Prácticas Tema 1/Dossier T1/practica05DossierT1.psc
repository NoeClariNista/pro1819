// Pr�ctica 05: Dise�a un algoritmo que pida el valor de los dos lados de
// un rect�ngulo y muestre el valor de su per�metro y el de su �rea.

// Esta pr�ctica tambi�n es la Pr�ctica 5 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica05DossierT1
	
	Definir base, altura, perimetro, area Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el tama�o de la base del rectangulo."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer base;
	Escribir "Introduce el tama�o de la altura del rectangulo."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer altura;
	
	perimetro <- (2 * base) + (2 * altura); // Hace la operaci�n perimetro.
	area <- base * altura; // Hace la operaci�n area.
	
	Escribir "El per�metro del rectangulo es ", perimetro, " y el �rea es ", area; // Muestra un mensaje por pantalla del area.
	
FinAlgoritmo
