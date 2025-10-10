package Tema3;

public class Ejercicio9 {
    public static void main(String[] args) {
        Double h;
        Double r;
        Double volumen;

        System.out.println("Volumen de un cono");
        System.out.println("---------------------------");
        System.out.print("Introduzca la altura (cm): ");
        h = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el radio de la base (cm): ");
        r = Double.parseDouble(System.console().readLine());
        volumen = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
        System.out.println("El volumen de un cono es: " + volumen + "cm3");
    }
}
