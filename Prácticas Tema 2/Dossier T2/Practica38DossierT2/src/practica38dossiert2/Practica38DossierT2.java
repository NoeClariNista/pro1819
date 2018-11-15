/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica38dossiert2;

import java.util.Locale;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica38DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 38: Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
        convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
        5días 15horas 15minutos 0segundos. */
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
        System.out.println("Ingrese un número de horas.");
        double numHoras = sc.nextDouble();
        int dias = (int)(numHoras / 24);
        int horas = (int)(numHoras % 24);
        int minutos = (int)((numHoras - (int)numHoras) * 60);
        int segundos = (int)((((numHoras - (int)numHoras) * 60) - (int)minutos) * 60);
        System.out.println(dias +" días, "+ horas +" horas, "+ minutos +" minutos y "+ segundos +" segundos.");
        
    }
    
}
