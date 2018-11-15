// Pr�ctica 08: Dise�a un algoritmo que, dados dos n�meros enteros, muestre por
// pantalla uno de estos mensajes: "El segundo es el cuadrado exacto del primero.",
// "El segundo es menor que el cuadrado del primero." o "El segundo es mayor que el
// cuadrado del primero.", dependiendo de la verificaci�n de la condici�n correspondiente
// al significado de cada mensaje.

// Esta pr�ctica tambi�n es la Pr�ctica 8 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica08DossierT1
	
	Definir num1, num2 Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un n�mero entero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce otro n�mero entero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num2;
	
	Si num2 = num1 * num1 Entonces // Si se cumple la condici�n.
		Escribir "El segundo es el cuadrado exacto del primero."; // Muestra un mensaje por pantalla.
	SiNo
		Si num2 > num1 * num1 Entonces // Si se cumple la condici�n.
			Escribir "El segundo es mayor que el cuadrado del primero." // Muestra un mensaje por pantalla.
		SiNo // Sino se cumple la condici�n.
			Escribir "El segundo es menor que el cuadrado del primero." // Muestra un mensaje por pantalla.
		FinSi
	FinSi
	
FinAlgoritmo
