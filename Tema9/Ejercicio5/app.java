package Tema9.Ejercicio5;

import Tema9.Ejercicio5.Clases.Bicicleta;
import Tema9.Ejercicio5.Clases.Coche;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        int respuesta = 0;

        Scanner sc = new Scanner(System.in);

        Coche coche = new Coche();
        Bicicleta bici = new Bicicleta();

        int km;

        while (respuesta != 8) {
            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");

            respuesta = sc.nextInt();


            switch (respuesta) {
                case 1:
                    System.out.print("Cuantos km quieres desplazarte: ");
                    km = sc.nextInt();
                    bici.moverse(km);
                    break;
                case 2:
                    bici.caballito();
                    break;
                case 3:
                    System.out.print("Cuantos km quieres desplazarte: ");
                    km = sc.nextInt();
                    coche.moverse(km);
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos");
                    System.out.println(bici.getKilometro() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos");
                    System.out.println(coche.getKilometro() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos");
                    System.out.println(Vehiculo.getKmTot() + " Km");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
        sc.close();
    }
}
