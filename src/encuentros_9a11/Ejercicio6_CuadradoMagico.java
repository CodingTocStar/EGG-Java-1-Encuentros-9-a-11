/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9a11;


/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

*/
import java.util.Scanner;

public class Ejercicio6_CuadradoMagico {
    public static void main(String[] args) {
        // Leer la matriz 3x3 del usuario
        int[][] cuadrado = leerMatriz();

        // Verificar si la matriz es un cuadrado mágico
        boolean esMagico = esCuadradoMagico(cuadrado);

        // Imprimir el cuadrado ingresado
        System.out.println("Cuadrado ingresado:");
        imprimirCuadrado(cuadrado);

        // Imprimir el resultado
        if (esMagico) {
            System.out.println("El cuadrado ingresado es mágico.");
        } else {
            System.out.println("El cuadrado ingresado no es mágico.");
        }
    }

    // Función para leer una matriz 3x3 del usuario
    public static int[][] leerMatriz() {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los elementos del cuadrado 3x3 (números del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 9) {
                    matriz[i][j] = numero;
                } else {
                    System.out.println("Número incorrecto. Ingrese un número entre 1 y 9.");
                    j--;
                }
            }
        }
        return matriz;
    }

    // Función para determinar si una matriz 3x3 es un cuadrado mágico
    public static boolean esCuadradoMagico(int[][] cuadrado) {
        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        
        // Verificar filas
        for (int i = 1; i < 3; i++) {
            if (cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2] != sumaFila1) {
                return false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j] != sumaFila1) {
                return false;
            }
        }

        // Verificar diagonales
        if (cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] != sumaFila1) {
            return false;
        }
        if (cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] != sumaFila1) {
            return false;
        }
        
        return true;
    }

    // Función para imprimir un cuadrado 3x3
    public static void imprimirCuadrado(int[][] cuadrado) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
