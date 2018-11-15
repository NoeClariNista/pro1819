/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica35dossiert2;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class Practica35DossierT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Práctica 35: Sabiendo que:
        char letra = 'a';
        letra++;
        System.out.println(letra);
        nos muestra la letra ‘b’ tenemos una forma para ir mostrando las diferentes letras
        incrementando una variable. Usar un bucle for y mostrar en pantalla la secuencia de las 10
        primeras letras del abecedario ( todas en minúscula). */
        
        for (char letra = 'a';letra <= 'a'+9;letra++){
            System.out.println(letra);
        }
        
    }
    
}
