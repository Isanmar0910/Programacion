package Tema6.Ejercicios.ejemploexamen;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int elecMenu;
        Scanner sc = new Scanner(System.in);

        String[] alumnos = new String[10];
        double[] notas = new double[10];

        do {
             System.out.println("╔═════════════════════════════════════╗\r\n" + //
                        "║ GESTOR DE NOTAS DE CLASE            ║\r\n" + //
                        "╠═════════════════════════════════════╣\r\n" + //
                        "║ 1. Introducir alumnos y notas       ║\r\n" + //
                        "║ 2. Mostrar todos los datos          ║\r\n" + //
                        "║ 3. Calcular nota media              ║\r\n" + //
                        "║ 4. Mostrar nota máxima y mínima     ║\r\n" + //
                        "║ 5. Contar aprobados y suspensos     ║\r\n" + //
                        "║ 6. Buscar alumno por nombre         ║\r\n" + //
                        "║ 7. Modificar nota de un alumno      ║\r\n" + //
                        "║ 8. Ordenar por nota (menor a mayor) ║\r\n" + //
                        "║ 0. Salir                            ║\r\n" + //
                        "╚═════════════════════════════════════╝");

            System.out.print("Selecciona que quieres hacer: ");
            elecMenu = sc.nextInt();
            sc.nextLine();

            switch (elecMenu) {
                case 1:
                    Arrais.nombreAlumnos(alumnos, notas, sc);
                    break;
                case 2:
                    Arrais.datosAlumn(alumnos, notas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (elecMenu != 0);
    }
}
