/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica16DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 16: Cálculo del área de una Finca. La finca es rectangular así que el usuario
        introducirá el número de metros de cada lado y se le mostrará el área calculada tanto en
        metros cuadrados como en centímetros cuadrados. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un lado de la finca.");
        int lado1 = sc.nextInt();
        System.out.println("Introduce el otro lado de la finca.");
        int lado2 = sc.nextInt();
        int area = lado1 * lado2;
        System.out.println("El area es "+ area + "m." + "\n"+ area*100 + "cm.");
        
    }
    
}
