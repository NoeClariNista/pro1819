// 15. Haz un algoritmo que calcule el máximo común divisor (mcd) de tres enteros
// positivos. El mcd de tres números es el número más grande que divide exactamente
// a los tres.

Funcion resultado <- mcd (dividendo, divisor)
	
	Definir resultado, cociente, resto Como Entero; // Definimos las variables como enteros.
	resto <- 1; // Inicializamos la variable resto.
	
	Mientras (resto != 0) Hacer 
		cociente <- trunc(dividendo / divisor); // Calcula el valor del cociente.
		resto <- dividendo % divisor; // Calcula el valor del resto.
		
		dividendo <- divisor // Ponemos el valor de la variable divisor en la variable dividendo.
		divisor <- resto // Ponemos el valor de la variable resto en la variable divisor.
	Fin Mientras
	
	resultado <- dividendo; // Ponemos el valor de la variable dividendo en la variable resultado.
	
Fin Funcion

Algoritmo practica15PropuestasII
	
	Definir num1, num2, num3 Como Entero; // Definimos las variables como enteras.
	Definir mcdNum1Num2, mcdNum1Num2Num3 Como Entero; // Definimos las variables como enteras.
	
	Escribir "Introduce el número 1"; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce el número 2"; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num2;
	Escribir "Introduce el número 3"; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num3;
	
	mcdNum1Num2 <- mcd(num1,num2); // Calcula el mcd de la variable num1 y la variable num2.
	mcdNum1Num2Num3 <- mcd(mcdNum1Num2,num3); // Calcula el mcd del mcd anteriormente calculado y la variable num3.
	
	Escribir "El mcd es ", mcdNum1Num2Num3; // Muestra un mensaje por pantalla el mcd de tres números.
	
FinAlgoritmo
