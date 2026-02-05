package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        
        int[] numeros = new int[20];

        int respuesta;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            numeros[i] = (int)(Math.random()*401);

            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nQue numeros quieres resaltar?");
        System.out.print("(1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        respuesta = sc.nextInt();
        System.out.println("");

        if (respuesta == 1) {
            for (int i : numeros) {
                if (i%5 == 0) {
                    System.out.print("[" + i + "]" + " ");
                }else {
                    System.out.print(i + " ");
                }
            }
        }else if (respuesta == 2) {
            for (int i : numeros) {
                if (i%7 == 0) {
                    System.out.print("[" + i + "]" + " ");
                }else {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
