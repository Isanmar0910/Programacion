package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        final int MAXIMO = 8;


        int[] numeros = new int[MAXIMO];

        String[] parImpar = new String[MAXIMO];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 8 numeros esteros , pulse INTRo despues de cada numero: ");

        for (int i = 0; i < MAXIMO; i++) {

            numeros[i] = sc.nextInt();

            if (numeros[i] %2 == 0) {
                parImpar[i] = "Par";
            }else {
                parImpar[i] = "Impar";
            }
            
        }

        for (int i = 0; i < MAXIMO; i++) {
            System.out.println(numeros[i] + " " + parImpar[i]);
        }


    }
}
