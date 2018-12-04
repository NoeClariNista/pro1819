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
public class practica25 {
    
    public static int sumarArray(int[] array, int posicion) {
        int resultado;
        if (array.length-1 <= posicion){ // La condición de parada.
            resultado = array[posicion];
        }else{
            resultado = array[posicion] + sumarArray(array, posicion+1); // Llamada al algoritmo recursivo.
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 25: Sumar todos los elementos de un array mediante recursión. */
        
        System.out.println("-----");
        int[] array1 = {1, 3, 5, 2, 8, 4};
        int suma1 = sumarArray(array1, 0); // El algoritmo recursivo para sumar los elementos de un array.
        System.out.println(suma1);
        System.out.println("-----");
        int[] array2 = {7, 2, 5, 4, 9, 8};
        int suma2 = sumarArray(array2, 0); // El algoritmo recursivo para sumar los elementos de un array.
        System.out.println(suma2);
        System.out.println("-----");
        
    }
    
}
