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
public class practica03 {
    
    public static int aleatorio(int numero1, int numero2) {
        Random rnd = new Random();
        int resultado = (rnd.nextInt(numero2 - numero1) + 1) + numero1;
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 3: Crear un programa con un método llamado aleatorio() que reciba dos números
        enteros positivos y devuelva un número aleatorio que esté entre esos dos números. El
        main() del programa:
        public static void main(String[] args) {
        int num;
        do{
        num = aleatorio(25,45);
        System.out.println(num);
        }while( num != 35 );
        } */
        
        int num;
        do{
            num = aleatorio(25, 45);
            System.out.println(num);
        }while (num != 35);
        
    }
    
}
