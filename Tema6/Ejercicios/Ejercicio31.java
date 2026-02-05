package Tema6.Ejercicios;

public class Ejercicio31 {
    public static void main(String[] args) {

        final int MAXIMO = 10;

        int[][] numeros = new int[MAXIMO][MAXIMO];

        int temporalFilas = 0;
        int temporalColumn = 0;

        int maxi = 0;
        int min = 300;
        int media = 0;

        for (int columnas = 0; columnas < MAXIMO; columnas++) {
            for (int filas = 0; filas < MAXIMO; filas++) {

                numeros[filas][columnas] = (int) (Math.random() * (300 - 200 + 1)) + 200;

                if (filas == 9) {
                    System.out.print(numeros[filas][columnas] + " ");
                    System.out.println();
                } else {
                    System.out.print(numeros[filas][columnas] + " ");
                }
            }
        }

        System.out.println("\nDiagonal desde la esquina superior izquierda a la esquina inferior derecha:");
        System.out.print("Derecha: ");

        while (temporalFilas < MAXIMO && temporalColumn < MAXIMO) {

            System.out.print(numeros[temporalFilas][temporalColumn] + " ");

            if (numeros[temporalFilas][temporalColumn] > maxi) {
                maxi = numeros[temporalFilas][temporalColumn];
            }

            if (numeros[temporalFilas][temporalColumn] < min) {
                min = numeros[temporalFilas][temporalColumn];
            }

            media += numeros[temporalFilas][temporalColumn];

            temporalFilas++;
            temporalColumn++;
        }

        System.out.println("\nMAXIMO: " + maxi);
        System.out.println("MINIMO: " + min);
        System.out.println("Media: " + (media / MAXIMO));
    }
}
