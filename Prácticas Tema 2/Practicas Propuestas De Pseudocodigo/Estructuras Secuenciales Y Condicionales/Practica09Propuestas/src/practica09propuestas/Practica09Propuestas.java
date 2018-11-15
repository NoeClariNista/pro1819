/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica09Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 9. Diseña un algoritmo que, dados cinco números enteros, determine cuál
        de los cuatro últimos números es más cercano al primero. (Por ejemplo, si
        el usuario introduce los números 2, 6, 4, 1 y 10, el programa responderá
        que el número más cercano al 2 es el 1.). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número entero "+ 1);
        int numero1 = sc.nextInt();
        System.out.println("Introduce el número entero "+ 2);
        int numero2 = sc.nextInt();
        int distancia2 = Math.abs(numero2 - numero1);
        int menorDistancia = distancia2;
        int numeroResultante = numero2;
        int i = 1;
        do{
            System.out.println("Introduce el número entero "+ (i+2));
            int numeroCandidato = sc.nextInt();
            int distanciaCandidata = Math.abs(numero1 - numeroCandidato);
            if (menorDistancia > distanciaCandidata){
                menorDistancia = distanciaCandidata;
                numeroResultante = numeroCandidato;
            }
            i++;
        }while(i < 4);
        System.out.println("El número más próximo es el "+ numeroResultante);
        
    }
    
}
