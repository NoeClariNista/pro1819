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
public class practica06 {
    
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
    
    public static long combinacion(int numero1, int numero2) {
        long combinacion = factorial(numero1) / (factorial(numero1 - numero2) * factorial(numero2));
        return combinacion;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 6: Crear un método llamado combinacion() que se le pasen dos números y
        obtenga la combinación de esos dos números. Este método debe hacer uso del método
        factorial creado en la práctica anterior. La fórmula de la combinación es:
        combinacion(n,r) = factorial(n) / ( factorial(n-r) * factorial(r)). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro número.");
        int numero2 = sc.nextInt();
        if (numero1 < numero2){
            System.out.println("No puede hacerse las combinaciones.");
        }else{
            long resultado = combinacion(numero1, numero2);
            System.out.println("Las combinaciones de "+ numero1 +" y de "+ numero2 +" es "+ resultado);
        }
        
    }
    
}
