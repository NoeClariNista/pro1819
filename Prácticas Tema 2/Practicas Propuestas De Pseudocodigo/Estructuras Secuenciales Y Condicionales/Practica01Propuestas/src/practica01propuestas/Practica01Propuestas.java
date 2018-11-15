/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica01Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 1. Diseña un algoritmo que calcule el IVA (16%) de un producto dado su
        precio de venta sin IVA. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto.");
        int precio = sc.nextInt();
        final double IVA = 0.16;
        double resultado = precio * IVA;
        System.out.println("El iva es "+ resultado);
        System.out.println("El nuevo precio es "+ (precio+resultado));
        
    }
    
}
