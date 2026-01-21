package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        int[][] tabla = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.print("Introduce el valor de [" + fila + "][" + columna + "]: ");
                tabla[fila][columna] = sc.nextInt();
            }
        }

        System.out.println("\nContenido del array:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(tabla[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
