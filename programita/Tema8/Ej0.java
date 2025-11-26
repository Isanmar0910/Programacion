package Tema8;

import java.util.Scanner;

public class Ej0 {

    public static void main(String[] args) {
        int valor = leerValor();
        System.out.println("Has introducido: " + valor);
    }

    public static int leerValor() {

        int numero;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un valor mayor que 2: ");
            numero = sc.nextInt();
            ok = (numero > 2);

            if (!ok) {
                System.out.println("Lo siento, el valor mínimo es 2");
            }

        } while (!ok);

        sc.close();
        return numero;
    }
}
