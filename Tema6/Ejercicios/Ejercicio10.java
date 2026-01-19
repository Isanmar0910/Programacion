package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        final int MAXIMO = 10;
        int[] numero = new int[MAXIMO];

        int nPersona;
        boolean sentado;

        Scanner sc = new Scanner(System.in);

       
        for (int i = 0; i < MAXIMO; i++) {
            numero[i] = (int) (Math.random() * 5);
        }

        try {
            while (true) {

                sentado = false;
                imprimir(numero, MAXIMO);

                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                nPersona = sc.nextInt();

                if (nPersona == -1) {
                    throw new Exception();
                }

                if (nPersona <= 4) {

                    
                    for (int i = 0; i < MAXIMO; i++) {
                        if (!sentado && numero[i] == 0) {
                            numero[i] += nPersona;
                            System.out.println("Por favor, siéntense en la mesa número " + (i + 1) + ".");
                            sentado = true;
                        }
                    }

                    for (int i = 0; i < MAXIMO; i++) {
                        if (!sentado && numero[i] + nPersona <= 4) {
                            numero[i] += nPersona;
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1) + ".");
                            sentado = true;
                        }
                    }

                    if (!sentado) {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }

                } else {
                    System.out.println("Lo siento, no admitimos grupos de " + nPersona);
                }
            }

        } catch (Exception e) {
            System.out.println("Gracias. Hasta pronto.");
        }
    }

    public static void imprimir(int[] numero, int MAXIMO) {

        System.out.print("| Mesa nº       ");
        for (int i = 1; i <= MAXIMO; i++) {
            System.out.printf("| %5d ", i);
        }
        System.out.println("|");

        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        System.out.print("| Ocupacion nº  ");
        for (int i = 0; i < MAXIMO; i++) {
            System.out.printf("| %5d ", numero[i]);
        }
        System.out.println("|");
    }
}
