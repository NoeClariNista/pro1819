// Pr�ctica 13: Dise�a un algoritmo que, dados cinco n�meros enteros, determine cu�l
// de los cuatro �ltimos n�meros es m�s cercano al primero. (Por ejemplo, si el usuario
// introduce los n�meros 2, 6, 4, 1 y 10, el programa responder� que el n�mero m�s cercano
// al 2 es el 1.)

// Esta pr�ctica tambi�n es la Pr�ctica 9 en Pr�cticas propuestas 
// de pseudoc�digo - Estructuras Secuenciales y Condicionales.

Algoritmo practica13UnoDossierT1
	
	Definir numero1, numero2, numeroCandidato, numeroResultante Como Entero; // Definimos las variables como enteros.
	Definir distancia2, distanciaCandidata, menorDistancia, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un primer n�mero entero"; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer numero1;	
	Escribir "Introduce un segundo n�mero entero"; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer numero2;
	
	distancia2 <- abs(numero2 - numero1); // Ponemos el valor de la variable abs(numero2 - numero1) en la variable distancia2.
	menorDistancia <- distancia2; // Ponemos el valor de la variable distancia2 en la variable menorDistancia.
	numeroResultante <- numero2; // Ponemos el valor de la variable numero2 en la variable numeroResultante.
	i <- 1; // Inicializamos la variable i.
	
	Repetir
		Escribir "Introduce el n�mero entero ", i+2; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en un array.
		Leer numeroCandidato;
		
		distanciaCandidata <- abs(numero1 - numeroCandidato); // Realizamos la operaci�n.
		
		Si menorDistancia > distanciaCandidata Entonces // Si cumple la condici�n.
			menorDistancia <- distanciaCandidata; // Ponemos el valor de la variable distanciaCandidata en la variable menorDistancia.
			numeroResultante <- numeroCandidato; // Ponemos el valor de la variable numeroCandidato en la variable numeroResultante.
		FinSi
		
		i <- i + 1; // Incrementamos la variable i.
	Hasta Que i >= 4;
	
	Escribir "El n�mero m�s pr�ximo es el ", numeroResultante; // Muestra un mensaje por pantalla del n�mero m�s pr�ximo al primer n�mero introducido.
	
FinAlgoritmo
