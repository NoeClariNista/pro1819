/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica16PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 16.	Haz un algoritmo que vaya leyendo números y mostrándolos por
        pantalla hasta que el usuario introduzca un número negativo. En ese momento,
        el algoritmo mostrará un mensaje de despedida y finalizará su ejecución. */
        
	Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número.");
	int numero = sc.nextInt();
        while (0 <= numero){
            System.out.println("El número que pusite es "+ numero);
            System.out.println("Introduce un número.");
            numero = sc.nextInt();
        }
	System.out.println("Adios");
        
    }
    
}
