// Se le solicita al usuario que introduzca dos n�meros
// por ejemplo, num1 y num2, se generar�n dos n�meros aleatorios para
// comprobar si coinciden con los n�meros introducidos por el usuario.
// en el caso que acertar uno y s�lo uno entonces aparecer� en pantalla un mensaje de
//*********
//*�BRAVO!*
//*********
// en el caso que acertase con los dos n�meros aparecera el mismo mensaje anterior dos veces.

Algoritmo practica07Extra
	
	Definir x1, x2, num1, num2 Como Entero; // Definimos las variables como enteros.
	
	x1 <- azar(10); // Inicializamos la variable x1.
	x2 <- azar (10); // Inicializamos la variable x2.

	Escribir "Introduce un primer n�mero."; // Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce un segundo n�mero.";// Muestra un mensaje por pantalla pidiendo un n�mero y lo guarda en una variable.
	Leer num2;
	
	Si (x1 = num1 o x2 = num1) y (x1 = num2 o x2 = num2) Entonces // Si se cumple la condici�n.
		Escribir "**********";
		Escribir "*�BRAVO!*";
		Escribir "**********"; // Muestra un mensaje por pantalla.
		Escribir "**********";
		Escribir "*�BRAVO!*";
		Escribir "**********";
	SiNo
		Si (x1 = num1 o x2 = num1 o x1 = num2 o x2 = num2) Entonces // Si se cumple la condici�n.
			Escribir "**********";
			Escribir "*�BRAVO!*"; // Muestra un mensaje por pantalla.
			Escribir "**********";
		SiNo
			Escribir "No acertaste con ninguno de los dos n�meros."; // Muestra un mensaje por pantalla.
		FinSi
	FinSi
	
FinAlgoritmo
