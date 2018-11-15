/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09propuestasii;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica09PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 9. Haz un algoritmo que muestre, en orden inverso, todos los números
        pares comprendidos entre 0 y 200 (ambos inclusive). */
        
        System.out.println("Los números pares entre 0 y 200 (orden inverso).");
	int numero = 200;
	while (numero >= 0){
            if ((numero % 2) == 0){
                System.out.println(numero);
            }
            numero -= 2;
        }
        
    }
    
}
