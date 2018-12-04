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
public class practica01 {
    
    public static boolean usuarioAutorizado(String user, String password) {
        String usuarioValido = "paco";
        String contraseñaValida = "pass";
        return user.equals(usuarioValido) && password.equals(contraseñaValida);
    }
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        String usuario, clave;
        do{
            System.out.println("Introducir un usuario: ");
            usuario = cin.nextLine();
            System.out.println("Introducir una contraseña");
            clave = cin.nextLine();
        }while (!usuarioAutorizado(usuario, clave));
        System.out.println("Ok. Puedes continuar.");
        int cuantia = 10000;
        System.out.println("Cuantía total del proyecto: " + cuantia);
        
    }
    
}
