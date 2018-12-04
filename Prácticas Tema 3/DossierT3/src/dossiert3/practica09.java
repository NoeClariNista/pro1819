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
public class practica09 {
    
    public static int[] generarAleatorio(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            int dato = (rnd.nextInt(49) + 1) * 2;
            array[i] = dato;
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static void main(String[] args) {
        
        /* Práctica 9: Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
        que sean pares. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
        de esos 10 números y las respectivas posiciones que ocupan en el array. */
        
        int size = 10;
        int[] array = generarAleatorio(size);
        mostrarArray(array);
        int posMax = 0, posMin = 0;
        for (int i = 1; i < array.length; i++){
            if (array[posMax] < array[i]){
                posMax = i;
            }
            if (array[posMin] > array[i]){
                posMin = i;
            }
        }
        System.out.println("El máximo es "+ array[posMax] +" en la posición "+ posMax);
        System.out.println("El mínimo es "+ array[posMin] +" en la posición "+ posMin);
        
    }
    
}
