/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesadicionales;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica10 {
    
    public static int proximoEntero() {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int cifra;
        int numeroFinal = 0;
        for (int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
            cifra = caracter - '0';
            numeroFinal *= 10;
            numeroFinal += cifra;
        }
        return numeroFinal;
    }
    
    public static void main(String[] args) {
        
        // Convertir texto a número.
        
        System.out.println("Dame un número.");
        int numero = proximoEntero();
        System.out.println(numero);
        
    }
 
}
