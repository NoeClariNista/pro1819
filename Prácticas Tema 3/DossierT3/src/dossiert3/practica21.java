/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica21 {
    
    public static void main(String[] args) throws Exception {
        
        /* Práctica 21: Crear un programa que reciba dos números del usuario. Si el primer número
        no es un entero entre 1 y 100 lanzará una excepción que mostrará en pantalla “El número
        debe ser un entero entre 1 y 100”. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número.");
        int numero1 = sc.nextInt();
        if (numero1 < 1 || numero1 > 100){
             throw new Exception ("El número debe estar entre 1 y 100.");
        }
        System.out.println("Introduce el segundo número.");
        int numero2 = sc.nextInt();
        
    }
    
}
