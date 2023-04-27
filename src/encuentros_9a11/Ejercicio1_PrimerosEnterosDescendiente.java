/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package encuentros_9a11;

public class Ejercicio1_PrimerosEnterosDescendiente {
    public static void main(String[] args) {
        // creo el array
        int[] primerosEnteros = new int[100];
        
        for (int i = 0; i < 100; i++) {
            primerosEnteros[i]=i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(primerosEnteros[i]);
        }
    }
}