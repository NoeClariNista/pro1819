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
public class practica02 {
    
    public static int mcd(int dividendo, int divisor) {
        while (divisor > 1){
            int resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }
        int mcd = dividendo;
        return mcd;
    }
    
    public static int mcm(int dividendo, int divisor) {
        int mcm = (dividendo * divisor) / mcd(dividendo, divisor);
        return mcm;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 2: Utilizando el método mcd() creado en la práctica anterior crear un programa
        que calcule el mcm. Recordar que: mcm(a,b) = a*b/mcd(a,b).*/
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Cálculo de MCD y MCM para dos números");
        System.out.print("Número 1: ");
        int num1 = cin.nextInt();
        System.out.print("Número 2: ");
        int num2 = cin.nextInt();
        String solucionmcd = "MCD: "+ mcd(num1, num2);
        System.out.println(solucionmcd);
        String solucionmcm = "MCM: "+ mcm(num1, num2);
        System.out.println(solucionmcm);
        
    }
    
}
