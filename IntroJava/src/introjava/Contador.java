/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Salas
 */
public class Contador {
    
    public static void main(String[] args) {
        System.out.println("Trabajando con contadores");
        //inicializar nuestro contador
        int contador = 1;
        //vamos a repetir 5 veces un proceso
        while(contador <=5){
            System.out.println("contador: "+contador);
            contador++;//incremento de la variable contador en 1
        }
    }
}
