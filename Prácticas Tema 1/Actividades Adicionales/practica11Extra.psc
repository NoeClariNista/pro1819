// Haz un algoritmo que calcule el máximo común divisor (mcd) de n números enteros
// positivos. Para ello utilizar una Funcion.

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


Algoritmo practica11Extra
	
	Definir numSiguiente, resultadoMCDparcial, cantidadNumeros, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "Cuantos números deseas";
	Leer cantidadNumeros;
	
	Si CantidadNumeros > 0 Entonces // Si se cumple la condición.
		Escribir "Introduce el número", 1; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
		Leer resultadoMCDparcial ;
		
		i <- 2; // Inicializamos la variable i.
		
		Mientras i <= CantidadNumeros Hacer 
			Escribir "Introduce el número", i; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
			Leer numSiguiente;
			resultadoMCDparcial <- mcd(resultadoMCDparcial, numSiguiente); // Calcula el mcd de la variable resultadoMCDparcial y la variable numSiguiente.
			i <- i + 1; // Incrementamos la variable i.
		FinMientras
		
		Escribir "El mcd es ", resultadoMCDparcial; // Muestra un mensaje por pantalla el mcd de n números.
	SiNo
		Escribir "No es posible hacer el mcd."; // Muestra un mensaje por pantalla.
	FinSi
	
FinAlgoritmo