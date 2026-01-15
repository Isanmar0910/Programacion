package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int MAXIMO = 15;

        int[] numeros = new int[MAXIMO];

        Scanner sc = new Scanner(System.in);

        System.out.println("Vaya introduciendo numeros enteros y pulsando INTRO");
        for (int i = 0; i < 15; i++) {

            numeros[i] = sc.nextInt();
        }

        System.out.println("Array original:");

        for (int i = 0; i < 15; i++) {
            System.out.printf("|%5d", i);

        }
        System.out.println("");
        System.out.println(
                "--------------------------------------------------------------------------------------------");

        for (int i = 0; i < 15; i++) {

            System.out.printf("|%5d", numeros[i]);
        }

        for (int i = 0; i < 15; i++) {
            System.out.printf("|%5d", i);
            
        }

        System.out.println("");
        System.out.println(
                "--------------------------------------------------------------------------------------------");

        for (int i = 0; i < 15; i++) {
            
            if (i == (MAXIMO - 1)) {
                
            }
            

        }

    }
}
