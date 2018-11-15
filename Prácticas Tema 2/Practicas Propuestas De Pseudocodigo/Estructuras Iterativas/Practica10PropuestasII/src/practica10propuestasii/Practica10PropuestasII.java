/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica10PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 10. Escribe un programa que muestre los números pares que hay entre dos
        números que introduzca el usuario por teclado. */
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un número.");
	int numero1 = sc.nextInt();
	System.out.println("Introduce otro número.");
	int numero2 = sc.nextInt();
	if (numero1 > numero2){
            int temporal = numero1;
            numero1 = numero2;
            numero2 = temporal;
        }
	System.out.println("Los números pares entre "+ numero1 +" y "+ numero2);
	while (numero1 <= numero2){
            if ((numero1 % 2) == 0){
                System.out.println(numero1);
            }
            numero1++;
        }
        
    }
    
}
