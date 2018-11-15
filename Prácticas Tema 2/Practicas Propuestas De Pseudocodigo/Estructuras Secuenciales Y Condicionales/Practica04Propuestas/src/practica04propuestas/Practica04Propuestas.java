/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica04Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 4. Diseña un algoritmo que pida el valor del lado de un cuadrado y
        muestre el valor de su perímetro y el de su área. */
        
        // perimetro del cuadrado = lado del cuadrado * 4;
        // area del cuadrado = lado del cuadrado * lado del cuadrado;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado.");
        int lado = sc.nextInt();
        int perimetro = lado * 4;
        int area = (lado * lado);
        System.out.println("El perimetro del cuadrado es "+ perimetro +"cm y el area del cuadrado es "+ area +"cm²");
        
    }
    
}
