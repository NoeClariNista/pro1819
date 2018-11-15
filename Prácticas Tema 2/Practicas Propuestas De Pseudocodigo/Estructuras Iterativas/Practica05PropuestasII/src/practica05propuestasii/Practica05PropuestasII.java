/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica05PropuestasII {

    static double factorial(int numero){
        double factor = 1;
	if (numero == 0){
            factor = 1;
        }else{
            for (int i = numero;i >= 1;i--){
                factor *= i;
            }
        }
        return factor;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 5. El número de combinaciones que podemos formar tomando m elementos de
        un conjunto con n elementos es: C(m,n) = n! / (n − m)!m! . Diseña un algoritmo
        que pida el valor de n y m y calcule Cm n . (Ten en cuenta que n ha de
        ser mayor o igual que m.) (Puedes comprobar la validez de tu programa
        introduciendo los valores n = 15 y m = 10: el resultado es 3003.). */
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el valor m.");
        int m = sc.nextInt();
        System.out.println("Introduce el valor n.");
        int n = sc.nextInt();
        double combinacion = 1;
	if (m > n){
            System.out.println("No puede hacerse las combinaciones.");
        }else{
            combinacion = (factorial(n) / (factorial(n-m) * factorial(m)));
            System.out.println("Las combinaciones de "+ m +" Y "+ n +" son "+ combinacion);
        }
	
    }
    
}
