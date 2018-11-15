/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica23dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica23DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 23: Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
        introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
         Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
        se mostrará el mensaje: “no hay solución real”
        Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor de a.");
        int a = sc.nextInt();
        System.out.println("Dime el valor de b.");
        int b = sc.nextInt();
        System.out.println("Dime el valor de c.");
        int c = sc.nextInt();
        int rcInterna = (b*b - 4*a*c);
        if (a == 0){
            double resultado = -c / (double)b;
            System.out.println("El resultado es: "+ resultado);
        }else if(rcInterna < 0){
            System.out.println("Raíz negativa.");
        }else if(rcInterna == 0) {
            double x = (-b) / (2*a);
            System.out.println("El resultado es: "+ x);
        }else{
            double x1 = (-b + Math.sqrt(rcInterna)) / (2*a);
            double x2 = (-b - Math.sqrt(rcInterna)) / (2*a);
            System.out.println("Los resultados son: \nResultado 1: "+ x1 +" y Resultado 2: "+ x2);
        }
        
    }
    
}
