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
public class practica20 {
    
    public static void diccionarioRecursivo(String[] dic, int contador, String subpalabra) {
        
        if (contador >= dic.length){
            System.out.println(subpalabra);
        }else{
            for (int i = contador; i < dic.length; i++){
                String temporal = dic[i];
                dic[i] = dic[contador];
                dic[contador] = temporal;
                diccionarioRecursivo(dic, contador+1, subpalabra + dic[contador]);
                temporal = dic[i];
                dic[i] = dic[contador];
                dic[contador] = temporal;
            }
        }
    }
    
    public static void main(String[] args) {
        
        String[] dic= {"t","a","e","r"};
        diccionarioRecursivo(dic, 0, "");
        
    }
    
}
