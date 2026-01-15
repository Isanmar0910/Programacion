package repaso;

public class holapapi {

    public static void main(String[] args) throws InterruptedException {
        int aleatorio;

        aleatorio = 3 + 2 * (int) (Math.random() * 6);

        pintarHola(aleatorio);

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pintarHola(int aleatorio) {
        for (int altura = 0; altura <= aleatorio; altura++) {

            if (altura >= 0 && altura <= aleatorio && altura != (aleatorio / 2)) {
                System.out.print("*    *");
            } else if (altura == (aleatorio / 2)) {
                System.out.print("******");
            }

            System.out.print("    ");

            if (altura == 0 || altura == aleatorio) {
                System.out.print(" **** ");
            } else if (altura >= 1 && altura <= aleatorio) {

                System.out.print("*    *");
            }

            System.out.print("    ");

            if (altura >= 0 && altura < aleatorio) {
                System.out.print("*");
            } else if (altura == aleatorio) {
                System.out.print("******");
            }

            System.out.print("      ");

            if (altura == 0) {
                System.out.print(" **** ");
            } else if (altura == (aleatorio / 2)) {
                System.out.print("******");

            } else if (altura >= 1 && altura <= aleatorio) {
                System.out.print("*    *");
            }

            System.out.println();

        }
    }

    public static void pintarO(int aleatorio) {

    }

}
