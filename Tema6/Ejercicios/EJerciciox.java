package Tema6.Ejercicios;

import java.util.Scanner;

public class EJerciciox {
    public static void main(String[] args) {
        int[][] tabla = new int[4][5];

        int sumaFila = 0;
        int sumaColum = 0;
        int sumaColumTot = 0;
        int sumaFilaTot = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca los numeros (enteros) en el array");

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + " , columna " + columna + ":");
                tabla[fila][columna] = sc.nextInt();

            }
        }

        for (int fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (int columna = 0; columna < 5; columna++) {
                
                System.out.printf("%5d", tabla[fila][columna]);
                sumaFila += tabla[fila][columna];
                
            }
            sumaFilaTot += sumaFila;
            System.out.println(" |     " + sumaFila);

        }
        System.out.println("---------------------------------------------------------------------");

        for (int columna = 0; columna < 5; columna++) {
            sumaColum = 0;
            
            for (int fila = 0; fila < 4; fila++) {
                sumaColum += tabla[fila][columna];
            }
            
            sumaColumTot += sumaColum;
            System.out.printf("%5d", sumaColum);
        }

            System.out.println(" |     " + (sumaColumTot + sumaFilaTot) );
        
    }
}
