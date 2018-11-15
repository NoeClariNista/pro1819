/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica37dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica37DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 37: Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
        de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
        los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
        que tiene en billetes. */
        
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        for (int i = 100;i > 1;i/=10){
            for(int j = 5;j >= 1;j/=2){
                System.out.println("¿Cuántos billetes de: "+ i*j +" €?");
                int numeroBilletes = sc.nextInt();
                acumulador += numeroBilletes*i*j;
            }
        }
        System.out.println("¿Cuántos billetes de: "+ 5 +" €?");
        int numeroBilletes = sc.nextInt();
        acumulador += numeroBilletes*5;
        System.out.println("Cantidad total: "+ acumulador +" €.");
        
    }
    
}
