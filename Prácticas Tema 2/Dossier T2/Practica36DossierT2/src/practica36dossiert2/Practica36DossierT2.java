/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica36dossiert2;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica36DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 36: Hacer un programa que se emule un juego de lanzar 3 dados. En cada
        iteración se muestra el resultado sacado en cada uno de los dados y cuánto es el acumulado
        de esa tirada de 3 dados. Cuando el usuario pulse en “f” o “F” el programa finaliza y 
        muestra el acumulado de puntos de sumar todas las tiradas y el número de tiradas
        Nota: se puede utilizar Random para el número aleatorio:
        Random rnd = new Random();
        rnd.nextInt(6); //genera un aleatorio desde 0 hasta 5. */
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        char salir = 'a';
        int dado1 = 0, dado2 = 0, dado3 = 0, suma = 0;
        int contador = 0, acumulador = 0;
        while(salir != 'f'){
            dado1 = rnd.nextInt(6)+1;
            dado2 = rnd.nextInt(6)+1;
            dado3 = rnd.nextInt(6)+1;
            suma = dado1 + dado2 + dado3;
            acumulador += suma;
            contador++;
            System.out.println("dado 1: "+ dado1 +"\ndado 2: "+ dado2 +"\ndado 3: "+ dado3 +""
                    + "\nsuma: "+ suma +"\nPara salir pulsar f");
            salir = sc.next().toLowerCase().charAt(0);
        }
        System.out.println("El número de iteraciones es "+ contador);
        System.out.println("El acumulado total es "+ acumulador);
        
    }
    
}
