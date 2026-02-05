package Tema6.Ejercicios.ejemploexamen;

import java.util.Scanner;

public class Arrais {

    public static void main(String[] args) {

        String[] alumnos = new String[10];
        double[] notas = new double[10];

        Scanner sc = new Scanner(System.in);

    }

    public static void nombreAlumnos(String[] alumnos, double[] notas, Scanner sc) {

        System.out.println("Introduce los nombres y apellidos de cada alumno: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Alumno " + i + ": ");
            alumnos[i] = sc.nextLine().toLowerCase();
           
            System.out.print("Notas Alumno " + i + ": ");
            notas[i] = sc.nextInt();
            sc.nextLine();

        }

    }

    public static void datosAlumn(String[] alumnos, double[] notas) {
        for (int j = 0; j < notas.length; j++) {
            System.out.println(j + "." + alumnos[j] + ": " + notas[j]);

        }

    }
}
