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
public class practica11 {
    
    public static int[] tomaDeDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números: ");
        int cantidad = sc.nextInt();
        int[] array = new int[cantidad];
        for (int i = 0; i < array.length; i++){
            System.out.println("Introduce el número "+ (i+1));
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    public static double media(int[] array) {
        int acumulador = 0;
        for (int i = 0; i < array.length; i++){
            acumulador += array[i];
        }
        return acumulador / (double)array.length;
    }
    
    public static double varianza(int[] array) {
        int acumulador = 0;
        double media = media(array);
        for (int i = 0; i < array.length; i++){
            acumulador += Math.pow((array[i] - media), 2);
        }
        return acumulador / (double)array.length;
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static void main(String[] args) {
        
        /* Práctica 11: Modificar el programa anterior para que calcule también la varianza. */
        
        int[] array = tomaDeDatos();
        System.out.print("El array es: ");
        mostrarArray(array);
        System.out.println("La media es: "+ media(array));
        System.out.println("La varianza es: "+ varianza(array));
        
    }
    
}
