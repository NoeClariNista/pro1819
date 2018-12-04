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
public class practica30 {
    
    public static double sumaSeriePar(int num) {
        double resultado;
        if(num <= 0){ // La condición de parada para el caso de los números pares.
            resultado = 0;
        }else{
            if ((num % 2) != 0){
                resultado = sumaSerieImpar(num); // Llamada al algoritmo recursivo de los números impares.
            }else{
                resultado = sumaSerieImpar(num-1) - 1/(double)num; // Llamada al algoritmo recursivo.
            }
        }
        return resultado;
    }
    
    public static double sumaSerieImpar(int num) {
        double resultado;
        if ((num % 2) == 0){
            resultado = sumaSeriePar(num); // Llamada al algoritmo recursivo de los números pares.
        }else{
            if(num == 1){ // La condición de parada para el caso de los números impares.
                resultado = num;
            }else{
                resultado = (1/(double)num) + sumaSeriePar(num - 1); // Llamada al algoritmo recursivo.
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 30: Partamos de la siguiente serie:
        1 - 1/2 + 1/3 - 1/4 + 1/5 - ... - 1/2*n + 1/2*n+1 - ...
        Podemos diseñar un procedimiento recursivo para calcular la suma de los n primeros
        elementos de la serie, de modo que usemos una función diferente para los elementos pares e
        impares. */
        
        System.out.println("--------------------");
        double numero1 = sumaSerieImpar(26); // Un número par con el algoritmo recursivo de los números impares.
        System.out.println(numero1);
        System.out.println("--------------------");
        double numero2 = sumaSerieImpar(13); // Un número impar con el algoritmo recursivo de los números impares.
        System.out.println(numero2);
        System.out.println("--------------------");
        double numero3 = sumaSeriePar(12); // Un número par con el algoritmo recursivo de los números pares.
        System.out.println(numero3);
        System.out.println("--------------------");
        double numero4 = sumaSeriePar(15); // Un número impar con el algoritmo recursivo de los números pares.
        System.out.println(numero4);
        System.out.println("--------------------");
        
    }
    
}
