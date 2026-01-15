package Tema6;

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {

        // String[] papu = {"" , "pipi" , "caca" , "arepa" , "aura" , "perilla"};

        int[] papu;
        papu = new int[10];

        int respuesta;
        

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 0; i < 10; i++) {
                System.out.print("Introduce el dato " + (i + 1) + " del array: ");
                respuesta = sc.nextInt();
                papu[i] = respuesta;
            }

            System.out.print("Los numeros introducidos, al reves son: ");
            for (int i = 9; i >= 0; i--) {
                System.out.print(papu[i]);
                System.out.print(" ");
            }
           

        } catch (ArrayIndexOutOfBoundsException iobe) {
            System.out.println("ute se equivoco amigo");
        } finally {
            sc.close();
        }

    }
}
