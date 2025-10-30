package Tema4.RElacionesEjercicios;

public class ejercicio7 {
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

        if (media >= 0 && media <= 4) {
            System.out.println("Suspenso");
        } else if (media >= 5 && media <= 6) {
            System.out.println("Suficiente");
        } else if (media >= 7 && media <= 8) {
            System.out.println("Notable");
        } else if (media >= 9 && media <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("¿Qué tú dise");
        }
    }

}
