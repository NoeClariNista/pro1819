/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica03Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 3. Diseñar un algoritmo que calcule el área de un triángulo en función de
        su base y su altura. */
        
        // area del triangulo = base del triangulo * altura del triangulo / 2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del triangulo.");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del triangulo.");
        int altura = sc.nextInt();
        int area = (base * altura) / 2;
        System.out.println("El area del triangulo es "+ area +"cm²");
        
    }
    
}
