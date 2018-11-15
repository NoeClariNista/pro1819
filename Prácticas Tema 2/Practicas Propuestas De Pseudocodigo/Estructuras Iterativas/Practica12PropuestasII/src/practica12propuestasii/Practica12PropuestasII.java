/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica12PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 12. Haz un algoritmo que pida el valor de dos enteros n y m y que
        muestre por pantalla el valor del sumatorio desde i=n hasta m de i2. */
        
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
	for (int i = n;i <= m;i++){
            acumulador += i*i;
        }
        System.out.println("El sumatorio es "+ acumulador);
	
    }
    
}
