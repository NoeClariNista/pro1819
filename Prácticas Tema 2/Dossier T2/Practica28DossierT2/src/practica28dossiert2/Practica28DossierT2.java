/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica28DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 28 Hacer un programa que el usuario vaya introduciendo números enteros. El
        programa finaliza cuando el usuario introduce el número 0. En ese momento se le muestra
        la suma total de los números positivos y la suma total de los números negativos. */
        
        Scanner sc = new Scanner(System.in);
        int numeroPositivo = 0, numeroNegativo = 0;
        int numero = 1;
        while (numero != 0){
            System.out.println("Introduzca un número entero.");
            numero = sc.nextInt();
            if (numero > 0){
                numeroPositivo += numero;
            }else{
                numeroNegativo += numero;
            }
        }
        System.out.println("Suma total de números positivos: "+ numeroPositivo);
        System.out.println("Suma total de números positivos: "+ numeroNegativo);
        
    }
    
}
