/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica02PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 2. Implementa un algoritmo que muestre todos los múltiplos de n entre n y m·n,
        ambos inclusive, donde n y m son números introducidos por el usuario. */
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el numero n.");
	int n = sc.nextInt();
	System.out.println("Introduce el numero m.");
	int m = sc.nextInt();
	for (int i = n;i <= (n*m);i += n){
            System.out.println(i);
        }
        
    }
    
}
