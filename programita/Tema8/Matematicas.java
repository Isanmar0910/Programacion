package Tema8;

import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        if (esCapicua(numero) == true) {
            System.out.println("Es Capicua");
        } else {
            System.out.println("No es capicua");
        }

        if (esPrimo(numero) == true) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es Primo");
        }

    }



    public static boolean esCapicua(int numero) {
        int original = 0;
        int volteado = 0;

        original = numero;

        while (numero > 0) {
            volteado = volteado * 10 + (numero % 10);
            numero /= 10;
        }

        return original == volteado;

    }

    public static boolean esPrimo (int numero) {
        boolean nPrimo = true;
        int contador = 2;

        while (nPrimo && (contador != numero)) {
            if (numero % contador == 0) {
                nPrimo=false;
                contador++;
            }
        }

        return nPrimo;
    }
}
