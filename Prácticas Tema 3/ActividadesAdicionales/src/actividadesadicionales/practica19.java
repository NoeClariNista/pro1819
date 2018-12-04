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
public class practica19 {
    
    public static boolean buscarRecursivo(int[] array, int inicio, int fin, int num){
        boolean resultado = false;
        if(fin < inicio){
            resultado = false;
        }else if (inicio == fin){
            if (array[inicio] == num){
                resultado = true;
            }else{
                resultado = false;
            }
        }else if ((inicio+1) == fin){
            if (array[inicio] == num || array[fin] == num){
                resultado = true;
            }else{
                resultado = false;
            }
        }else{
            int numero = (inicio + fin) / 2;
            if (array[numero] == num){
                resultado = true;
            }else if (array[numero] < num){
                buscarRecursivo(array, numero, fin, num);
            }else{
                buscarRecursivo(array, inicio, numero, num);
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        // Loteria.
        
        int[] array = {2, 5, 7, 11, 15, 23, 30, 45};
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
     // int num = sc.nextInt();
        int num = 40;
        if (buscarRecursivo(array, 0, array.length-1, num)){
            System.out.println(num +" está presente.");
        }else{
            System.out.println(num +" no está presente");
        }
        
    }
    
}
