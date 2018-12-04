/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesadicionales;

import java.util.Scanner;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica11 {
    
    public static int proximoEntero() throws Exception {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
            int cifra;
        int numeroFinal = 0;
        for (int i = 0; i < texto.length() ; i++){
            char caracter = texto.charAt(i);
            if (caracter >= '0' && caracter <= '9'){
                cifra = caracter - '0';
                numeroFinal *= 10;
                numeroFinal += cifra;
            }else{
                System.exit(1);
                throw new Exception("El caracter "+ caracter +" es erroneo");
            }
        }
        return numeroFinal;
    }
    
    public static void main(String[] args) {
        
        // Convertir texto a número.
        
        // Tenemos un texto que introduce un usuario y lo convertimos a número
        // solo podemos utilizar nextLine
        // metodo proximoEntero();
        // controlar con los números negativos (su simbolo)
        // tener en cuenta el +-
        
        System.out.println("Dame un número.");
        int numero;
        try {
            numero = proximoEntero();
            System.out.println(numero);
        } catch (Exception ex) {
            System.out.println("Debes introducir un número");
        }
        
    }
    
}
