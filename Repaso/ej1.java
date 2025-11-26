package Repaso;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        int altura;
        int longitud = 0;
        int contador = 1;
        int espacio;
        int hueco = 0;
        final int MINIMO = 3;
        String caracter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la piramide: ");
        altura = sc.nextInt();

        System.out.print("Introduce el caracter de la piramide: ");
        caracter = sc.next();

        funciones.piramideHueca(altura, caracter);

        for (int i = altura ; i < MINIMO ; i++ ) {
            funciones.piramideHueca((altura), caracter);
        }

    }
}
