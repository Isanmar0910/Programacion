package Tema6.Ejercicios.ejemploexamen;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int elecMenu = 0;

        Scanner sc = new Scanner(System.in);
        
        
        String[] alumnos = new String[10];


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

        elecMenu  = sc.nextInt();

        switch (elecMenu) {
            case 1:
                Arrais.nombreAlumnos(alumnos);
                break;
            default:
                throw new AssertionError();
        }
    }
}
