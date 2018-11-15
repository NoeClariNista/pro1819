/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica46dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica46DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 46: Convertir un número a binario. El usuario introduce un número entero
        decimal y el programa muestra en pantalla como es su forma en binario. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = sc.nextInt();
        int temporal = numero;
        String binario = "";
        while (temporal > 0){
            binario = ""+ (temporal%2) + binario;
            temporal /= 2;
        }
        System.out.println("El número "+ numero +" en binario es "+ binario);
        
    }
    
}
