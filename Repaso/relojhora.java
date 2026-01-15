package repaso;

import java.time.LocalTime;

public class relojhora {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime ahora = LocalTime.now();
            int hora = ahora.getHour();
            int minuto = ahora.getMinute();
            int segundo = ahora.getSecond();

            int hora1;
            int hora2;
            int minuto1;
            int minuto2;
            int segundo1;
            int segundo2;

            hora1 = hora / 10;
            hora2 = hora % 10;
            minuto1 = minuto / 10;
            minuto2 = minuto % 10;
            segundo1 = segundo / 10;
            segundo2 = segundo % 10;

            // System.out.println(hora1 + "" + hora2 + " : " + minuto1 + minuto2 + " : " + segundo1 + segundo2);
            imprimirHora1(hora1);
            Thread.sleep(1000);
            limpiarPantalla();

        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void imprimirHora1(int hora1) {
        boolean superior = true; // Barra superior
        boolean superiorDerecha = true; // Barra superior derecha
        boolean superiorIzquierda = true; // Barra superior derecha
        boolean central = true; // Barra central
        boolean inferiorIzquierda = true; // Barra inferior izquierda
        boolean inferiorDerecha = true; // Barra inferior derecha
        boolean inferior = true; // Barra inferior

        for (int i = 0; i < 7; i++) {
            switch (hora1) {
                case 1:
                    superior = false;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = false;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                    break;
                case 2:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = false;
                    inferior = true;
                    break;
                case 3:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
                case 4:
                    superior = false;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                    break;
                case 5:
                    superior = true;
                    superiorDerecha = false;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
                case 6:
                    superior = true;
                    superiorDerecha = false;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
                case 7:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = false;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                    break;
                case 8:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
                case 9:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
                case 0:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = false;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
                default:
                    break;
            }

            System.out.print((i == 0 && superior == true) ? " *** " : "");
            System.out.print((i == 0 && superior == false) ? "     " : "");

            System.out.print((i > 0 && i < 3 && superiorIzquierda == true) ? "*" : "");
            System.out.print((i > 0 && i < 3 && superiorIzquierda == false) ? " " : "");
            System.out.print((i > 0 && i < 3) ? "   " : "");
            System.out.print((i > 0 && i < 3 && superiorDerecha == true) ? "*" : "");
            System.out.print((i > 0 && i < 3 && superiorDerecha == false) ? " " : "");

            System.out.print((i == 3 && central == true) ? " *** " : "");
            System.out.print((i == 3 && central == false) ? "     " : "");

            System.out.print((i > 3 && i < 6 && inferiorIzquierda == true) ? "*" : "");
            System.out.print((i > 3 && i < 6 && inferiorIzquierda == false) ? " " : "");
            System.out.print((i > 3 && i < 6) ? "   " : "");
            System.out.print((i > 3 && i < 6 && inferiorDerecha == true) ? "*" : "");
            System.out.print((i > 3 && i < 6 && inferiorDerecha == false) ? " " : "");

            System.out.print((i == 6 && inferior == true) ? " *** " : "");
            System.out.print((i == 6 && inferior == false) ? "     " : "");

            System.out.println();
        }
    }
}
