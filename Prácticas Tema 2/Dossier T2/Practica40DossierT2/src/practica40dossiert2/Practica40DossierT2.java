/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica40dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica40DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 40: Escribir un programa que reciba un número entero mayor o igual a 0 y menor
        o igual a 999 y muestre cuántas cifras tiene. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 999.");
        int numero = sc.nextInt();
        if ((numero > 999) || (numero < 0)){
            System.out.println("Número no válido.");
        }else if (numero >= 100){
            System.out.println("Tiene 3 cifras.");
        }else if (numero >= 10){
            System.out.println("Tiene 2 cifras.");
        }else{
            System.out.println("Tiene 1 cifra.");
        }
        
    }
    
}
