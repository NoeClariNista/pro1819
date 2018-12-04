/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesadicionales;

import java.util.Random;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica03 {
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static void main(String[] args) {
         
        /* Práctica 9 (DE OTRA MANERA): Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
        que sean pares. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
        de esos 10 números y las respectivas posiciones que ocupan en el array. */
        
        Random rnd = new Random();
        int size = 10;
        int[] array = new int[size];
        int maximo = -1, minimo = 101, posMax = 0, posMin = 0;
        for (int i = 0; i < array.length;){
            int dato = rnd.nextInt(99) + 1;
            if ((dato % 2) == 0){
                array[i] = dato;
                i++;
            }
        }
        mostrarArray(array);
        for (int i = 0; i < array.length; i++){
            if (maximo < array[i]){
                maximo = array[i];
                posMax = i;
            }
            if (minimo > array[i]){
                minimo = array[i];
                posMin = i;
            }
        }
        System.out.println("El máximo es "+ maximo +" en la posición "+ posMax);
        System.out.println("El mínimo es "+ minimo +" en la posición "+ posMin);
        
    }
    
}
