/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica22DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 22: Hacer un programa que haga uso de estructuras if else if para que dado un
        número entero x muestre en pantalla:
        - x es menor de 0
        - x es igual a 0
        - x es mayor que 0 y menor que 10
        - x es igual a 10
        - x es mayor que 10 y menor que 20
        - x es mayor o igual a 20. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = sc.nextInt();
        if (numero < 0){
            System.out.println(numero +" es menor de 0.");
        }else if(numero == 0){
            System.out.println(numero +" es igual a 0.");
        }else if((numero > 0) && (numero < 10)){
            System.out.println(numero +" es mayor que 0 y menor que 10.");
        }else if(numero == 10){
            System.out.println(numero +" es igual a 10.");
        }else if((numero > 10) && (numero < 20)){
            System.out.println(numero +" es mayor que 10 y menor que 20.");
        }else{
            System.out.println(numero +" es mayor o igual a 20.");
        }
        
    }
    
}
