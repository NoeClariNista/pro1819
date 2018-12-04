/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesadicionales;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica06 {
     
    public static int invertirNumero(int num) {
        String resultado;
        String numString = ""+ num;
        if (numString.length() > 1){
            char c = numString.charAt(0);
            String restante = numString.substring(1, numString.length());
            int restanteInt = Integer.parseInt(restante);
            resultado = (""+ invertirNumero(restanteInt)) + c;
        }else{
            resultado = numString;
        }
        return Integer.parseInt(resultado);
    }
     
    public static void main(String[] args) {
        
        /* Práctica 23 (DE OTRA MANERA): Invertir las cifras de un número mediante recursión: 123347 → 743321. */
        
        int numero = invertirNumero(123447);
        System.out.println(numero);
        
    }
    
}
