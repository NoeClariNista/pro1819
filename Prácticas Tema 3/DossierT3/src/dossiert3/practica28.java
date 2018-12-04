/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica28 {
    
    // Casos para sellar de 4.
    public static String sellar4(int cant) throws Exception {
        String resultado = "";
        if(cant < 12){
            throw new Exception("Debes introducir un número mayor o igual que 12.");
        }else if(cant == 12){
            resultado += "4 + 4 + 4";
        }else if(cant == 13){
            resultado += "4 + 4 + 5";
        }else if(cant == 14){
            resultado += "4 + 5 + 5";
        }else if(cant == 15){
            resultado += "5 + 5 + 5";
        }else{
            resultado += sellar4((cant - 4)) +" + 4"; // Llamada al algoritmo recursivo.
        }
        return resultado;
    }
    
    // Casos para sellar de 5.
     public static String sellar5(int cant) throws Exception {
        String resultado = "";
        if(cant < 12){
            throw new Exception("Debes introducir un número mayor o igual que 12.");
        }else if(cant == 12){
            resultado += "4 + 4 + 4";
        }else if(cant == 13){
            resultado += "4 + 4 + 5";
        }else if(cant == 14){
            resultado += "4 + 5 + 5";
        }else if(cant == 15){
            resultado += "5 + 5 + 5";
        }else if(cant == 16){
            resultado += "4 + 4 + 4 + 4";
        }else{
            resultado += sellar5(cant - 5) +" + 5"; // Llamada al algoritmo recursivo.
        }
        return resultado;
    }
    
    public static void main(String[] args) throws Exception {
        
        /* Práctica 28: para cualesquier cifra de dinero >= 12 que cueste una carta ocurre que se
        puede conseguir franquear con sellos de 4 y 5. Ej 12 = 4, 4, 4 13 = 4, 4, 5 14 = 4, 5, 5
        Encontrar un algoritmo recursivo que resuelva el problema. */
        
        System.out.println("---------------");
        String texto1 = sellar4(18); // El algoritmo recursivo para sellar en los casos de sumar 4.
        System.out.println(texto1);
        System.out.println("---------------");
        String texto2 = sellar4(17); // El algoritmo recursivo para sellar en los casos de sumar 4.
        System.out.println(texto2);
        System.out.println("---------------");
        String texto3 = sellar5(18); // El algoritmo recursivo para sellar en los casos de sumar 5.
        System.out.println(texto3);
        System.out.println("---------------");
        String texto4 = sellar5(17); // El algoritmo recursivo para sellar en los casos de sumar 5.
        System.out.println(texto4);
        System.out.println("---------------");
        
    }
    
}
