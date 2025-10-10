package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Double mb;
        Double kb;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de Mb: ");
        mb = sc.nextDouble();
        kb = mb * 1024;
        System.out.println(mb + " Mb " + " es igual a " + kb + " Kb " );

    }
}
