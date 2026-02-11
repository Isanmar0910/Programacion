package Tema9.Ejercicio8;

import Tema9.Ejercicio8.Clases.Zona;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Zona zonaPrincipal = new Zona(1000);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaPapu = new Zona(25);

        int respuesta = 0;
        int respVenta;
        int nEntradas;

        Scanner sc = new Scanner(System.in);

        while (respuesta != 3) {
            System.out.println("EXPOCOCHES MÁLAGA\r\n"
                    + //
                    "1. Mostrar número de entradas libres\r\n"
                    + //
                    "2. Vender entradas\r\n"
                    + //
                    "3. Salir\r\n"
                    + //
                    "Elige una opción:\r\n"
                    + //
                    "");
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("En la zona principal hay " + zonaPrincipal.getEntradasPorVender());
                    System.out.println("En la zona Compra venta hay " + zonaCompraVenta.getEntradasPorVender());
                    System.out.println("En la zona vip hay " + zonaPapu.getEntradasPorVender());
                    break;

                case 2:
                    System.out.println("1. Principal");
                    System.out.println("2. Compra-venta");
                    System.out.println("3. Vip");
                    System.out.println("Elige la zona para la que quieres comprar las entradas:");
                    respVenta = sc.nextInt();

                    System.out.println("¿Cuántas entradas quieres?");
                    nEntradas = sc.nextInt();

                    if (respVenta == 1) {
                        zonaPrincipal.vender(nEntradas);
                    } else if (respVenta == 2) {
                        zonaCompraVenta.vender(nEntradas);
                    } else if (respVenta == 3) {
                        zonaPapu.vender(nEntradas);
                    } else {
                        System.out.println("Zona no válida.");
                    }
                    break;

                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        }
    }

}
