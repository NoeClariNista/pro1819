/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica17DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 17: Crea un programa que calcule el IGIC (7%) de un producto dado su precio de
        venta sin IGIC que introduzca el usuario por teclado. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto.");
        double precio = sc.nextDouble();
        final double tipoIgic = 7 / (double)100;
        double impuestos = tipoIgic * precio;
        System.out.println("Impuestos: "+ impuestos +"\nPrecio final: "+ (impuestos+precio));
        
    }
    
}
