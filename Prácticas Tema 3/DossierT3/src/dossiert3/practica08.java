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
public class practica08 {
    
    public static void mostrarArrayConIndice(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("array["+ i +"] = "+ array[i]);
        }
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i=0; i < array.length-1; i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static void main(String[] args) {
        
        /* Práctica 8: Crear un programa que, mediante un bucle, guarde 10 números en un array
        introducidos por el usuario. Luego, también con un bucle, muestre cada uno de esos
        números y el índice que le corresponde en el array. */
        
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];
        System.out.println("Introduce 10 números.");
        for (int i=0; i < array.length; i++){
            System.out.println("Introduce el número "+ (i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("El array de índices es: ");
        mostrarArrayConIndice(array);
        System.out.print("El array es: ");
        mostrarArray(array);
        
    }
    
}
