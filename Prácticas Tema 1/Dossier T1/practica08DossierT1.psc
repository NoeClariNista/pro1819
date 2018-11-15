// Práctica 08: Diseña un algoritmo que, dados dos números enteros, muestre por
// pantalla uno de estos mensajes: "El segundo es el cuadrado exacto del primero.",
// "El segundo es menor que el cuadrado del primero." o "El segundo es mayor que el
// cuadrado del primero.", dependiendo de la verificación de la condición correspondiente
// al significado de cada mensaje.

// Esta práctica también es la Práctica 8 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica08DossierT1
	
	Definir num1, num2 Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un número entero."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce otro número entero."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num2;
	
	Si num2 = num1 * num1 Entonces // Si se cumple la condición.
		Escribir "El segundo es el cuadrado exacto del primero."; // Muestra un mensaje por pantalla.
	SiNo
		Si num2 > num1 * num1 Entonces // Si se cumple la condición.
			Escribir "El segundo es mayor que el cuadrado del primero." // Muestra un mensaje por pantalla.
		SiNo // Sino se cumple la condición.
			Escribir "El segundo es menor que el cuadrado del primero." // Muestra un mensaje por pantalla.
		FinSi
	FinSi
	
FinAlgoritmo
