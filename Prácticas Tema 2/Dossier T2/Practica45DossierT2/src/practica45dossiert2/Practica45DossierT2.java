/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica45DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 45: Crear un programa que reciba un número entero y que muestre su
        descomposición en números primos:
        300 = 2*2*3*5*5. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero.");
        int numero = sc.nextInt();
        String asterisco = "";
        System.out.print(numero +"=");
        for (int i = 2;i <= numero;i++){
            int contador = 0;
            while ((numero % i) == 0){
                contador++;
                numero /= i;
            }
            if (contador > 1){
                System.out.print(asterisco +"("+ i +"^"+ contador +")");
                asterisco = "*";
            }else if (contador == 1){
                System.out.print(asterisco + i);
                asterisco = "*";
            }
        }
        System.out.println("");
    }
    
}
