package Tema4.RElacionesEjercicios;

public class EJercicio8 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;

        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax2 + bx + c = 0");
        System.out.println("Introduce los valores");
        System.out.print("a =");
        a = Float.parseFloat(System.console().readLine());
        System.out.print("b= ");
        b = Float.parseFloat(System.console().readLine());
        System.out.print("c= ");
        c = Float.parseFloat(System.console().readLine());

        if (a == 0) {
            if (b == 0) {
            }if (c == 0) {
                System.out.println("La ecuaciuon tiene indinitas solucionees");
            }
            
        }

    }
}
