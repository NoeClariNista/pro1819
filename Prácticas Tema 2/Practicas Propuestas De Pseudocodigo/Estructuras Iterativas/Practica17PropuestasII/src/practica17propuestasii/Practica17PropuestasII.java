/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica17PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 17.	Haz un algoritmo que vaya leyendo números hasta que el usuario
        introduzca un número negativo. En ese momento, el algoritmo mostrará por
        pantalla el número mayor de cuantos ha visto. */
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una serie de números.");
	int numero = sc.nextInt();
	int maximo = 0;
	while (0 <= numero){
            if (numero > maximo){
		maximo = numero;
            }
            numero = sc.nextInt();
        }
	System.out.println("El número máximo de la serie es "+ maximo);
        
    }
    
}
