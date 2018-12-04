/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica14 {
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
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
        for (int i = 0; i < array.length; i++) {
            auxiliar[array[i]]++; // auxiliar[array[i]] = auxiliar[array[i]] + 1;
        }
        int j = 0;
        for (int i = 0; i < auxiliar.length; i++){
            while (auxiliar[i] > 0){
                array[j] = i;
                j++;
                auxiliar[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        
        /* Práctica 14: Crear un programa que introduzca 10 números por teclado y mostrarlos
        ordenados de menor a mayor al finalizar. */
        
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el número: "+ (i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("El array es: ");
        mostrarArray(array);
        System.out.println("El array ordenador es: ");
        ordenarArray(array);
        mostrarArray(array);
        
    }
    
}
