// Algoritmo de nota media, donde le indicas cuantas notas
// quieres introducir.

Algoritmo practica06Extra
	
	Definir nota, media, suma, n, i Como Entero; // Definimos las variables como enteros.
	
	Escribir "Cuantas notas vas a introducir."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer n;
	
	suma <- 0; // Inicializamos la variable suma.
	
	Para i<-1 Hasta n Con Paso 1 Hacer // Realiza un bucle para realizar la operaci�n.
		Escribir "Introduce la nota ", i;  // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
		Leer nota;
		suma <- suma + nota; // Se van guardando las variables en la variable suma.
	Fin Para
	
	media <- suma / n; // Se resuelve la operaci�n media.
	
	Escribir "La nota media es ", media; // Muestra un mensaje por pantalla de la media.
	
FinAlgoritmo
