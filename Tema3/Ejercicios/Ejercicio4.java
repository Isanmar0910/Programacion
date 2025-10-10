package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca el primer número: ");
        num1 = sc.nextDouble();
        System.out.println("x =" + num1);
        System.out.print("Introduzca el segundo número: ");
        num2= sc.nextDouble();
        System.out.println("y = " + num2);
        System.out.println("x + y = " + (num1 + num2));
        System.out.println("x - y = " + (num1 - num2));
        System.out.println("x * y = " + (num1 * num2));
        System.out.println("x / y = " + (num1 / num2));
        
        

    }
}
