/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica06Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 6. Diseña un algoritmo que, dado un número entero, muestre por pantalla
        el mensaje "El número es par." cuando el número sea par y el mensaje "El
        número es impar." cuando sea impar. (Una pista: un número es par si el resto
        de dividirlo por 2 es 0, e impar en caso contrario.). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = sc.nextInt();
        int resto = (numero % 2);
        if (resto == 0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }
        
    }
    
}
