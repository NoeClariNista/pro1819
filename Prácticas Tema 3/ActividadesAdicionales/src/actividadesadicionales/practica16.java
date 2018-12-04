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
public class practica16 {
    
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
    
    public static int buscarMaximo(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }            
        }
        return max;
    }
    
    public static void ordenarArray(int[] array) {
        int maximo = buscarMaximo(array);
        int[] auxiliar = new int[maximo+1]; 
        for (int i = 0; i < array.length; i++){
            auxiliar[array[i]]++;
        }
        System.out.println("el auxiliar");
        mostrarArray(auxiliar);
        int j = 0;
        for (int i = 0; i < auxiliar.length; i++){
            while(auxiliar[i] > 0){ 
                array[j] = i;
                j++;
                auxiliar[i]--;
            }            
        }
    }
    
    public static void main(String[] args) {
        
        // Ordenar array.
        
        int[] aleatorios = generarArray(20, 0, 50);
        mostrarArray(aleatorios);
        ordenarArray(aleatorios);
        mostrarArray(aleatorios);
        
    }
    
}
