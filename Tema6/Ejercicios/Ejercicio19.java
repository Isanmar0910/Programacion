package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        int nReyes;
        int contador;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número total de nombres de reyes: ");
        nReyes = sc.nextInt();
        sc.nextLine(); 

        String[] reyes = new String[nReyes];

        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");

        for (int i = 0; i < nReyes; i++) {
            reyes[i] = sc.nextLine();
        }

        System.out.println("Los reyes introducidos son:");

        for (int i = 0; i < nReyes; i++) {
            contador = 1;

            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                    contador++;
                }
            }

            System.out.println(reyes[i] + " " + contador + "o");
        }

        sc.close();
    }
}
