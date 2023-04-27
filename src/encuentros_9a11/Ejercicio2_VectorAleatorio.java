/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9a11;

 
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Ejercicio2_VectorAleatorio {

    /*
    Realizar un algoritmo que llene un vector de tamaño N con valores
    aleatorios y le pida al usuario un número a buscar en el vector. El
    programa mostrará dónde se encuentra el numero y si se encuentra
    repetido
    */
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        // Crear el vector y rellenarlo con valores aleatorios
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }

        // Pedir al usuario el número a buscar
        System.out.print("Ingrese un número a buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();

        // Buscar el número en el vector
        boolean encontrado = false;
        for (int i = 0; i < n; i++) { //recorre el array
            if (vector[i] == numeroBuscado) { //mira cada casilla si coincide con lo que buscamos
                if (!encontrado) { // si el numero coincidia entra en el bucle --> dentro tengo un true, entonces mestra caso positivo
                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + i + " del vector.");
                    encontrado = true; //pone la variabele en true y vuelve a ingresar al bucle
                } else {
                    System.out.println("El número " + numeroBuscado + " se encuentra repetido en la posición " + i + " del vector.");
                }
            }
        }

        // Mostrar mensaje si el número no se encuentra en el vector
        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }
    }
}
