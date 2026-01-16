package repaso;

import java.time.LocalTime;

public class relojrainau {

    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();

        int hora = ahora.getHour();
        int minuto = ahora.getMinute();
        int segundo = ahora.getSecond();

        int hora1 = hora / 10;
        int hora2 = hora % 10;
        int minuto1 = minuto / 10;
        int minuto2 = minuto % 10;
        int segundo1 = segundo / 10;
        int segundo2 = segundo % 10;

        

        System.out.println(" **********************************************");
        System.out.println(" ********** R E L O J D I G I T A L **********");
        System.out.println(" **********************************************");
        imprimirHora1(hora1);
        imprimirHora2(hora2);

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void imprimirHora1(int hora1) {
        boolean superior = true;
        boolean superiorDerecha = true;
        boolean superiorIzquierda = true;
        boolean central = true;
        boolean inferiorIzquierda = true;
        boolean inferiorDerecha = true;
        boolean inferior = true;

        for (int i = 0; i < 7; i++) {
            switch (hora1) {
                case 0 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = false;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 1 -> {
                    superior = false;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = false;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                case 2 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = false;
                    inferior = true;
                }
                case 3 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 4 -> {
                    superior = false;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                case 5 -> {
                    superior = true;
                    superiorDerecha = false;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 6 -> {
                    superior = false;
                    superiorDerecha = false;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 7 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = false;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                case 8 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 9 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                default ->
                    throw new AssertionError();
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

            System.out.print("  ");

            

        }

        System.out.println("");
    }

    public static void imprimirHora2(int hora2) {
        boolean superior = true;
        boolean superiorDerecha = true;
        boolean superiorIzquierda = true;
        boolean central = true;
        boolean inferiorIzquierda = true;
        boolean inferiorDerecha = true;
        boolean inferior = true;

        for (int i = 0; i < 7; i++) {
            switch (hora2) {
                case 0 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = false;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 1 -> {
                    superior = false;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = false;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                case 2 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = false;
                    inferior = true;
                }
                case 3 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 4 -> {
                    superior = false;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                case 5 -> {
                    superior = true;
                    superiorDerecha = false;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 6 -> {
                    superior = false;
                    superiorDerecha = false;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 7 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = false;
                    central = false;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                case 8 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                }
                case 9 -> {
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = true;
                    inferiorIzquierda = false;
                    inferiorDerecha = true;
                    inferior = false;
                }
                default ->
                    throw new AssertionError();
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

            System.out.println("");

        }
    }
}


