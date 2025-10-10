package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Double examen1;
        Double trimestre;
        Double examen2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota del primer examen: ");
        examen1 = sc.nextDouble() * 0.4;
        System.out.print("¿Que nota quiere sacar en el trimestre?: ");
        trimestre = sc.nextDouble();
        examen2 = (trimestre - examen1)/ 0.6;
        System.out.println("Para tener un " + trimestre + " en el trimestre necesita sacar un " + examen2 + " en el segundo examen ");


    }
}
