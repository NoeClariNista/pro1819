/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica33dossiert2;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica33DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 33: Se pretende imitar el comportamiento de un sistema de control por pin. El
        usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
        informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
        que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
        termina
        Hacer 3 versiones de este código una con while, otra con do while y finalmente for. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU.");
        System.out.println("Selecciona una de las siguientes opciones.");
	System.out.println("1. Ejecutar con el bucle while.");
	System.out.println("2. Ejecutar con el bucle do-while.");
	System.out.println("3. Ejecutar con el bucle for.");
	int opcion = sc.nextInt();
        int intentos = 0;
        int codigo = 1234;
        int numero = 0;
        if (opcion == 1){
            while((intentos != 3) && (codigo != numero)){
                System.out.println("Introduce el pin correcto. Intento ("+ (intentos+1) +"/3)");
                numero = sc.nextInt();
                if(codigo == numero){
                    System.out.println("El código es correcto. Bienvenido.");
                }
                intentos++;
            }
        }else if(opcion == 2){
            do{
                System.out.println("Introduce el pin correcto. Intento ("+ (intentos+1) +"/3)");
                numero = sc.nextInt();
                if(codigo == numero){
                    System.out.println("El código es correcto. Bienvenido.");
                }
                intentos++;
            }while((intentos < 3) && (codigo != numero));
        }else if(opcion == 3){
            for (intentos = 1;intentos <= 3;intentos++){
                if (numero != codigo){
                    System.out.println("Introduce el pin correcto. Intento ("+ intentos +"/3)");
                    numero = sc.nextInt();
                }else{
                    System.out.println("El código es correcto. Bienvenido.");
                    intentos = 3;
                }
            }
        }else{
            System.out.println("Número erroneo.");
        }
        if ((intentos >= 3) && (codigo != numero)){
            System.out.println("Haz superado el número de intentos.");
        }
    }
    
}
