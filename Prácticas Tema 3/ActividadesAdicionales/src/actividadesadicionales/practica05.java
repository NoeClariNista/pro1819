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
public class practica05 {
    
    public static String obtenerDistanciaMenor(int[] array, String[] mensajes) {
        int distanciaMinima = Math.abs(array[1] - array[0]);
        int mejorNumeroParaPivote;
        String resultado = ""+ array[0] +" "+ array[1];
        for (int pivote = 0; pivote < array.length-1; pivote++){
            int distanciaMinimaParaPivoteActual;
            distanciaMinimaParaPivoteActual = Math.abs(array[pivote+1] - array[pivote]);
            mejorNumeroParaPivote = pivote+1;
            for (int j = pivote+1; j < array.length; j++){
                if( distanciaMinimaParaPivoteActual > Math.abs(array[j] - array[pivote])){
                    distanciaMinimaParaPivoteActual = Math.abs(array[j] - array[pivote]);
                    mejorNumeroParaPivote = j;
                }
            }
            mensajes[pivote] = "Para "+ array[pivote] +" el mejor número es "+ array[mejorNumeroParaPivote];
            if( distanciaMinima > distanciaMinimaParaPivoteActual){
                distanciaMinima = distanciaMinimaParaPivoteActual;
                resultado = ""+ array[pivote] +" "+ array[mejorNumeroParaPivote];
            }
        }
        return resultado;
    }
    
    public static int[] generarArray(int size, int limInf, int limSup) {
        int array[] = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rnd.nextInt(limSup - limInf + 1) + limInf;
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for(int i=0; i < array.length-1;i++){
            System.out.print(array[i] +", ");
        }
        System.out.println(array[array.length-1] +"]");
    }
    
    public static void main(String[] args) {
        
        /* Práctica 18 (DE OTRA MANERA): Crear un programa que introduzca 5 números y muestre cuáles son los dos
        números más cercanos. Por ej. Si:
        14,11,2,10,17 => 11,10. */
        
        int numeros[] = generarArray(10, 0, 100);
        mostrarArray(numeros);
        String mensajesObtenidos[] = new String[numeros.length];
        String resultado = obtenerDistanciaMenor(numeros, mensajesObtenidos);
        System.out.println("Los mejores números son: " + resultado);
        for (int i = 0; i < mensajesObtenidos.length-1; i++) {
            System.out.println(mensajesObtenidos[i]);
        }
        
    }
    
}
