package Tema3.Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        Float euro;
        int peseta;
        

        System.out.print("Introduzca la cantidad de euros que quiere convertir:");
        euro = Float.parseFloat(System.console().readLine());
        peseta = (int) (euro*166.386f);
        System.out.printf("%.2f euros son %d pesetas \n", euro, peseta);


    }
}
