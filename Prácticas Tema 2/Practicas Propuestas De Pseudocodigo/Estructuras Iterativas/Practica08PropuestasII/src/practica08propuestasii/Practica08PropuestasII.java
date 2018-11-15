/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08propuestasii;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica08PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 8. Haz un algoritmo que muestre todos los números pares comprendidos
        entre 0 y 200 (ambos inclusive). */
        
        System.out.println("Los numeros pares entre 0 y 200.");
        int numero = 0;
	while (numero <= 200){
            if ((numero % 2) == 0){
                System.out.println(numero);
            }
            numero += 2;
        }
        
    }
    
}
