// 3. Dise�ar un algoritmo que calcule el �rea de un tri�ngulo
// en funci�n de su base y su altura.

Algoritmo practica03Propuestas
	
	Definir base, altura, area Como Real; // Definimos las variables como reales.
	
	Escribir "Introduce la base del triangulo (en cm)."; // Muestra un mensaje por pantalla pidiendo la base del triangulo y la guarda en una variable.
	Leer base;
	Escribir "Introduce la altura del triangulo (en cm)."; // Muestra un mensaje por pantalla pidiendo la altura del triangulo y la guarda en una variable.
	Leer altura;
	
	area <- (base * altura) / 2; // Calcula el �rea de un tri�ngulo.
	
	Escribir "El area del triangulo con base ", base, "cm y altura ", altura, "cm es ", area, "cm�."; // Muestra un mensaje por pantalla del �rea del tri�ngulo.
	
FinAlgoritmo
