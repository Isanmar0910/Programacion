package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    int respuesta;
    int existe = 0;
    int aux;
    Scanner sc = new Scanner(System.in);

    System.out.println("Array original:");
    System.out.print("Índice");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
      numeros[i] = (int) (Math.random() * 101);
    }

    System.out.print("\nValor ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", numeros[i]);
    }
    System.out.println("\n");

    while (existe == 0) {
      System.out.print("Introduzca uno de los números del array: ");
      respuesta = sc.nextInt();

      for (int i = 0; i < 10; i++) {
        if (numeros[i] == respuesta) {
          existe = 1;
        }
      }

      if (existe == 1) {
        while (numeros[0] != respuesta) {
          aux = numeros[9];
          for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i - 1];
          }
          numeros[0] = aux;
        }
      } else {
        System.out.println("Ese número no se encuentra en el array.");
      }
    }

    System.out.println("\nArray resultante:");
    System.out.print("Índice");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", numeros[i]);
    }
    System.out.println();
  }
}