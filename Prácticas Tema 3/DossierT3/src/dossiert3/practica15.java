/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossiert3;

import java.util.Random;

/**
 *
 * @author Noelia Hernández Domínguez.
 */
public class practica15 {
    
    public static int generarAleatorio(String[] array) {
        Random rnd = new Random();
        int resultado = rnd.nextInt(array.length);
        return resultado;
    }
    
    public static void main(String[] args) {
        
        /* Práctica 15: Crear un programa que muestre al azar una carta de la baraja española. Por ej.
        “sota de copas” Para ello se usarán dos array En el primero se registra:
        1,2,3,4,5,6,7,sota,caballo,rey
        En el segundo
        oros,copas,bastos,espadas
        Mediante dos aleatorios se toma un dato del primer array y un dato del segundo array para
        componer el nombre de la carta a mostrar. */
        
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
        String[] palos = {"oros", "copas", "bastos", "espadas"};
        int valorNumeros = generarAleatorio(numeros);
        int valorPalos = generarAleatorio(palos);
        String resultadoNumeros = numeros[valorNumeros];
        String resultadoPalos = palos[valorPalos];
        System.out.println(resultadoNumeros +" de "+ resultadoPalos);
        
    }
    
}
