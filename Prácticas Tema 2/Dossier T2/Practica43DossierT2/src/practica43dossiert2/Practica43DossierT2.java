/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica43dossiert2;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica43DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 43: Escribir un programa donde se genera un número secreto mayor o igual a 1 y
        menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
        informa de si el número secreto es mayor o menor que el que él ha introducido. El
        programa finaliza cuando el jugador acierte en cuyo caso se le mostrará elnúmero de
        intentos que ha necesitado para acertar.
        Nota: se puede utilizar Random para el número aleatorio:
        Random rnd = new Random();
        rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29. */
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numeroAleatorio = rnd.nextInt(99)+1;
        System.out.println(numeroAleatorio);
        int numero = 0, i = 1;
        while (numero != numeroAleatorio){
            System.out.println("Introduce un número entero.");
            numero = sc.nextInt();
            if (numero < numeroAleatorio ){
                System.out.println("El número secreto es mayor que el número que se ha introducido.");
                i++;
            }else{
                if (numero > numeroAleatorio){
                    System.out.println("El número secreto es menor que el número que se ha introducido.");
                    i++;
                }
            }
        }
        System.out.println("Felicidades! Haz acertado el número en "+ i +" intentos.");
        
    }
    
}
