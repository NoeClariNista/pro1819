// Práctica 13: Diseña un algoritmo que, dados cinco números enteros, determine cuál
// de los cuatro últimos números es más cercano al primero. (Por ejemplo, si el usuario
// introduce los números 2, 6, 4, 1 y 10, el programa responderá que el número más cercano
// al 2 es el 1.)

// Esta práctica también es la Práctica 9 en Prácticas propuestas 
// de pseudocódigo - Estructuras Secuenciales y Condicionales.

Algoritmo practica13UnoDossierT1
	
	Definir numero1, numero2, numeroCandidato, numeroResultante Como Entero; // Definimos las variables como enteros.
	Definir distancia2, distanciaCandidata, menorDistancia, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "Introduce un primer número entero"; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer numero1;	
	Escribir "Introduce un segundo número entero"; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer numero2;
	
	distancia2 <- abs(numero2 - numero1); // Ponemos el valor de la variable abs(numero2 - numero1) en la variable distancia2.
	menorDistancia <- distancia2; // Ponemos el valor de la variable distancia2 en la variable menorDistancia.
	numeroResultante <- numero2; // Ponemos el valor de la variable numero2 en la variable numeroResultante.
	i <- 1; // Inicializamos la variable i.
	
	Repetir
		Escribir "Introduce el número entero ", i+2; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en un array.
		Leer numeroCandidato;
		
		distanciaCandidata <- abs(numero1 - numeroCandidato); // Realizamos la operación.
		
		Si menorDistancia > distanciaCandidata Entonces // Si cumple la condición.
			menorDistancia <- distanciaCandidata; // Ponemos el valor de la variable distanciaCandidata en la variable menorDistancia.
			numeroResultante <- numeroCandidato; // Ponemos el valor de la variable numeroCandidato en la variable numeroResultante.
		FinSi
		
		i <- i + 1; // Incrementamos la variable i.
	Hasta Que i >= 4;
	
	Escribir "El número más próximo es el ", numeroResultante; // Muestra un mensaje por pantalla del número más próximo al primer número introducido.
	
FinAlgoritmo
