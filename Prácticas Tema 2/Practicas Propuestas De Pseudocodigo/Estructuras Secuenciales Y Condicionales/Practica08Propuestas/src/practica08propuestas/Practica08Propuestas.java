/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica08Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 8. Diseña un algoritmo que, dados dos números enteros, muestre por
        pantalla uno de estos mensajes: "El segundo es el cuadrado exacto del
        primero.", "El segundo es menor que el cuadrado del primero." o "El segundo
        es mayor que el cuadrado del primero.", dependiendo de la verificación de
        la condición correspondiente al significado de cada mensaje. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro número entero.");
        int numero2 = sc.nextInt();
        if (numero2 == numero1 * numero1){
            System.out.println("El segundo es el cuadrado exacto del primero.");
        }else if (numero2 > numero1 * numero1){
            System.out.println("El segundo es mayor que el cuadrado del primero.");
        }else{
            System.out.println("El segundo es menor que el cuadrado del primero.");
        }
        
    }
    
}
