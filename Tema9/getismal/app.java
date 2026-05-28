package Tema9.getismal;

import java.util.Scanner;

import Tema9.getismal.clases.getismal;

public class app {
    public static void main(String[] args) {

        int eleccion = 0;

        Scanner sc = new Scanner(System.in);

        getismal[] articulo = new getismal[2];

        String codigo;
        String descripcion;
        float precioCom;
        float precioVen;
        int stock;
        int posicion = 0;

        

        do {
            System.out.println("GESTISIMAL\n" +
                    "1. Listado\n" +
                    "2. Alta\n" +
                    "3. Baja\n" +
                    "4. Modificación\n" +
                    "5. Entrada de mercancía\n" +
                    "6. Salida de mercancía\n" +
                    "7. Salir");
            System.out.print("Introduzca una opcion: ");
            eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {
                case 1:
                    System.out.println("\nLISTADO\n======\n------------------------------\n");
                    for (getismal i : articulo) {
                        System.out.println(i);
                    }
                    break;
                case 2:

                    System.out.println("\nPor favor, introduzca los datos del articulo");
                    System.out.print("Codigo: ");
                    codigo = sc.nextLine();
                    System.out.print("Descripcion: ");
                    descripcion = sc.nextLine();
                    System.out.print("Precio de compra: ");
                    precioCom = sc.nextFloat();
                    System.out.print("Precio de venta: ");
                    precioVen = sc.nextFloat();
                    System.out.print("Stock: ");
                    stock = sc.nextInt();
                    articulo[posicion++] = new getismal(codigo, descripcion, precioCom, precioVen, stock);
                    break;

                case 3:
                    System.out.println("Que articulo quieres eliminar: ");
                    codigo = sc.nextLine();

                    for (int i = 0; i < articulo.length; i++) {
                        if (articulo[i] != null && articulo[i].getCodigo().equals(codigo)) {
                            
                            articulo[i] = null;
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (eleccion != 7);
    }
}
