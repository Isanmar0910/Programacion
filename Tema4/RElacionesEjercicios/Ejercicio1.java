package Tema4.RElacionesEjercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        String dia;

        System.out.print("Introduce un dia de la semana y te dire que toca a primera hora: ");
        dia = System.console().readLine();

        if (dia.equalsIgnoreCase("Lunes")) {
            System.out.println("Ese dia a primaera toca: \033[1mProgramacion\033[0m");
        }else if (dia.equalsIgnoreCase("Martes")) {
            System.out.println("Ese dia a primaera toca: \033[1mSistemas\033[0m");
        }else if (dia.equalsIgnoreCase("Miercoles")) {
            System.out.println("Ese dia a primaera toca: \033[1mBase de datos\033[0m");
        }else if (dia.equalsIgnoreCase("Jueves")) {
            System.out.println("Ese dia a primaera toca: \033[1mLenguaje de Marcas\033[0m");
        }else if (dia.equalsIgnoreCase("Viernes")) {
            System.out.println("Ese dia a primaera toca: \033[1mFol\033[0m");
        }else {
            System.out.println("Indica un dia de entre semana");
        }
    }
}
