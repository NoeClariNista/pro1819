/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica42dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica42DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 42: Hay una cuadrilla de trabajadores que aceptar encargos. Pongamos por
        ejemplo que tienen un encargo por 10000€. Al finalizar el trabajo observan que han
        participado 5 componentes de la cuadrilla dedicando cada uno de ellos respectivamente el
        siguiente número de horas:
        10, 100, 100, 20, 20
        Así que en total han invertido 250horas para un trabajo de 10000€ saliendo la hora
        trabajada a: 40€
        Hacer un programa que les permita calcular lo que sale cada hora trabajada. Como datos de
        entrada recibirá el dinero total que se pagará por el encargo. El número de participantes de
        la cuadrilla y el número de horas que haya realizado cada uno de los participantes. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dinero para el encargo.");
        int dineroTotal = sc.nextInt();
        System.out.println("Introduce el número de participantes.");
        int numeroParticipantes = sc.nextInt();
        int horas = 0;
        for (int i = 1;i <= numeroParticipantes;i++){
            System.out.println("Dime el número de horas que hizo el participante "+ i);
            int horasParticipantes = sc.nextInt();
            horas += horasParticipantes;
        }
        System.out.println("Han invertido un total de "+ horas +" horas para un trabajo de " + dineroTotal +" € saliendo la hora trabajada a " + (dineroTotal/horas) +"€.");
        
    }
    
}
