package Tema9.disquitopapu;

import java.util.Scanner;

import Tema9.disquitopapu.clases.disco;

public class app {
    public static void main(String[] args) {

        
        int eleccion = 0;
        int posicion = 0;

        disco[] discos = new disco[5];
        Scanner sc = new Scanner(System.in);

        discos[0] = new disco("aaa", "aaa", "aaa", "aaa", 1);

        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;

        while (eleccion != 5) {
            System.out.print("COLECCIÓN DE DISCOS\n" + //
                    "\n" + //
                    "1. Listado\n" + //
                    "2. Nuevo disco\n" + //
                    "3. Modificar\n" + //
                    "4. Borrar\n" + //
                    "5. Salir\n" + //
                    "Introduzca una opción: ");
            eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {
                case 1:
                    if (discos.length > 0 && discos[0] != null) {
                        System.out.println("\nLISTA DE DISCOS\n");
                        for (int i = 0; i < discos.length; i++) {
                            System.out.println(discos[i]);
                        }
                    } else {
                        System.out.println("\nVACIO INTRODUZCA NUEVOS DISCOS\n");
                    }

                    break;
                case 2:
                    System.out.println("Introduzca los datos del nuevo disco");

                    System.out.print("Codigo: ");
                    codigo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    System.out.print("Duracion: ");
                    duracion = sc.nextInt();

                    
                    discos[posicion++] = new disco(codigo, autor, titulo, genero, duracion);

                    break;
                case 3:
                    System.out.println("\nMODIFICACION");
                    System.out.print("Introduzca el codigo del disco que quieras modificar: ");
                    codigo = sc.nextLine();

                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i] != null && discos[i].getCodigo().equals(codigo)) {
                            discos[i] = null;
                            System.out.println("Introduzca los nuevos datos");
                            System.out.print("Codigo: ");
                            codigo = sc.nextLine();
                            System.out.print("Autor: ");
                            autor = sc.nextLine();
                            System.out.print("Titulo: ");
                            titulo = sc.nextLine();
                            System.out.print("Genero: ");
                            genero = sc.nextLine();
                            System.out.print("Duracion: ");
                            duracion = sc.nextInt();

                            discos[i] = new disco(codigo, autor, titulo, genero, duracion);

                        }
                    }
                    break;
                case 4:
                    System.out.println("ElIMINAR");
                    System.out.println("INTRODUCE EL CODIGO DEL DISCO QUE QUIERAS ELIMINAR: ");
                    codigo = sc.nextLine();

                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i] != null && discos[i].getCodigo().equals(codigo)){
                            discos[i] = null;
                            System.out.println("Disco eliminado correctamente");
                        }else {
                            System.out.println("NO EXISTE");
                        }
                    }
                    break;

                default:
                    break;
            }
        }

    }

}
