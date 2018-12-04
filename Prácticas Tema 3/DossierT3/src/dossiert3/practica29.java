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
public class practica29 {
    
    public static int minimo(int[] array, int inicial) {
        int resultado;
        int restoDelSubarray;
        if (inicial < array.length - 1){
            restoDelSubarray = minimo(array, inicial + 1); // Llamada al algoritmo recursivo.
            if (array[inicial] < restoDelSubarray){
                resultado = array[inicial];
            }else{
                resultado = restoDelSubarray;
            }
        }else{ // La condición de parada. // Inicial es array.lenght - 1.
            resultado = array[inicial];
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 29: sin usar bucles for, while, do while obtener el número menor de un array. */
        
        System.out.println("-----");
        int[] array1 = {2, 8, 4, 9, 11, 1, 7, 5};
        int numero1 = minimo(array1, 0); // Un array de dimensión 8 con el algoritmo recursivo de calcular el mínimo valor del array.
        System.out.println(numero1);
        System.out.println("-----");
        int[] array2 = {8, 9, 11, 7, 5};
        int numero2 = minimo(array2, 0); // Un array de dimensión 5 con el algoritmo recursivo de calcular el mínimo valor del array.
        System.out.println(numero2);
        System.out.println("-----");
        
    }
    
}
