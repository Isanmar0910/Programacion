package Tema4;

public class ternario {
    public static void main(String[] args) {
        float nota;

        System.out.print("Que nota has sacado en el ultimo examen?: ");
        nota = Float.parseFloat(System.console().readLine());

        if (nota >= 0 && nota <= 10) {
            System.out.println((nota >= 5)? "Has aprobado" : "Has suspendido");

        }else {
            System.out.println("No puede se neativo o mayor que 10 perla");
        }


    }
}
