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
public class practica18 {
    
    public static int[] generarArray(int size, int limInf, int limSup) {
        int[] array = new int [size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(limSup - limInf + 1) + limInf;
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
    
    public static int[] obtenerDiastancias(int[] array, int posicion) {
        int[] distancias = new int[array.length];
        for (int i = 0; i < distancias.length; i++){
            int pivote = array[posicion];
            distancias[i] = Math.abs(array[i] - pivote);
            distancias[posicion] = -1;
        }
        return distancias;
    }
    
    public static int menorDistancia(int[] array) {
        int posMenor = 0;
        if (array[posMenor] == -1){
            posMenor = 1;
        }
        for (int i = 0; i < array.length; i++){
            if ((array[i] < array[posMenor]) && (array[i] >= 0)){
                posMenor = i;
            }
        }
        return posMenor;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 18: Crear un programa que introduzca 5 números y muestre cuáles son los dos
        números más cercanos. Por ej. Si:
        14,11,2,10,17 => 11,10. */
        
        int[] array = generarArray(5, 0, 100);
        int posNum1 = 0, posNum2 = 0;
        System.out.println("---------------------------------------------");
        System.out.print("El array es: ");
        mostrarArray(array);
        for (int i = 0; i < array.length; i++){
            int[] distancias = obtenerDiastancias(array, i);
            int posicionMenor = menorDistancia(distancias);
            int ditanciaActual = distancias[posicionMenor];
            posNum1 = i;
            posNum2 = posicionMenor;
            System.out.println("---------------------------------------------");
            System.out.println("Numeros más cercanos para esta interacion");
            System.out.println(array[i] +" y "+ array[posicionMenor]);
            System.out.println("Tienen una distancia de "+ ditanciaActual);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Resultado final");
        System.out.println("Los menores son: "+ array[posNum1] +" y "+ array[posNum2]);
        System.out.println("---------------------------------------------");
        
    }
    
}
