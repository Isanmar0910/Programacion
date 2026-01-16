package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int MAXIMO = 15;

        int[] numeros = new int[MAXIMO];

        int temporal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vaya introduciendo numeros enteros y pulsando INTRO");
        for (int i = 0; i < 15; i++) {

            numeros[i] = sc.nextInt();
        }

        System.out.println("Array original:");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
       

        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numeros[i]);
        }
        System.out.println("|");

       
        temporal = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = temporal;

        System.out.println("\nArray rotado a la derecha una posición:");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numeros[i]);
        }
        System.out.println("|");

    }
}
