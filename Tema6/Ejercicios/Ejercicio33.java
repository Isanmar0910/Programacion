package Tema6.Ejercicios;

public class Ejercicio33 {

    public static void main(String[] args) {

        String[] pais = {"España", "Rusia", "Japon", "Australia"};

        int[][] estatura = new int[4][10];

        int media;

        int min;

        int max;

        System.out.printf("%75s%n", "MED MIN MAX");

        for (int fila = 0; fila < 4; fila++) {
            media = 0;
            min = 210;
            max = 0;

            System.out.printf("%10s: ", pais[fila]);
            for (int columna = 0; columna < 10; columna++) {

                estatura[fila][columna] = (int) (Math.random() * (210 - 140 + 1) + 140);

                System.out.printf("%3d ", estatura[fila][columna]);
                System.out.print(" ");

                media = media + estatura[fila][columna];

                if (max > estatura[fila][columna]) {
                    max = max;
                } else if (max < estatura[fila][columna]) {
                    max = estatura[fila][columna];
                }

                if (min > estatura[fila][columna]) {
                    min = estatura[fila][columna];
                } else if (min < estatura[fila][columna]) {
                    min = min;
                }

                if (columna == 9) {
                    System.out.printf("| %3d %3d %3d%n", media / 10, min, max);
                }

            }
        }
    }
}
