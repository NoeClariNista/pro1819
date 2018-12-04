/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica04 {
    
    public static boolean numeroValido(int numero) {
        boolean resultado;
        if ((numero > 20) && (numero < 50)){
            if ((numero % 3) == 0){
                resultado = true;
            }else{
                resultado = false;
            }
        }else{
            resultado = false;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 4  Crear un método llamado numeroValido(). El usuario debe introducir un
        número entre 20 y 50 y ser múltiplo de 3.  El main() del programa:
        public static void main(String[] args) {
        int num;
        Scanner cin = new Scanner(System.in);
        do{
        System.out.println(“Introducir un número: “);
        num = cin.nextInt();
        }while( !numeroValido(num) );
        System.out.println(“El número cumple los requisitos. Se puede continuar”);
        } */
        
        int num;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("Introducir un número: ");
            num = cin.nextInt();
        }while (!numeroValido(num));
        System.out.println("El número cumple los requisitos. Se puede continuar");
        
    }
    
}
