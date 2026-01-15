package Repaso;

public class piramideanimada {
    public static void main(String[] args) throws InterruptedException {
        int tamaño = 20;
        final int MINIMO = 3;
        final int MAXIMO = tamaño;

        // while (true) {

        // piramide(tamaño--);
        // Thread.sleep(150);
        // limpiarPantalla();
        // }
        while (true) {

            do {
                piramide(tamaño--);
                Thread.sleep(150);
                limpiarPantalla();
            } while (tamaño != MINIMO);

            do {
                piramide(tamaño++);
                Thread.sleep(150);
                limpiarPantalla();
            } while (tamaño != MAXIMO);

        }
    }

    public static void piramide(int tamaño) {

        int color;

        color = (int) (Math.random() * 7) + 31;
        System.out.printf("\033[%dm", color);

        for (int fila = 0; fila <= tamaño; fila++) {

            for (int espacios = (tamaño+1); espacios > fila; espacios--) {
                System.out.print(" ");
            }

            for (int columna = 0; columna < fila * 2 - 1; columna++) {
                if (columna == 0 || columna == fila * 2 - 2 || fila == tamaño) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}