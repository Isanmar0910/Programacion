package Tema6.Ejercicios;

import Tema4.ifswi;

public class Ejercicio9 {
    public static void main(String[] args) {
        final int MAXIMO = 20;

        int[] numeros = new int[MAXIMO];
        int[] numPar = new int[MAXIMO];
       
        int aleatorio = 0;
        

        System.out.println("Array original:");

        for (int i = 0; i < MAXIMO; i++) {
            numeros[i] = (int)(Math.random()*101);

            

        }

        for (int i = 0; i < MAXIMO; i++) {
            
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");
        System.out.println("Array con los numeros pares al principio:");

        for (int i = 0; i < MAXIMO; i++) {
            
            if (numeros[i]%2 == 0) {
                
                numPar[i] = numeros[i];
            }

        }

        for (int i = 0; i < MAXIMO; i++) {
            
            if (numeros[i]%2 != 0) {
                
                numPar[i] = numeros[i];
            }
        }

        for (int i = 0; i < MAXIMO; i++) {
            numeros[i] = numPar[i];

            System.out.print(numeros[i] + " ");
        }
       
    }
}
