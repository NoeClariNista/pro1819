/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesadicionales;

import java.util.Random;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica09 {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int inferiorMayuscula = (int)'A';
        int superiorMayuscula = (int)'Z';
        String arrayMayusculas[] = new String[26];
        int j = 0;
        for (int i = inferiorMayuscula; i <= superiorMayuscula; i++) {
            arrayMayusculas[j] = ""+ (char)i;
            j++;
        }
        int inferiorMinuscula = (int)'a';
        int superiorMinuscula = (int)'z';
        String arrayMinusculas[] = new String[26];
        j = 0;
        for (int i = inferiorMinuscula; i <= superiorMinuscula; i++) {
            arrayMinusculas[j] = ""+ (char)i;
            j++;
        }
        int inferiorNumero = (int)'0';
        int superiorNumero = (int)'9';
        String arrayNumeros[] = new String[10];
        j = 0;
        for (int i = inferiorNumero; i <= superiorNumero; i++) {
            arrayNumeros[j]=""+(char)i;
            j++;
        }
        boolean hayMinusculas = false;
        boolean hayMayusculas = false;
        boolean hayNumeros = false;
        String resultado = "";
        while (!(hayMinusculas && hayMayusculas && hayNumeros && resultado.length() >= 8)){
            int aleatorio = rnd.nextInt(154-48+1)+48;
            if (aleatorio >= inferiorMinuscula && aleatorio <= superiorMinuscula){
                hayMinusculas = true;
            }
            if (aleatorio >= inferiorMayuscula && aleatorio <= superiorMayuscula){
                hayMayusculas = true;
            }
            if (aleatorio >= inferiorNumero && aleatorio <= superiorNumero){
                hayNumeros = true;
            }
        }
        System.out.println(resultado);
        
    }
    
}
