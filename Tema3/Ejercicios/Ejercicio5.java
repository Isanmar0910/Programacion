package Tema3.Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        double base;
        double altura;
        
        System.out.println("Área de un rectangulo");
        System.out.println("--------------------------");
        System.out.print("Introduzca la lomgitud de la base (cm): ");
        base = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la altura (cm): ");
        altura = Double.parseDouble(System.console().readLine());
        System.err.println("El area de un rectangulo es: " + (base * altura) + "cm2");

    }
}
