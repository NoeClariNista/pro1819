/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

import java.util.Random;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica16 {
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static int[] generarAleatorio(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(100) + 1;
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
    
    public static void mostrarMayoresDelArray(int array[], double media) {
        System.out.print("Los números mayores a "+ media +" son: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] > media){
                System.out.print(array[i] +", ");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        /* Práctica 16: Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
        deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10
        números son mayores que la media calculada. */
        
        int size = 10;
        int[] array = generarAleatorio(size);
        System.out.print("El array es: ");
        mostrarArray(array);
        double media = media(array);
        System.out.println("La media es: "+ media);
        mostrarMayoresDelArray(array, media);
        
    }
    
}
