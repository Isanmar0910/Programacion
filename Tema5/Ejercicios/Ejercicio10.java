package Tema5.Ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero;
        int posi = 0;
        int nega = 0;

        System.out.println("Introduzca 10 nuemros");
        for (int i = 0 ; i<10 ; i++) {
            numero = Integer.parseInt(System.console().readLine());

            if (numero <0) {
                nega++;
            }else if (numero>=0) {
                posi++;
            }
        }

        System.out.println("Se han introducido " + posi + " numeros positivos y " + nega  + " negativos.");
    }
}
