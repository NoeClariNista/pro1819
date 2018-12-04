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
public class practica05 {
    
    public static long factorial(int numero) {
        long factor = 1;
	if (numero == 0){
            factor = 1;
        }else{
            for (int i = numero; i >= 1; i--){
                factor *= i;
            }
        }
        return factor;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 5: Crear un método llamado factorial() que obtenga el factorial de un número.
        Hacer uso de él en un programa que el usuario introduzca por teclado un número y se le
        muestre el factorial de ese número. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para factorizar.");
        int numero = sc.nextInt();
        long resultado = factorial(numero);
        System.out.println("El factorial de "+ numero +" es "+ resultado);
        
    }
    
}
