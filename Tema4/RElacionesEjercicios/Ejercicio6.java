package Tema4.RElacionesEjercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;

        System.out.print("Introduce la primera nota: ");
        nota1 = Float.parseFloat(System.console().readLine());
        System.out.print("Ahora introsuzca la segunda nota: ");
        nota2 = Float.parseFloat(System.console().readLine());
        System.out.print("Ahora introsuzca la tercera nota: ");
        nota3 = Float.parseFloat(System.console().readLine());
        float media = (nota1 + nota2 + nota3)/3;

        System.out.printf("la media es %.2f", media);
    }
}
