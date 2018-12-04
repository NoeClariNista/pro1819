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
public class practica27 {
    
    public static int potencia(int base, int exponente) {
        int resultado;
        if (exponente == 1){ // La condición de parada.
            resultado = base;
        }else{
            resultado = potencia(base, exponente/2); // Llamada al algoritmo recursivo.
            resultado *= resultado;
            if ((exponente % 2) != 0){
                resultado = resultado * base;
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 27: Calcular la potencia de forma recursiva: 2^7 → 128. */
        
        System.out.println("-----");
        int numero1 = potencia(2,7); // Un exponente impar con el algoritmo recursivo de la potencia.
        System.out.println(numero1);
        System.out.println("-----");
        int numero2 = potencia(2,8); // Un exponente par con el algoritmo recursivo de la potencia.
        System.out.println(numero2);
        System.out.println("-----");
        
    }
    
}
