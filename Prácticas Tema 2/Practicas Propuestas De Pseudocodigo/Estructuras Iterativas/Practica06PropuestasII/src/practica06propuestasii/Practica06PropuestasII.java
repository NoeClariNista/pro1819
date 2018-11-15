/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica06PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 6. Diseña un algoritmo que solicite la lectura de un número entre 0
        y 10 (ambos inclusive). Si el usuario teclea un número fuera del rango
        válido, el programa solicitará nuevamente la introducción del valor cuantas
        veces sea necesario. */
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un múmero entre 0 y 10.");
	int numero = sc.nextInt();
	while ((numero > 10) || (0 > numero)){
            System.out.println("Introduce bien el número.");
            numero = sc.nextInt();
        }
	System.out.println("El número que pusiste es el "+ numero);
	
    }
    
}
