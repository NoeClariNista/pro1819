/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica05Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 5. Diseña un algoritmo que pida el valor de los dos lados de un
        rectángulo y muestre el valor de su perímetro y el de su área. */
        
        // perimetro del rectangulo = (2 * base del rectangulo) + (2 * altura del rectangulo);
        // area del rectangulo = base del rectangulo * altura del rectangulo;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectangulo.");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del rectangulo.");
        int altura = sc.nextInt();
        int perimetro = (2 * base) + (2 * altura);
        int area = base * altura ;
        System.out.println("El perimetro del rectangulo es "+ perimetro +"cm y el area del rectangulo es "+ area +"cm²");
        
    }
    
}
