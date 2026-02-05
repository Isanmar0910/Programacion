package Tema6.Ejercicios;

import java.util.Scanner;

public class ColoresArray {

  public static void main(String[] args) {

    Scanner scanner;
    String[] palabras;
    String[] colores;
    String[] resultado;
    int inicio;
    int fin;
    boolean esColor;

    scanner = new Scanner(System.in);

    palabras = new String[8];
    resultado = new String[8];

    colores = new String[] {
        "verde", "rojo", "azul", "amarillo",
        "naranja", "rosa", "negro", "blanco", "morado"
    };

    inicio = 0;
    fin = 8 - 1;

    System.out.println("Introduzca 8 palabras (pulse INTRO tras cada una):");

    for (int i = 0; i < 8; i++) {
      palabras[i] = scanner.nextLine().toLowerCase();
    }

    for (int i = 0; i < 8; i++) {

      esColor = false;

        for (String colore : colores) {
            if (palabras[i].equals(colore)) {
                esColor = true;
            }
        }

      if (esColor) {
        resultado[inicio] = palabras[i];
        inicio++;
      } else {
        resultado[fin] = palabras[i];
        fin--;
      }
    }

    System.out.println("\nArray original:");
    for (int i = 0; i < 8; i++) {
      System.out.println("  " + i + "  " + palabras[i]);
    }

    System.out.println("\nArray resultante:");
    for (int i = 0; i < 8; i++) {
      System.out.println("  " + i + "  " + resultado[i]);
    }
  }
}

