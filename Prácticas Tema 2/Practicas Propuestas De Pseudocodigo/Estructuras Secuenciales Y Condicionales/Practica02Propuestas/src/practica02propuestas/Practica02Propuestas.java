/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica02Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 2. Realizar un algoritmo que sirva para convertir pulgadas a centímetros.
        (Recuerda que 1 pulgada = 2.54 centímetros). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de pulgadas.");
        int cantidad = sc.nextInt();
        final double PULGADA = 2.54;
        double resultado = cantidad * PULGADA;
        System.out.println("El resultado es "+ resultado +"cm");
        
    }
    
}
