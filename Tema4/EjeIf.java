package Tema4;

public class EjeIf {
    public static void main(String[] args) {
        float nota;

        System.out.print("Que nota has sacado en el ultimo examen?: ");
        nota = Float.parseFloat(System.console().readLine());

        if (nota >= 5 && nota <= 10) {
            System.out.println("Has aprovado omaga ");

        }else {
            System.out.println("Has suspendido :(");
        }


    }
}
