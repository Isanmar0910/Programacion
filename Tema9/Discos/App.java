package Tema9.Discos;

import Tema9.Discos.Clases.ColeccionDiscos;
import Tema9.Discos.Clases.Disco;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColeccionDiscos coleccion = new ColeccionDiscos();

        // Disco inicial de prueba
        coleccion.añadirDisco(
                new Disco("111", "Malu", "Salsa Dubai Acida", "NoBinario", 1000)
        );

        int eleccion;

        do {
            System.out.println("COLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Buscar disco");
            System.out.println("4. Eliminar disco");
            System.out.println("5. Salir");

            System.out.print("Introduzca una opción: ");
            eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {

                case 1:
                    coleccion.mostrarDisco();
                    break;

                case 2:
                    
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Género: ");
                    String genero = sc.nextLine();

                    System.out.print("Duración (minutos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    Disco nuevo = new Disco(codigo, autor, titulo, genero, duracion);
                    coleccion.añadirDisco(nuevo);

                    System.out.println("Disco añadido correctamente.\n");
                    break;

                case 3:
                    System.out.print("Introduce el código del disco: ");
                    String codBuscar = sc.nextLine();

                    Disco encontrado = coleccion.buscarDisco(codBuscar);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró el disco.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce el código del disco a eliminar: ");
                    String codEliminar = sc.nextLine();

                    if (coleccion.eliminarDisco(codEliminar)) {
                        System.out.println("Disco eliminado correctamente.");
                    } else {
                        System.out.println("Ese disco no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (eleccion != 5);

        sc.close();
    }
}