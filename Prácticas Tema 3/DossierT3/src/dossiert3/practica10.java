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
public class practica10 {
    
    public static int[] tomaDeDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Introduce el número "+ (i+1));
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i=0; i < array.length-1;i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static double media(int[] array) {
        int acumulador = 0;
        for (int i = 0; i < array.length; i++){
            acumulador += array[i];
        }
        return acumulador / (double)array.length;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 10: Hacer un programa que primero solicita la cantidad de números que se van a
        inroducir. Después de haberlos introducido muestra la media y los números que se han
        introducido. */
        
        int[] array = tomaDeDatos();
        System.out.print("El array es: ");
        mostrarArray(array);
        System.out.println("La media es: "+ media(array));
        
    }
    
}
