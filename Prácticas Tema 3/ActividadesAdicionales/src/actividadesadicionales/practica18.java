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
public class practica18 {
    
    public static double sumaSerie(int num) {
        double resultado;
        if(num == 1){
            resultado = num;
         // System.out.println(1 +" / "+ num +" = "+ (1/(double)num));
         // System.out.println("iteracion "+ (num) +" : "+ resultado);
        }else{
            int producto = 1;
            if ((num % 2) == 0){
                producto = (-1);
            }
         // System.out.println(producto +" / "+ num +" = "+ (producto * (1/(double)num)));
            resultado = (producto * (1/(double)num)) + sumaSerie(num - 1);
         // System.out.println("iteracion "+ num +" : "+ resultado);
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 30 (DE OTRA MANERA): Partamos de la siguiente serie:
        1 - 1/2 + 1/3 - 1/4 + 1/5 - ... - 1/2*n + 1/2*n+1 - ...
        Podemos diseñar un procedimiento recursivo para calcular la suma de los n primeros
        elementos de la serie, de modo que usemos una función diferente para los elementos pares e
        impares. */
        
        double numero = sumaSerie(26);
        System.out.println(numero);
        double numero2 = sumaSerie(13);
        System.out.println(numero2);
        
    }
    
}
