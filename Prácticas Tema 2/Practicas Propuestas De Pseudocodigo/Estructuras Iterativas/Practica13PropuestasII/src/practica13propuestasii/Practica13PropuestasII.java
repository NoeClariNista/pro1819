/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica13PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 13. Haz un algoritmo que pida el valor de dos enteros n y m y calcule
        el sumatorio de todos los números pares comprendidos entre ellos
        (incluyéndolos en el caso de que sean pares). */
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el número n.");
	int n = sc.nextInt();
        System.out.println("Introduce el número m.");
	int m = sc.nextInt();
	int acumulador = 0;
        if (n > m){
            int temporal = n;
            n = m;
            m = temporal;
        }
        if ((n % 2) != 0){
            n++;
        }
	if ((m % 2) != 0){
            m--;
        }
        for (int i = n;i <= m;i += 2){
            acumulador += i;
        }
        System.out.println("El resultado es "+ acumulador);
	
    }
    
}
