/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica04PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 4. Queremos hacer un algoritmo que calcule el factorial de un número
        entero positivo. El factorial de n se denota con n!, pero no existe ningún
        operador que permita efectuar este cálculo directamente. Sabiendo que
        n! = 1 · 2 · 3 · . . . · (n − 1) · n y que 0! = 1, haz un algoritmo que pida
        el valor de n y muestre por pantalla el resultado de calcular n!. */
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el número que quieres factorizar.");
	int numero = sc.nextInt();
	int factor = 1;
	if (numero == 0){
            System.out.println("El factorial de "+ numero +" es 1.");
        }else{
            for (int i = numero;i >= 1;i--){
                factor *= i;
            }
            System.out.println("El factorial de "+ numero +" es "+ factor);
        }
	
    }
    
}
