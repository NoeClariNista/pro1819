/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica26dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica26DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 26: Escribe un programa que pida por teclado un día de la semana ( ún número
        entero del 1 al 5 que representa de lunes a viernes ) y que diga qué asignatura toca a primera
        hora ese día. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana.");
        int numero = sc.nextInt();
        switch(numero){
            case 1:
            case 3:  System.out.println("LND.");
                     break;
            case 2:
            case 5:  System.out.println("PRO.");
                     break;
            case 4:  System.out.println("LNT.");
                     break;
            default: System.out.println("Número incorrecto.");
        }
        
    }
    
}
