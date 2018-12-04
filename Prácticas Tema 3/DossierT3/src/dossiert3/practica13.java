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
public class practica13 {
    
    public static int[] generarAleatorio(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100) + 1;
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static int posicionMaximoDelArray(int[] arrayMenores, int[] array){
        int posMax = 0;
        if (array != null){
            for (int i = 0; i < arrayMenores.length; i++){
                if (array[arrayMenores[posMax]] < array[arrayMenores[i]]){
                    posMax = i;
                }
            }
        }else{
            posMax = -1;
        }
        return posMax;
    }
    
    public static int[] obtenerMenores(int size, int[] array) {
        int[] arrayMenores = new int[size];
        for (int i = 0; i < arrayMenores.length; i++){
            arrayMenores[i] = i;
        }
        for (int j = arrayMenores.length; j < array.length; j++){
            int posMayorArrayMenores = posicionMaximoDelArray(arrayMenores, array);
            if (array[j] < array[arrayMenores[posMayorArrayMenores]]){
                arrayMenores[posMayorArrayMenores] = j;
            }
        }
        return arrayMenores;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 13: Crear una variante del programa anterior que en lugar de guardar una copia de
        los números más pequeños guarde la posición en la que están esos números. */
        
        int size = 20;
        int[] array = generarAleatorio(size);
        System.out.print("El array es: ");
        mostrarArray(array);
        int sizeMenores = 5;
        int[] arrayMenores = obtenerMenores(sizeMenores, array);
        System.out.print("Las posiciones de los menores son: ");
        mostrarArray(arrayMenores);
        
    }
    
}
