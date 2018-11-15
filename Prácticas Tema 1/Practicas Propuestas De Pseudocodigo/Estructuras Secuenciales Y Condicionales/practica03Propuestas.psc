// 3. Diseñar un algoritmo que calcule el área de un triángulo
// en función de su base y su altura.

Algoritmo practica03Propuestas
	
	Definir base, altura, area Como Real; // Definimos las variables como reales.
	
	Escribir "Introduce la base del triangulo (en cm)."; // Muestra un mensaje por pantalla pidiendo la base del triangulo y la guarda en una variable.
	Leer base;
	Escribir "Introduce la altura del triangulo (en cm)."; // Muestra un mensaje por pantalla pidiendo la altura del triangulo y la guarda en una variable.
	Leer altura;
	
	area <- (base * altura) / 2; // Calcula el área de un triángulo.
	
	Escribir "El area del triangulo con base ", base, "cm y altura ", altura, "cm es ", area, "cm²."; // Muestra un mensaje por pantalla del área del triángulo.
	
FinAlgoritmo
