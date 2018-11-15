/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica19dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica19DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 19: Realizar un programa que sirva para convertir grados Farenheit en centígrados
        El usuario introducirá los grados Farenheit y se le mostrará la equivalencia en centígrados.
        La fórmula es:.
        C = ( F – 32 ) * 5/9
        donde C es grados centígrados y F es Farenheit. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados Farenheit.");
        double gradosFarenheit = sc.nextDouble();
        double gradosCentigrados = (gradosFarenheit - 32) * 5/(double)9;
        System.out.println("Los grados son "+ gradosCentigrados +" centígrados.");
        
    }
    
}
