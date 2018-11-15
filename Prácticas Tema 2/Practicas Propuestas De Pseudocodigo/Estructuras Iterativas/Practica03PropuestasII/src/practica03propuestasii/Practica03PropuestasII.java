/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03propuestasii;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica03PropuestasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Prácticas propuestas de pseudocódigo II - Estructuras Iterativas. */
        
        /* 3. Implementa un algoritmo que muestre todos los números potencia
        de 2 entre 20 y 230, ambos inclusive. */
        
	int numero = 1;
        while (numero <= 230){
            numero *= 2;
            if ((numero >= 20) && (numero <= 230)){
		System.out.println(numero);
            }
        }
        
    }
    
}
