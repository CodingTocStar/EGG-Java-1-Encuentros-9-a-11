/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9a11;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_ContadorDigitos {

    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de
    1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    */

    public static void main(String[] args) {
        //1.Herramientas
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //2.Meto tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();
        
        //3.Construyo el vector con su tamaño
        int[] vector = new int[n];
        
        //4.Me meto en el bucle
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(99999) + 1; // Genera números aleatorios de 1 a 99999
            System.out.println(vector[i]); //imprime el numero en cada casilla
        }
        
        //5.Creo el vector que cuenta los digitos
        int[] contadorDigitos = new int[5];
        
        //6.Recorro el vector de digitos
        for (int i = 0; i < n; i++) {
            int digitos = 0;
            int numero = vector[i];
            while (numero > 0 && digitos < 5) { // Contar dígitos del número
                digitos++; //entro con digitos=0 y ahi se actualiza
                numero /= 10; //divido al numero y me fijo si cumple la condicion 
            }
            contadorDigitos[digitos - 1]++; //digitos esta en 1 --> contador[0] del indice 0 y lo incrementa
        }

        for (int i = 0; i < 5; i++) {//vuelvo a recorrer los indices
            System.out.println("Hay " + contadorDigitos[i] + " números de " + (i + 1) + " dígitos.");
        }              //El contador de digitos como se incrementa empieza en 1 || Como i=0 al sumar 1 entonces me muestra que son de 1 digito para empezar
    }
}
