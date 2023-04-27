/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9a11;

import java.util.Random;


public class Ejercicio4_matrizTranspuesta {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];

        // Llenar matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        // Calcular la matriz traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Mostrar matriz traspuesta
        System.out.println("\nMatriz traspuesta:");
        imprimirMatriz(matrizTraspuesta);
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
