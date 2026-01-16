package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        final int MAXIMO = 12;

        int[] temperatura = new int[MAXIMO];

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + meses[i] + " : ");
            temperatura[i] = sc.nextInt();

        }

        for (int i = 0; i < 12; i++) {
            System.out.printf("%12s |", meses[i]);
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("\033[40m▄\033[0m");
            }
            System.out.println(" " + temperatura[i] + "º C");
        }

    }
}
