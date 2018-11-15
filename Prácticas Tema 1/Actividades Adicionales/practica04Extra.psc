// Ejemplo de un algoritmo donde introduces dos números. Si
// es mayor que 20 te sale el resultado y si es menor o igual que
// 20 te sale un mensaje por pantalla.

Algoritmo practica04Extra
	
	Definir numero1, numero2 Como Entero;  // Definimos las variables como enteros.
	
	Escribir "Introduce un numero." // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer numero1;
	Escribir "Introduce otro numero." // Muestra un mensaje por pantalla pidiendo un número y lo guarda en una variable.
	Leer numero2;
	
	resultado <- numero1 + numero2 // Realiza la operación resultado.
	
	Si resultado Es Mayor Que 20 // Si se cumple la condición.
	Entonces
		Escribir resultado;	// Muestra un mensaje por pantalla del resultado.
	SiNo
		Escribir "El número es menor o igual que 20." // Muestra un mensaje por pantalla.
	FinSi
	
FinAlgoritmo
