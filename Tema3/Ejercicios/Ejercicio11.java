package Tema3.Ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        Double mb;
        Double kb;

        System.out.print("Introduzca el numero de Kb: ");
        kb = Double.parseDouble(System.console().readLine());
        mb = kb / 1024;
        System.out.println(kb + " Kb " + " es igual a " + mb + " Mb " );
    }
}
