/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07propuestasii;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica07PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 7. Diseña un algoritmo que solicite la lectura, letra a letra, de un
        texto que no contenga letras mayúsculas. Si el usuario teclea una letra
        mayúscula, el algoritmo solicitará nuevamente la introducción del texto
        cuantas veces sea preciso. */
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un texto letra a letra hasta que introduzcas un punto.");
	char letra = ' ';
	String texto = "";
	do{
            System.out.println("Añade una letra.");
            letra = sc.nextLine().charAt(0);
            if ((letra >= 'a') && (letra <= 'z')){
                texto += letra;
            }else if(letra != '.'){
                System.out.println("Letra no válida.");
            }
        }while(letra != '.');
	System.out.println(texto);
        
    }
    
}
