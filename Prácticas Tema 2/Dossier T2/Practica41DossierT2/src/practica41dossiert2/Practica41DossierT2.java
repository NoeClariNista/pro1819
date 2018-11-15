/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica41dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica41DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 41: Escribir un programa que el usuario escriba una cadena de texto y se le
        muestre el texto al revés. Ej “cabello” mostraría: “ollebac”
        Nota: “cabello”.substring(2,3) devuelve: “b” que es la tercera letra de ese texto. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto.");
        String texto = sc.nextLine();
        String resultadoTexto = "";
        for (int i = texto.length()-1;i >= 0;i--){
            String nuevoTexto = texto.substring(i,i+1);
            resultadoTexto += nuevoTexto;
        }
        System.out.println("La palabra introducida de manera inversa es "+ resultadoTexto);
        
    }
    
}
