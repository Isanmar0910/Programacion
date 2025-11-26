package Tema5.Ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        int n;
        System.out.print("Introduzca un numero: ");
        n = Integer.parseInt(System.console().readLine());
        System.out.println(" n  |  n2  |  n3");
        System.out.println("-------------------");

        for (int i = 0; i < 6; i++) {
            System.out.println( n  + "  | " +  (n*n) +  "  | " + (n*n*n));
            n++;

        }

    }
}
