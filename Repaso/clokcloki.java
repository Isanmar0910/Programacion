package repaso;

import java.util.Scanner;

public class clokcloki {

    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce un numero del 0-9: ");
        numero = sc.nextInt();

        secuenciaNumero(numero);
    }

    public static void pintarNumero(int numero) {
        boolean superior = true;
        boolean superiorDerecha = true;
        boolean superiorIzquierda = true;
        boolean central = true;
        boolean inferiorIzquierda = true;
        boolean inferiorDerecha = true;
        boolean inferior = true;

        for (int i = 0; i < 7; i++) {
            switch (numero) {
                case 0:
                    superior = true;
                    superiorDerecha = true;
                    superiorIzquierda = true;
                    central = false;
                    inferiorIzquierda = true;
                    inferiorDerecha = true;
                    inferior = true;
                    break;
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
                    superior = false;
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
                    inferior = false;
                    break;
                default:
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

    public static void secuenciaNumero(int numero) {
        boolean superior = true;
        boolean superiorDerecha = true;
        boolean superiorIzquierda = true;
        boolean central = true;
        boolean inferiorIzquierda = true;
        boolean inferiorDerecha = true;
        boolean inferior = true;

        for (int i = 0; i < 7; i++) {
            for (int secuencia = 0; secuencia <= numero; secuencia++) {
                switch (secuencia) {
                    case 0:
                        superior = true;
                        superiorDerecha = true;
                        superiorIzquierda = true;
                        central = false;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                        break;
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
                        inferior = false;
                        break;
                    default:
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

    }
}
