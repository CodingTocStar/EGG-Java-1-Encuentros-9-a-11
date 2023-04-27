/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9a11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_MatrizAntisimetrica {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //Dimension de matriz
        System.out.println("Ingrese la cantidad de filas");
        int filas = lector.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = lector.nextInt();
        
        // Crear una matriz A con números aleatorios
        int[][] matrizA = crearMatrizAleatoria(filas, columnas);

        // Calcular la matriz traspuesta AT de la matriz A
        int[][] matrizAT = transponerMatriz(matrizA);

        // Comparar si la matriz A es igual a la matriz AT cambiada de signo
        boolean esAntisimetrica = esMatrizAntisimetrica(matrizA, matrizAT);

        // Imprimir la matriz A
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        // Imprimir la matriz AT
        System.out.println("\nMatriz AT:");
        imprimirMatriz(matrizAT);

        // Mostrar si la matriz A es antisimétrica o no
        if (esAntisimetrica) {
            System.out.println("\nLa matriz A es antisimétrica.");
        } else {
            System.out.println("\nLa matriz A no es antisimétrica.");
        }
    }

    public static int[][] crearMatrizAleatoria(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(21) - 10; // Números aleatorios entre -10 y 10
            }
        }
        return matriz;
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTraspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTraspuesta;
    }

    public static boolean esMatrizAntisimetrica(int[][] matrizA, int[][] matrizAT) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizA[i][j] != -matrizAT[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}