package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int horas;
        int salario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");
        horas = sc.nextInt();
        salario = horas * 12;
        System.out.println("Su salario semanal es de " + salario + " euros." );

    }
    
}
