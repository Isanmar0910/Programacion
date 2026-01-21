package Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        int[][] tabla = {
            {8, -12, 33},
            {14, 1, -24},
            {100, 51, 69}
        };

        int posicion;
        int fila;
        int columna;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la posición del array que quieres visualizar: ");
        posicion = sc.nextInt();

        fila = posicion / 3;
        columna = posicion % 3;

        System.out.println("El valor es: " + tabla[fila][columna]);
    }
}
