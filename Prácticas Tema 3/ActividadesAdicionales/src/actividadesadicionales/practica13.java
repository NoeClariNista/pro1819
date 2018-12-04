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
public class practica13 {
    
    public static void main(String[] args) {
        
        // Saber si un número es capicua.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te digo si es capicua.");
        int numeroCapicua = sc.nextInt();
     // int numeroCapicua = 12344321;
        String capicua = ""+ numeroCapicua;
        String reverso = "";
        for (int i = 0; i < capicua.length(); i++) {
            char caracter = capicua.charAt(i);
            reverso = ""+ caracter + reverso;
        }
        if (capicua.equals(reverso)){
            System.out.println("capicua");
        }else{
            System.out.println("no es capicua");
        }
        
    }
    
}
