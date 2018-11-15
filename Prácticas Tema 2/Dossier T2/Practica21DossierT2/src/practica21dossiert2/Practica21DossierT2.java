/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica21DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 21: Hacer un programa que se le pase un número entero y determine si es
        múltiplo de 3 y de 5. Un módelo de mensajes a mostrar sería:
        - x es multiplo de 3 pero no es múltiplo de 5
        - x no es múltiplo de 3 pero sí es múltiplo de 5
        - x no es múltiplo de 3 ni de 5
        - x es múltiplo de 3 y de 5. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = sc.nextInt();
        if ((numero % 3) == 0){
            if ((numero % 5) == 0){
                System.out.println(numero +" es múltiplo de 3 y de 5.");
            }else{
                System.out.println(numero +" es multiplo de 3 pero no es múltiplo de 5.");
            }
        }else{
            if ((numero % 5) == 0){
                System.out.println(numero +" no es múltiplo de 3 pero sí es múltiplo de 5.");
            }else{
                System.out.println(numero +" no es múltiplo de 3 ni de 5.");
            }
        }
        
    }
    
}
