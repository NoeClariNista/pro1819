/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica18dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica18DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 18: Escribe un programa que calcule el salario semanal de un empleado en base
        a las horas trabajadas, a razón de 18 euros la hora. */
        
        Scanner sc = new Scanner(System.in);
        double horasTrabajadas;
        System.out.println("Introduce las horas trabajadas durante el Lunes.");
        horasTrabajadas = sc.nextDouble();
        System.out.println("Introduce las horas trabajadas durante el Martes.");
        horasTrabajadas += sc.nextDouble();
        System.out.println("Introduce las horas trabajadas durante el Miercoles.");
        horasTrabajadas += sc.nextDouble();
        System.out.println("Introduce las horas trabajadas durante el Jueves.");
        horasTrabajadas += sc.nextDouble();
        System.out.println("Introduce las horas trabajadas durante el Viernes.");
        horasTrabajadas += sc.nextDouble();
        final int DINERO_HORA = 18;
        double salarioSemanal = DINERO_HORA * horasTrabajadas;
        System.out.println("Salario total es de "+ salarioSemanal);
        
    }
    
}
