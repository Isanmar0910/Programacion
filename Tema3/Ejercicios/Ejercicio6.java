package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Área de un triángulo");
        System.out.println("--------------------------");
        System.out.print("Introduzca la lomgitud de la base (cm): ");
        base = sc.nextDouble();
        System.out.print("Introduzca la altura (cm): ");
        altura = sc.nextDouble();
        System.err.println("El area de un triángulo es: " + ((base * altura)/2) + "cm2");

    }
}
