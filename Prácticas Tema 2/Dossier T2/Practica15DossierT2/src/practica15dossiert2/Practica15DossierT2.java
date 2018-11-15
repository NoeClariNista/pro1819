/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica15DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 15: Hacer un programa que lea una línea de texto entrada por teclado y la muestre
        en pantalla. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una línea de texto.");
        String texto = sc.nextLine();
        System.out.println("El texto que has introducido es: "+ texto);
        
    }
    
}
