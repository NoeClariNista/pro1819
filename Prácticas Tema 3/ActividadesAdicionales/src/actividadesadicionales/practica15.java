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
public class practica15 {
    
     public static void ordenarArray(int[] array) {
        int posMin;
        for (int i = 0; i < array.length-1; i++){
            posMin = i;
            for (int j = i+1; j < array.length; j++){
                if (array[posMin] > array[j]){
                    posMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[posMin];
            array[posMin] = temp;
        }
    }
    
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
            array[i] = rnd.nextInt(limSup - limInf + 1)+ limInf;
        }
        return array;
    }
    
    public static void main(String[] args) {
        
        // Ordenar array.
        
        int[] aleatorios = generarArray(20, 0, 50);
        mostrarArray(aleatorios);
        ordenarArray(aleatorios);
        mostrarArray(aleatorios);
        
    }
    
}
