package repaso;

import java.util.Scanner;

public class papuexame {
    public static void main(String[] args) {
        long minimo = 0;
        long maximo = 0;
        long aleatorio;
        long volteado =0;
        long digito;
        int colortexto;


        char color = 0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("GRAPHIFY");
            System.out.println("=====================");

            System.out.print("Introduce el valor minimo del rango: ");
            minimo = sc.nextLong();

            System.out.print("Introduce el valor maximo del rango: ");
            maximo = sc.nextLong();

            System.out.print("Dibujo de la grafica en blanco y negro o a color (B|C) ");
            color = sc.next().toLowerCase().charAt(color);

            if (color == 'b') {
                colortexto = 0;
            } else if (color == 'c') {
                colortexto = 33;
            }

            aleatorio = (long) (Math.random() * (maximo - minimo + 1) + minimo);

            System.out.println(voltear(aleatorio));
            volteado = voltear(aleatorio);

            while (volteado >0) {
                digito=volteado%10;
                volteado/=10;
                System.out.println(digito);
            }


        } catch (Exception excepcion) {
            System.out.println("Ha ocurrido un error");
        } finally {
            sc.close();
        }

    }

    public static long voltear(long aleatorio) {
        long volteado = 0;
        long digito;

        while (aleatorio > 0) {
            digito = aleatorio % 10;
            volteado = volteado * 10 + (aleatorio % 10);
            aleatorio /= 10;

        }

        return volteado;
    }

}
