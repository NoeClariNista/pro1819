/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica15PropuestasII {

    static int mcd(int dividendo, int divisor){
        int resto = 1;
        while (resto != 0){
            int cociente = dividendo / divisor;
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }
        int mcd = dividendo;
        return mcd;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 15. Haz un algoritmo que calcule el máximo común divisor (mcd) de tres
        enteros positivos. El mcd de tres números es el número más grande que
        divide exactamente a los tres. */
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el número 1");
	int num1 = sc.nextInt();
	System.out.println("Introduce el número 2");
	int num2 = sc.nextInt();
	System.out.println("Introduce el número 3");
	int num3 = sc.nextInt();
	int mcdNum1Num2 = mcd(num1,num2);
	int mcdNum1Num2Num3 = mcd(mcdNum1Num2,num3);
	System.out.println("El mcd es "+ mcdNum1Num2Num3);
        
    }
    
}
