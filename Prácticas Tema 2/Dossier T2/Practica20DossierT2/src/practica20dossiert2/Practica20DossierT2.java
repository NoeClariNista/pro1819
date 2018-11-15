/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica20dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica20DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 20: Hacer un programa que se le pase un número entero y que devuelva los
        siguientes mensajes:
        - Si es impar: “El número: x es impar”
        - Si es par: “El número x es par”
        Donde x es el número introducido por el usuario. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = sc.nextInt();
        if ((numero % 2) == 0){
            System.out.println("El número "+ numero +" es par.");
        }else{
            System.out.println("El número "+ numero +" es impar.");
        }
        
    }
    
}
