package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        final int MAXIMO = 100;
        int[] numeros = new int[MAXIMO];

        int cambiar;
        int reemplazo;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            
            numeros[i] = (int)(Math.random()*21);
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");
        System.out.print("Introduzca un numero de los que se han mostrado: ");
        cambiar = sc.nextInt();
        System.out.println("");
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        reemplazo = sc.nextInt();
        System.out.println("");

        for (int i = 0; i < 100; i++) {
            if (numeros[i] != cambiar) {
                System.out.print(numeros[i] + " ");
            }else if (numeros[i] == cambiar) {
                numeros[i] = reemplazo;
                System.out.print("\"" + numeros[i] + "\" ");

            }
        }

    }
}
