/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesadicionales;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica07 {
    
    public static int potencia(int base, int exponente) {
        int resultado;
        if (exponente == 0){
            resultado = 1;
        }else{
            resultado = potencia(base, exponente/2);
            resultado *= resultado;
            if ((exponente % 2) != 0){
                resultado = resultado * base;
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 27 (DE OTRA MANERA): Calcular la potencia de forma recursiva: 2^7 → 128. */
        
        int numero1 = potencia(2,7);
        System.out.println(numero1);
        int numero2 = potencia(2,8);
        System.out.println(numero2);
        
    }
    
}