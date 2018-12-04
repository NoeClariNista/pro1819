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
public class practica04 {
    
    /*Práctica 16 (DE OTRA MANERA): Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
    deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10
    números son mayores que la media calculada.*/
    
    public static int [] generarArray(int size, int limInf, int limSup){
        int[] array = new int [size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(limSup - limInf + 1) + limInf;
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static String mayorDelArray (int[] array, double valorASuperar) {
        String resultado = "";
        for (int i = 0; i < array.length; i++){
            if (valorASuperar < array[i]){
                resultado = ""+ array[i];
            }
        }
        return resultado;
    }
    
    public static double media(int[]array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma / (double)array.length;
    }
    
    public static void main(String[] args) {
        
        int inicio = 1, fin = 100, size = 10;
        int[] vector = generarArray(size, inicio, fin);
        mostrarArray(vector);
        double valorMedia = media(vector);
        System.out.println("La media es "+ valorMedia);
        System.out.println(mayorDelArray(vector, valorMedia));
        
    }
    
}
