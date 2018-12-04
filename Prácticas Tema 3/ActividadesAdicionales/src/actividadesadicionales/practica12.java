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
public class practica12 {
    
    public static int girarNumero (int numero) {
        int resultado = 0, cociente, resto;
        cociente = numero;
        do{
            resto = cociente % 10;
            cociente = cociente / 10;
            resultado = resultado*10 + resto;
         // System.out.print(resto +" ");
        }while (cociente > 0);
     // System.out.println(" ");
        return resultado;
    }
    
    public static int contrarCifras (int numero) {
        int mayor = 1;
        int i = 0;
        do{
            mayor *= 10;
            i++;
        }while (mayor <= numero);
        return i;
    }
    
    public static void main(String[] args) {
        
        // Generar números capicuas.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te digo si es capicua.");
        int numeroCapicua = sc.nextInt();
     // int numeroCapicua = 12344321; 
        int reverso = girarNumero(numeroCapicua);
        int contar = contrarCifras(numeroCapicua);
        System.out.println(contar);
        if (numeroCapicua == reverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
        
    }
    
}
