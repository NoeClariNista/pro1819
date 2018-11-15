/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica44dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica44DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 44: Programa generador de potencias. El usuario introduce un número entero de 1
        a 20. Se le mostrará en pantalla las 5 primeras potencias de ese número.
        Ej. número introducido 2
        2^1 = 2
        2^2 = 4
        2^3 = 8
        2^4 = 16
        2^5 = 32. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero (entre 1 y 20).");
        int base = sc.nextInt();
        if ((base > 20) || (base < 1)){
            System.out.println("Número no válido.");
        }else{
            for (int i = 1;i <= 5;i++){
                System.out.println(base +"^"+ i +"="+ (int)Math.pow(base, i));
            }
        }
        
    }
    
}
