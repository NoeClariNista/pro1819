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
public class practica08 {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int inferiorMayuscula = (int)'A';
        int superiorMayuscula = (int)'Z';
        int inferiorMinuscula = (int)'a';
        int superiorMinuscula = (int)'z';
        int inferiorNumero = (int)'0';
        int superiorNumero = (int)'9';
        boolean hayMinusculas = false;
        boolean hayMayusculas = false;
        boolean hayNumeros = false;
        String resultado = "";
        while (!(hayMinusculas && hayMayusculas && hayNumeros && resultado.length()>=8)){ //!hayMinusculas || !hayMayusculas || !hayNumero || resultado.length()<8
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
            if (aleatorio < 123 && aleatorio > 96){
                resultado += ((char)aleatorio);
            }
            if (aleatorio < 91 && aleatorio > 64){
                resultado += ((char)aleatorio);
            }
            if (aleatorio < 58 && aleatorio > 47){
                resultado += ((char)aleatorio);
            }
        }
        System.out.println(resultado);
        
    }
    
}
