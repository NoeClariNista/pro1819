// Ejemplo de algoritmo para resolver una Ecuaci�n segundo grado.
// ax� bx + c = 0.

Algoritmo practica03Extra 
	
	Definir a, b, c Como Real; // Definimos las variables como reales.
	Definir x1, x2 Como Real; // Definimos las variables como reales.
	Definir rcinterna Como Real; // Definimos la variable como real.
	
	Escribir "Resoluci�n de ax� + bx + c = 0.";
	Escribir "Introduce el valor de la a."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer a;
	Escribir "Introduce el valor de la b."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer b;
	Escribir "Introduce el valor de la c."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer c;
	
	rcinterna <- b^2 - 4*a*c; // Realiza la operacion rcinterna.
	
	Si rcinterna < 0 Entonces // Si se cumple la condici�n.
		Escribir "Ra�z negativa, no hay soluci�n."; // Muestra un mensaje por pantalla.
	SiNo
		Si a <= 0  // Si se cumple la condici�n.
			Escribir "No se puede hacer, estas dividiendo entre 0.";  // Muestra un mensaje por pantalla.
		SiNo
			x1 <- (-b + rc(rcinterna)) / (2 * a); // Realiza la operaci�n x1.
			x2 <- (-b - rc(rcinterna)) / (2 * a); // Realiza la operaci�n x2.
			Escribir "Los resultados son ", x1, " y ", x2; // Muestra un mensaje por pantalla de los resultados.
		FinSi
	FinSi
	
FinAlgoritmo
	