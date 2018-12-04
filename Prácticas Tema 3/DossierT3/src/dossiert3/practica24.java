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
public class practica24 {
    
    public static int sumarCifras(int numero, int contador) {
        int resultado;
        if (numero < 10){ // La condición de parada.
            resultado = numero;
        }else{
            int resto = numero % 10;
            int cociente = numero / 10;
            resultado = resto + sumarCifras(cociente, contador+1); // Llamada al algoritmo recursivo.
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 24: Sumar las cifras de un número mediante recursión: 135 → 1+3+5 → 9. */
        
        System.out.println("-----");
        int numero1 = sumarCifras(135, 0); // El algoritmo recursivo para sumar las cifras de un número.
        System.out.println(numero1);
        System.out.println("-----");
        int numero2 = sumarCifras(62, 0); // El algoritmo recursivo para sumar las cifras de un número.
        System.out.println(numero2);
        System.out.println("-----");
        
    }
    
}
