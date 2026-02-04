package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio1313 {

    public static void main(String[] args) {

        final int MAXIMO = 100;
        int[] numeros = new int[MAXIMO];

        int respuesta;

        int minimo = 500;
        int max = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < MAXIMO; i++) {
            numeros[i] = (int) (Math.random() * 501);
            System.out.print(numeros[i] + " ");

            if (max < numeros[i]) {
                max = numeros[i];
            } else if (minimo > numeros[i]) {
                minimo = numeros[i];
            }
        }

        System.out.print("\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        respuesta = sc.nextInt();
        System.out.println("");

        if (respuesta == 1) {
            for (int i = 0; i < MAXIMO; i++) {
                if (numeros[i] == minimo) {
                    System.out.print("**" + "" + numeros[i] + "**" + " ");
                } else {
                    System.out.print(numeros[i] + " ");
                }
            }
        } else if (respuesta == 2) {
            for (int i = 0; i < MAXIMO; i++) {
                if (numeros[i] == max) {
                    System.out.print("**" + "" + numeros[i] + "**" + " ");
                }else {
                    System.out.print(numeros[i] + " ");
                }
            }
        }

    }
}
