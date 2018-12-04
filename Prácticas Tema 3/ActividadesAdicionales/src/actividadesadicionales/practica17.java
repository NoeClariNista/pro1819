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
public class practica17 {
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static int[] generarArray(int size, int limInf, int limSup) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(limSup - limInf + 1) + limInf;
        }
        return array;
    }
    
    public static void ordenarArray2(int[] array) {
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i-1]){
                for (int j = i; j > 0; j--) {
                    if ((array[j] < array[j-1])){
                        int temporal = array[j];
                        array[j] = array[j-1];
                        array[j-1] = temporal;
                        mostrarArray(array);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        // Ordenar array.
        
        int[] aleatorios = generarArray(5, 0, 50);
        mostrarArray(aleatorios);
        ordenarArray2(aleatorios);
        mostrarArray(aleatorios);
        
    }
}
    