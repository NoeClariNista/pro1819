/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica32dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica32DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 32: Hacer un programa que reciba dos números enteros positivos del usuario y
        muestre la suma de todos los números que hay entre esos dos números.
        Ej. Usuario introduce: 10, 5 entonces la secuencia de números es:
        5,6,7,8,9,10
        y la suma de esos números es:
        45
        Hacer uso de un bucle for para este programa. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro número entero.");
        int numero2 = sc.nextInt();
        int suma = 0;
        for (int i = numero1;i <= numero2;i++){
            suma += i;
        }
        System.out.println("La suma de los números entre "+ numero1 +" y "+ numero2 +" es: "+ suma);
    }
    
}
