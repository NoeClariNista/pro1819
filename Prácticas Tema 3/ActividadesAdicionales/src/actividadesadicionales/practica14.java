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
public class practica14 {
    
    public static void fibonacci(int limInf, int limSup){
        int numAnterior = 1, numAnteriorAnterior = 1;
        do{
            int num = numAnterior + numAnteriorAnterior;
            if(num >= limInf && num <= limSup ){
                System.out.print(num +", ");
            }
            numAnteriorAnterior = numAnterior;
            numAnterior = num;
        }while(numAnterior <= limSup);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        // Sucesión de Fibonacci.
        
        fibonacci(30, 210);
        
    }
    
}
