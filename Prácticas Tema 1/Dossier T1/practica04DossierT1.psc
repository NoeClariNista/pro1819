// Pr�ctica 04: Dise�a un algoritmo que pida el valor del lado de un
// cuadrado y muestre el valor de su per�metro y el de su �rea.

// Esta pr�ctica tambi�n es la Pr�ctica 4 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica04DossierT1
	
	Definir lado, perimetro, area Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el tama�o del lado del cuadrado."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer lado;
	
	perimetro <- lado * 4; // Hace la operaci�n perimetro.
	area <- lado * lado; // Hace la operaci�n area.
	
	Escribir "El per�metro del cuadro es ", perimetro, " y el �rea es ", area; // Muestra un mensaje por pantalla del area.
	
FinAlgoritmo
