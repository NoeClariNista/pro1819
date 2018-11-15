/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10propuestas;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica10Propuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo - Estructuras Secuenciales y
        Condicionales. */
        
        /* 10. Diseña un algoritmo que lea un carácter cualquiera desde el teclado,
        y muestre el mensaje "Es una MAYUSCULA" cuando el carácter sea una letra
        mayúscula y el mensaje "Es una MINUSCULA" cuando sea una minúscula. En
        cualquier otro caso, no mostrará mensaje alguno. (Considera únicamente
        letras del alfabeto inglés.) Pista: aunque parezca una obviedad, recuerda
        que una letra es minúscula si está entre la ’a’ y la ’z’, y mayúscula si
        está entre la ’A’ y la ’Z’. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = sc.nextLine().charAt(0);
        if (Character.isLowerCase(letra) != Character.isUpperCase(letra)){
            if (Character.isUpperCase(letra)){
                System.out.println("La letra "+ letra +" es mayúscula.");
            }else{
                System.out.println("La letra "+ letra +" es minúscula.");
            }
        }else{
            System.out.println("No es una letra.");
        }
        
    }
    
}
