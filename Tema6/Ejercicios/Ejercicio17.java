package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] menor = new int[10];
        int[] mayor = new int[10];

        Scanner sc = new Scanner(System.in);

        int aux;

        int cont = 0;
        int contMen = 0;
        int contMay= 0;

        for (int i = 0; i < 10; i++) {

            System.out.printf("%5d", i);
            numeros[i] = (int) (Math.random() * 201);

            if (numeros[i] > 100) {
                mayor[contMay++] = numeros[i];
            } else if (numeros[i] < 100) {
                menor[contMen++] = numeros[i];
            }

        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {

            System.out.printf("%5d", numeros[i]);
        }

        System.out.println("Array resuelto:");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%5d", i);
        }

        for (int i = 0; i < 10; i++) {

            do {

                numeros[cont] = menor[i];
                numeros[cont++] = mayor[i];

            } while (menor[i] >= 0 && mayor[i] >= 0 || cont == 10);

        }

        for (int i = 0; i < 10; i++) {

            System.out.printf("%5d", numeros[i]);
        }

    }

}
