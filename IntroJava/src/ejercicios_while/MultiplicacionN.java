/*
 * Progrma para realizar la multiplicación de N números ingresados por teclado
 */
package ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class MultiplicacionN {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean nuevo_numero = true;
        int acumulador = 1;
        while (nuevo_numero == true) {
            System.out.println("Desea ingresar otro número: si/no?");
            String respuesta = teclado.next();
            respuesta = respuesta.toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Ingrese el número: ");
                int numero = teclado.nextInt();
                acumulador = acumulador * numero;
            } else if (respuesta.equals("no")) {
                nuevo_numero = false;//hacemos que finalice el ciclo de repetición
            }
        }
        System.out.println("La multiplicación de los números es: "+acumulador);
    }

}
