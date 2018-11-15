/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica07Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 7. Diseña un algoritmo que, dado un número entero, determine si éste es
        el doble de un número impar. (Ejemplo: 14 es el doble de 7, que es
        impar.). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numeroCandidato = sc.nextInt();
        double numero = (numeroCandidato / (double)2);
        double resto = (numero % 2);
        if (resto == 0){
            System.out.println("El número viene de par.");
        }else{
            System.out.println("El número viene de impar.");
        }
        
    }
    
}
