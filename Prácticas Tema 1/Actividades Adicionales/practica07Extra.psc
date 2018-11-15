// Se le solicita al usuario que introduzca dos números
// por ejemplo, num1 y num2, se generarán dos números aleatorios para
// comprobar si coinciden con los números introducidos por el usuario.
// en el caso que acertar uno y sólo uno entonces aparecerá en pantalla un mensaje de
//*********
//*¡BRAVO!*
//*********
// en el caso que acertase con los dos números aparecera el mismo mensaje anterior dos veces.

Algoritmo practica07Extra
	
	Definir x1, x2, num1, num2 Como Entero; // Definimos las variables como enteros.
	
	x1 <- azar(10); // Inicializamos la variable x1.
	x2 <- azar (10); // Inicializamos la variable x2.

	Escribir "Introduce un primer número."; // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num1;
	Escribir "Introduce un segundo número.";// Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer num2;
	
	Si (x1 = num1 o x2 = num1) y (x1 = num2 o x2 = num2) Entonces // Si se cumple la condición.
		Escribir "**********";
		Escribir "*¡BRAVO!*";
		Escribir "**********"; // Muestra un mensaje por pantalla.
		Escribir "**********";
		Escribir "*¡BRAVO!*";
		Escribir "**********";
	SiNo
		Si (x1 = num1 o x2 = num1 o x1 = num2 o x2 = num2) Entonces // Si se cumple la condición.
			Escribir "**********";
			Escribir "*¡BRAVO!*"; // Muestra un mensaje por pantalla.
			Escribir "**********";
		SiNo
			Escribir "No acertaste con ninguno de los dos números."; // Muestra un mensaje por pantalla.
		FinSi
	FinSi
	
FinAlgoritmo
