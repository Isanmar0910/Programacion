package repaso;

import java.util.Scanner;

public class rejol {

    public static void main(String[] args) {
        int digito = 0;
        int opcion;

        Scanner sc = new Scanner(System.in);

        System.out.println("""
        **********************************************
        *                                            *
        *          NÚMEROS DIGITALES v1.0            *
        *                                            *
        **********************************************
        *                                            *
        *    [1] Mostrar secuencia (0 a N)           *
        *    [2] Número específico                   *
        *    [0] Salir                               *
        *                                            *
        **********************************************
        """);

        System.out.print("Opción: ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Introduce un numero del 0 al 9:");
            digito = sc.nextInt();
            secuenciaNumeros(digito);

        } else if (opcion == 2) {
            System.out.print("Introduce un numero del 0 al 9:");
            digito = sc.nextInt();
            imprimirNumero(digito);
        }

    }

    public static void imprimirNumero(int digito) {
        boolean superior = true; // Barra superior
        boolean superiorDerecha = true; // Barra superior derecha
        boolean superiorIzquierda = true; // Barra superior derecha
        boolean central = true; // Barra central
        boolean inferiorIzquierda = true; // Barra inferior izquierda
        boolean inferiorDerecha = true; // Barra inferior derecha
        boolean inferior = true; // Barra inferior

        for (int i = 0; i < 7; i++) {
            switch (digito) {
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

    public static void secuenciaNumeros(int digito) {
        boolean superior = true; // Barra superior
        boolean superiorDerecha = true; // Barra superior derecha
        boolean superiorIzquierda = true; // Barra superior derecha
        boolean central = true; // Barra central
        boolean inferiorIzquierda = true; // Barra inferior izquierda
        boolean inferiorDerecha = true; // Barra inferior derecha
        boolean inferior = true; // Barra inferior

        for (int i = 0; i < 7; i++) {

            for (int numero = 0; numero <= digito; numero++) {

                switch (numero) {
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

                System.out.print("  ");

            }
            System.out.println("");
        }
    }
}
