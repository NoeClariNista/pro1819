// Haz un algoritmo que calcule el mínimo común multiplo (mcm) de dos enteros
// positivos.

Funcion resultado <- mcd (dividendo, divisor)
	
	Definir resultado, resto, cociente Como Entero; // Definimos las variables como enteros.
	
	resto <- 1; // Inicializamos la variable resto.
	
	Mientras (resto != 0) Hacer
		cociente <- trunc(dividendo / divisor); // Calcula el valor del cociente.
		resto <- dividendo % divisor; // Calcula el valor del resto.
		
		dividendo <- divisor // Ponemos el valor de la variable divisor en la variable dividendo.
		divisor <- resto // Ponemos el valor de la variable resto en la variable divisor.
	Fin Mientras
	
	resultado <- dividendo; // Ponemos el valor de la variable dividendo en la variable resultado.
	
Fin Funcion

Algoritmo practica10Extra
	
	Definir mcm Como Entero; // Definimos la variable como entero.
	Definir num1, num2 Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce el número 1."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce el número 2."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num2;
	
	mcm <- (num1 * num2) / mcd(num1,num2); // Calcula el mcm de la variable num1 y la variable num2.
	
	Escribir "El mcm es ", mcm; // Muestra un mensaje por pantalla de mcm de dos números.
	
FinAlgoritmo
