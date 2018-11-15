// 7. Diseña un algoritmo que solicite la lectura, letra a letra, de un texto que
// no contenga letras mayúsculas. Si el usuario teclea una letra mayúscula, el
// algoritmo solicitará nuevamente la introducción del texto cuantas veces sea preciso.

Algoritmo practica07PropuestasII
	
	Definir text Como Texto; // Definimos la variable como texto.
	definir letra Como Caracter; // Definimos la variable como caracter.
	
	Escribir "Introduce un texto letra a letra hasta que introduzcas un punto.";
	letra <- ""; // Inicializamos la variable letra.
	text <- ""; // Inicializamos la variable text.
	
	Repetir
		Escribir "Añade una letra.";  // Muestra un mensaje por pantalla pidiendo una letra y la guarda en una variable.
		Leer letra; 
		Si (letra >= "a") Y (letra <= "z") Entonces // Si la letra se encuentra entre los valores indicados.
			text <- Concatenar(text,letra); // Concatena text y letra.
		SiNo
			Escribir "Letra no válida."; // Muestra un mensaje por pantalla si la letra no se encuentra entre los valores indicados.
		FinSi
	Hasta Que letra == "." // Terminara el bucle cuando se introduzca un punto.
	
	Escribir text; // Muestra por pantalla la variable text.
	
FinAlgoritmo
