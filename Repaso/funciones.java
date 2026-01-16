package repaso;

import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
        int altura;
        String caracter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la piramide: ");
        altura = sc.nextInt();

        System.out.print("Introduce el caracter de la piramide: ");
        caracter = sc.next();

        piramideHueca(altura, caracter);
    }

    public static void piramideHueca(int altura, String caracter) {
        int contador = 1;
        int espacio = altura - 1;
        int hueco = 0;

        while (contador <= altura) {

            for (int i = 0; i <= espacio; i++) {
                System.out.print(" ");
            }

            System.out.print(caracter);

            for (int i = 1; i < hueco; i++) {
                System.out.print(" ");

            }

            if (contador > 1) {
                System.out.print(caracter);
            }

            hueco += 2;
            contador++;
            espacio--;
            System.out.println();

        }

        for (int i = 1; i < (contador * 2); i++) {
            System.out.print(caracter);
        }
    }
}
