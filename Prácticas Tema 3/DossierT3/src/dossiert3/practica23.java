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
public class practica23 {
    
    public static int cantidadCifras(int numero) {
        int i = 0;
        do{
            i++;
            numero /= 10;
        }while (numero > 0);
        return i;
    }
    
    public static int invertirNumero(int numero) {
        int cociente = numero / 10;
        int resto = numero % 10;
        int resultado;
        if (numero < 10){ // La condición de parada.
            resultado = numero;
        }else{
            int concatenacion = resto * (int)Math.pow(10, cantidadCifras(cociente));
            resultado = invertirNumero(cociente) + concatenacion; // Llamada al algoritmo recursivo.
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 23: Invertir las cifras de un número mediante recursión: 123347 → 743321. */
        
        System.out.println("----------------------------------------");
        int numero1 = 123447;
        int numeroInvertido1 = invertirNumero(numero1); // El algoritmo recursivo para invertir las cifras de un número.
        System.out.println("El numero "+ numero1 +" invertido es "+ numeroInvertido1);
        System.out.println("----------------------------------------");
        int numero2 = 5862;
        int numeroInvertido2 = invertirNumero(numero2); // El algoritmo recursivo para invertir las cifras de un número.
        System.out.println("El numero "+ numero2 +" invertido es "+ numeroInvertido2);
        System.out.println("----------------------------------------");
        
    }
    
}
