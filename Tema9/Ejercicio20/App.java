package Tema9.Ejercicio20;

import Tema9.Ejercicio20.Clases.Gato;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gato[] gatos = new Gato[4];

       

        String nombre;
        String color;
        String raza;
        

        System.out.println("Por favor, introduzca los datos de los gatos.");

        for (int i = 0; i < gatos.length; i++) {

            System.out.println("Gato no " + (i + 1));

            System.out.print("Nombre: ");
            nombre = sc.nextLine();

            System.out.print("Color: ");
            color = sc.nextLine();

            System.out.print("Raza: ");
            raza = sc.nextLine();

            gatos[i] = new Gato(i + 1, nombre, color, raza);
            gatos[i] = new Gato(2, "javi", "verde", "peru");
        }

        System.out.println("\nDatos de los gatos:");

        // Bucle para mostrar datos
        for (int i = 0; i < gatos.length; i++) {
            System.out.println(gatos[i]);
            System.out.println("");
        }

        sc.close();
    }
}