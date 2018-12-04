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
public class practica01 {
    
    public static int mcd(int dividendo, int divisor) {
        while (divisor > 1){
            int resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }
        int mcd = dividendo;
        return mcd;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 1: Crear un programa para calcular el máximo común divisor ( mcd ) de dos
        números enteros recibidos por teclado. Se deberá crear un método llamado mcd que recibe
        los dos números y devuelve el máximo común divisor. El método main del programa es:
        public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Cálculo de MCD para dos números");
        System.out.print("Número 1: ");
        int num1 = cin.nextInt();
        System.out.print("Número 2: ");
        int num2 = cin.nextInt();
        String solucion = "MCD: " + mcd(num1,num2);
        System.out.println(solucion);
        }*/
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Cálculo de MCD para dos números");
        System.out.print("Número 1: ");
        int num1 = cin.nextInt();
        System.out.print("Número 2: ");
        int num2 = cin.nextInt();
        String solucion = "MCD: "+ mcd(num1, num2);
        System.out.println(solucion);
        
    }
    
}
