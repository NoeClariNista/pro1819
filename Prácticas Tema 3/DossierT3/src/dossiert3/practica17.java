/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica17 {
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static void ordenar(int[] array) {
        boolean repetidos = true;
        for (int i = 0; i < array.length && repetidos == true; i++){
            repetidos = false;
            for (int j = 0; j < array.length-1; j++){
                if (array[j] > array[j+1]){
                    int temporal = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporal;
                 // mostrarArray(array);
                    repetidos = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        /* Práctica 17: Crear un programa que reproduzca el algoritmo anterior. */
        
        /* Observar el siguiente array:
        [ 5 , 2 , 12 , 14 , 8 , 9 , 11 ]
        0 , 1 , 2 , 3 , 4 , 5 , 6 ← Posiciones
        Imaginemos un bucle que vaya comparando la posición i con la i+1 y si el número de la posición i
        es mayor que el de la posición i+1 los intercambia
        Ej. Veamos todos los pasos del bucle con el array anterior:
        i=0. En i y i+1 tenemos 5 y 2 En este caso 5 > 2 entonces intercambia los dos números
        [ 5, 2, 12, 14, 8, 9, 11 ] //array antes de comparar posición 0 con 1
        [ 2, 5, 12, 8, 14, 9, 11 ] //array después de comparar posición 0 con 1
        i=1. En i y i+1 tenemos 5 y 12 En este caso 5 ≤ 12 entonces no hace nada
        [ 2, 5, 12, 8, 14, 9, 11 ] //array antes de comparar posición 1 con 2
        [ 2, 5, 12, 8, 14, 9, 11 ] //array después de comparar posición 1 con 2
        i=2 En i y i+1 tenemos 12 y 8 En este caso 12 > 8 entonces intercambia los números
        [ 2, 5, 12, 8, 14, 9, 11 ] // array antes
        [ 2, 5, 8, 12, 14, 9, 11 ] // array después
        i=3 En i y i+1 tenemos 12 y 14 En este caso 12 ≤ 14 entonces no hace nada
        [ 2, 5, 8, 12, 14, 9, 11 ] // array antes
        [ 2, 5, 8, 12, 14, 9, 11 ] // array después
        i=4 En i y i+1 tenemos 14 y 9 En este caso 14 > 9 entonces intercambia los números
        [ 2, 5, 8, 12, 14, 9, 11 ] // array antes
        [ 2, 5, 8, 12, 9,14, 11 ] // array después
        i=5 En i y i+1 tenemos 14 y 11 En este caso 14 > 11 entonces intercambia los números
        [ 2, 5, 8, 12, 9,14, 11 ] // array antes
        [ 2, 5, 8, 12, 9,11, 14 ] // array después
        i=6 En este momento el bucle terminaría porque ya no es posible comparar con i+1
        Lo que haremos es volver a repetir todo el bucle una y otra vez hasta que se detecte que no
        se ha cambiado ningún elemento del array. Caso en el cuál ya estará ordenado
        Veamos como quedaría el array después de la segunda ejecución completa del bucle:
        [ 2, 5, 8, 9, 11,12, 14 ]
        El array ya está ordenado y cuando realice una tercera ejecución completa del bucle se dará cuenta
        y termina. */
        
        System.out.print("El array es: ");
        int[] array = {5, 2, 12, 14, 8, 9, 11};
        mostrarArray(array);
        ordenar(array);
        System.out.print("El array ordenado es: ");
        mostrarArray(array);
        
    }
    
}
