package Tema6.Ejercicios;

import java.util.Scanner;

public class RialEjercicio5 {
    public static void main(String[] args) {
        final int MAXIMO = 10;

        int[] numeros = new int[MAXIMO];

        int temporal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vaya introduciendo numeros enteros y pulsando INTRO");
        for (int i = 0; i < 10; i++) {

            numeros[i] = sc.nextInt();
        }

        System.out.println("A continuacion se muestran los valores indicando el minimo y el maximo");


        for (int i = 0; i < 15; i++) {

            if (numeros[i] > numeros[i + 1]) {
                
                temporal = numeros[i];
            }else {
                temporal = numeros[i];
            }
            
        }
    }
}
