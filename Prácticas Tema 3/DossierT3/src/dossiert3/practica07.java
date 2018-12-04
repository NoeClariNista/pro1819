/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica07 {
    
    public enum Estaciones {
        PRIMAVERA, VERANO, OTOÑO, INVIERNO
    }
    
    public static void main(String[] args) {
        
        /* Práctica 7: Crear un programa con un tipo enumerado para las estaciones y mostrar en
        pantalla el dato enumerado correspondiente a la actual estación. */
        
        Estaciones estacionActual = Estaciones.OTOÑO;
        System.out.println("La estación actual es: "+ estacionActual);
        
    }
    
}
