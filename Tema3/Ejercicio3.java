package Tema3;

public class Ejercicio3 {
        public static void main(String[] args) {
            double euro;
            double peseta;
            
    
            System.out.print("Introduzca la cantidad de euros que quiere convertir:");
            peseta = Double.parseDouble(System.console().readLine());
            euro = peseta/166;
            System.out.printf("%.2f peseta son %.2f euro.%n", peseta, euro);
    }
}
