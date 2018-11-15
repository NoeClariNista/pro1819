/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica39dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica39DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 39: Hacer un programa que recibe un número entero mayor o igual a 10 y menor
        o igual a 99 ( si el usuario introduce un número no válido se le pedirá que repita hasta que
        lo haga bien ) , y se le muestre el número con las cifras invertidas. Por ej. si 34 se mostraría
        en pantalla 43. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero mayor o igual a 10 y menor o igual a 99.");
        int numero = sc.nextInt();
        while ((numero > 99) || (numero < 10)){
            System.out.println("Repite el número (mayor o igual a 10 y menor o igual a 99).");
            numero = sc.nextInt();
        }
        int decenas = numero / 10;
        int unidades = numero % 10;
        int resultado = (unidades * 10) + decenas;
        System.out.println("El número con las cifras invertidas es "+ resultado);
        
    }
    
}
