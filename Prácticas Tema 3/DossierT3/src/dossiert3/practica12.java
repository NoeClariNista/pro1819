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
public class practica12 {
    
    public static int[] generarAleatorio(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
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
    
    public static int posicionMaximoDelArray(int[] array) {
        int posMax = 0;
        if (array != null){
            for (int i = 1; i < array.length; i++){
                if (array[posMax] < array[i]){
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
            arrayMenores[i] = array[i];
        }
        for (int j = arrayMenores.length; j < array.length; j++){
            int posMayorArrayMenores = posicionMaximoDelArray(arrayMenores);
            if (array[j] < arrayMenores[posMayorArrayMenores]){
                arrayMenores[posMayorArrayMenores] = array[j];
            }
        }
        return arrayMenores;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 12: Crear un programa que genere 20 números aleatorios enteros entre 1 y 100.
        Este array una vez se hay rellenado no se puede modificar. Crear un segundo array donde se
        almacenará una copia de los 5 números más pequeños del primer array. Mostrar en pantalla
        el contenido del array de 20 números y mostrar cuáles son los 5 números más pequeños. */
        
        int size = 20;
        int[] array = generarAleatorio(size);
        System.out.print("El array es: ");
        mostrarArray(array);
        int sizeMenores = 5;
        int[] arrayMenores = obtenerMenores(sizeMenores, array);
        System.out.print("Los menores son: ");
        mostrarArray(arrayMenores);
        
    }
    
}
