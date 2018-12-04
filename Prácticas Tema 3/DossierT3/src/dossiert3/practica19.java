/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica19 {
    
    public static void main(String[] args) {
        
        /* Práctica 19: Crear un programa que incluya el código anterior e introducir texto en lugar
        de un número cuando el programa lo solicite ¿ qué ocurre, hay un error ? Si es así ¿ cuál es
        el tipo de error/excepción que se desencandena ? ( tomar captura de pantalla del error y
        escribir el tipo de la excepción que se pudiera generar de haberla ). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un número: ");
        int numero = 0;
        boolean salir = false;
        while (!salir){
            try {
                numero = sc.nextInt();
                salir = true;
            }catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("Introduce un número válido.");
            }
        }
        double division = 5 / (double)numero;
        System.out.println("El número introducido es " + numero + " y la división de 5/"+ numero+" da "+ division);
        
    }
    
}
