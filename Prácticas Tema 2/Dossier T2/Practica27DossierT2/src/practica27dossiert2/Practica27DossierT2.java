/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica27dossiert2;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica27DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 27: Hacer un programa que muestre la tabla de multiplicar del número 5 usando
        un bucle while. */
        
        int tabla = 5, i = 1;
        while(i < 11){
            System.out.println(tabla +"x"+ i +"="+ (tabla*i));
            i++;
        }
        
    }
    
}
