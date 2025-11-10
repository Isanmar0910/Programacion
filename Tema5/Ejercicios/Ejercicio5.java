package Tema5.Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int multiplo = 5;
        int resultado;

        System.out.print("muestrame el numero que quieras multiplicar: ");
        multiplo = Integer.parseInt(System.console().readLine());

        for (int i = 0; i <= 10; i++) {
            resultado = multiplo * i;
            System.out.println(multiplo + " x " + i + " = " + resultado);
        }

    }
}
