/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica14PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 14. Haz un algoritmo que calcule el máximo común divisor (mcd) de dos
        enteros positivos. El mcd es el número más grande que divide exactamente
        a ambos números. */
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el número 1.");
	int dividendo = sc.nextInt();
	System.out.println("Introduce el número 2.");
	int divisor = sc.nextInt();
	int resto = 1;
	while (resto != 0){
            int cociente = dividendo / divisor;
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }
	int mcd = dividendo;
	System.out.println("El mcd es "+ mcd);
        
    }
    
}
