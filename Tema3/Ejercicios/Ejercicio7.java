package Tema3.Ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
        double base;
        double iva;

        System.out.print("Introduzca la base imponible (precio del articulo sin IVA): ");
        base = Double.parseDouble(System.console().readLine());
        iva=base*0.21;
        System.out.printf("Base imponible \t %.2f $ \n", base);
        System.out.println("IVA (21%)\t " + iva + "$");
        System.out.println("--------------------------------------");
        System.out.println("TOTAL\t\t " + (base + iva) + "$");


    }
}
