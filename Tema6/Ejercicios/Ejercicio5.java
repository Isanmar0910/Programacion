package Tema6.Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        int valor;

        System.out.println(
                "A continuacion se muestran en tres columnas, un número aleatorui entre 0 y 100, su cuadrado y su cubo");

        for (int i = 0; i < 20; i++) {
            valor = (int) (Math.random() * 101);

            numero[i] = valor;
        }

        cuadrado(numero, cuadrado);
        cubo(numero, cubo);

        System.out.println(numero[0]);
        System.out.println(cuadrado[0]);
        System.out.println(cubo[0]);

        System.out.println("   n  |    n2   |    n3 ");
        System.out.println("---------------------------");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%5d | %7d | %9d%n",numero[i], cuadrado[i],cubo[i]);
        }
    }

    public static void cuadrado(int[] numero, int[] cuadrado) {
        for (int i = 0; i < 20; i++) {

            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }

    }

    public static void cubo(int[] numero, int[] cubo) {
        for (int i = 0; i < 20; i++) {

            cubo[i] = (int) Math.pow(numero[i], 3);
        }

    }
}
