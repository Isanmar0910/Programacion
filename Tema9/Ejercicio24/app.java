package Tema9.Ejercicio24;

import Tema9.Ejercicio24.Clases.Gestismal;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        int eleccion = 0;

        Scanner sc = new Scanner(System.in);

        Gestismal[] articulo = new Gestismal[2];

        String codigo;
        String desc;
        double pComp;
        double pvent;
        int stock;
        int posicion = 0;
        int nMercancia;
        int temp;

        while (eleccion != 7) {

            System.out.print("GESTISIMAL =================== \r\n"
                    + //
                    "1. Listado\r\n"
                    + //
                    "2. Alta\r\n"
                    + //
                    "3. Baja\r\n"
                    + //
                    "4. Modificación\r\n"
                    + //
                    "5. Entrada de mercancía\r\n"
                    + //
                    "6. Salida de mercancía\r\n"
                    + //
                    "7. Salir\r\n"
                    + //
                    "Introduzca una opción:"
                    + //
                    "");

            eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {
                case 1:
                    System.out.println("LISTADO\r\n"
                            + //
                            "=======\r\n"
                            + //
                            "------------------------------------------\r\n"
                            + //
                            "");
                    for (int i = 0; i < articulo.length; i++) {
                        System.out.println(articulo[i]);
                        System.out.println("");
                    }
                    System.out.println("------------------------------------------");

                    break;
                case 2:
                    System.out.println("NUEVO ARTICULO");
                    System.out.println("==================");
                    System.out.println("Porfavor introduzca los datos del articulo");

                    System.out.print("Codigo: ");
                    codigo = sc.nextLine();

                    System.out.print("\nDescripccion: ");
                    desc = sc.nextLine();

                    System.out.print("\nPrecio de compra: ");
                    pComp = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("\nPrecio de venta: ");
                    pvent = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("\nStock: ");
                    stock = sc.nextInt();
                    sc.nextLine();

                    articulo[posicion++] = new Gestismal(codigo, desc, pComp, pvent, stock);

                    break;
                case 3:
                    System.out.println("Dar de baja");
                    System.out.print("Selecciona el codigo del articulo que quieras dar de baja: ");
                    codigo = sc.nextLine();

                    for (int i = 0; i < articulo.length; i++) {
                        if (articulo[i] != null && articulo[i].getCodigo().equals(codigo)) {
                            articulo[i] = null;
                            System.out.println("El objeto se ha dado de baja correctamente");

                            break;
                        } else {
                            System.out.println("no hay ningun articulo con ese codigo");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Modificacion de articulos");
                    System.out.print("Selecciona el codigo del articulo que quieras modificar: ");
                    codigo = sc.nextLine();

                    for (int i = 0; i < articulo.length; i++) {
                        if (articulo[i] != null && articulo[i].getCodigo().equals(codigo)) {

                            System.out.print("\nDescripccion: ");
                            desc = sc.nextLine();

                            System.out.print("\nPrecio de compra: ");
                            pComp = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("\nPrecio de venta: ");
                            pvent = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("\nStock: ");
                            stock = sc.nextInt();
                            sc.nextLine();

                            articulo[i] = new Gestismal(codigo, desc, pComp, pvent, stock);

                        } else {
                            System.out.println("no hay ningun articulo con ese codigo");
                        }
                    }

                    break;

                case 5:
                    System.out.println("ENTRADA DE MERCANCIA");
                    System.out.print("Selecciona el codigo del articulo: ");

                    codigo = sc.nextLine();

                    for (int i = 0; i < articulo.length; i++) {
                        if (articulo[i] != null && articulo[i].getCodigo().equals(codigo)) {
                            System.out.println("");
                            System.out.println(articulo[i].toString());
                            System.out.println("");

                            System.out.print("Introduce el numero de mercancia que entra: ");
                            nMercancia = sc.nextInt();

                            temp = articulo[i].getStock();

                            articulo[i].setStock(temp + nMercancia);
                            System.out.println("\n------------------------");

                        }
                    }
                    break;
                case 6:
                    System.out.println("SALIDA DE MERCANCIA");
                    System.out.print("Selecciona el codigo del articulo: ");

                    codigo = sc.nextLine();

                    for (int i = 0; i < articulo.length; i++) {
                        if (articulo[i] != null && articulo[i].getCodigo().equals(codigo)) {
                            System.out.println("");
                            System.out.println(articulo[i].toString());
                            System.out.println("");

                            System.out.print("Introduce el numero de mercancia que sale: ");
                            nMercancia = sc.nextInt();

                            temp = articulo[i].getStock();

                            articulo[i].setStock(temp - nMercancia);
                            System.out.println("\n------------------------");

                        }
                    }
                    break;

                default:
                    throw new AssertionError();
            }

        }

    }
}
