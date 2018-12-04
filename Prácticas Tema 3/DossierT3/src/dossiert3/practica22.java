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
public class practica22 {
    
    public static int multiplicar(int n, int a){
        int resultado;
        if (n == 0){
            resultado = n;
        }
        if (n == 1){ // La condición de parada.
            resultado = a;
        }else{
            resultado = multiplicar(n-1, a) + a; // Llamada al algoritmo recursivo.
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 22: Imaginemos que java no supiera realizar una multiplicación de dos números
        enteros positivos. En ese caso aún podríamos realizar una multiplicación usando
        recursividad aprovechando la siguiente propiedad de la multiplicación:
        n*a = (n-1)*a + a
        Así pues podríamos crear un método que se llame multiplicar() donde:
        n*a = multiplicar(n,a) = multiplicar( n-1, a) + a
        la condición base es que 1*a = a
        Hacer un programa que resuelva las multiplicaciones utilizando recursión. */
        
        System.out.println("-----");
        int numero1 = multiplicar(10, 2); // El algoritmo recursivo para calcular la multiplicación.
        System.out.println(numero1);
        System.out.println("-----");
        int numero2 = multiplicar(20, 5); // El algoritmo recursivo para calcular la multiplicación.
        System.out.println(numero2);
        System.out.println("-----");
        
    }
    
}
