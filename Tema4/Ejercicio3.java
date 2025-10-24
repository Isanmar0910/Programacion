package Tema4;

public class Ejercicio3 {
    public static void main(String[] args) {
        int calculo;
        float base;
        float altura;

        System.out.println("1. Area Cuadrado");
        System.out.println("2. Area Rectangulo");
        System.out.println("3. Area Triangulo");
        System.out.print("Selecciona el area que quieras calcular: ");

        calculo = Integer.parseInt(System.console().readLine());
        System.out.print("Indica la base de la figura: ");
        base = Float.parseFloat(System.console().readLine());
        System.out.print("Indica la altura de la figura: ");
        altura = Float.parseFloat(System.console().readLine());

        float totalC = base * altura;
        float totalR = base * altura;
        float totalT = base * altura /2;

        if (calculo == 1) {
            System.out.printf("El area de un cuadrado es %.2f * %.2f que es igual a %.2f", base,altura,totalC);
        }else if (calculo == 2) {
            System.out.printf("El area de un rectangulo es %.2f * %.2f que es igual a %.2f", base,altura,totalR);
        }else if (calculo == 3) {
            System.out.printf("El area de un triangulo es %.2f * %.2f /2 que es igual a %.2f", base,altura,totalT);
        }else   {
            System.out.println("Elige un numero del 1 al 3");
        }

    }
}
