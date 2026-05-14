package Tema11.Ejer19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class diccionario {
    public static void main(String[] args) {

        int eleccion = 0;

        String linea = "";
        String palabra;
        String traduccion;

        HashMap<String, String> diccionario = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        try {
            FileReader archivo = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(archivo);

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");

                if (partes.length == 2) {
                    diccionario.put(partes[0], partes[1]);
                }
            }

            while (eleccion != 3) {

                System.out.println("\n1. Buscar palabra");
                System.out.println("2. Añadir palabra");
                System.out.println("3. Salir");
                System.out.print("Introduzca su eleccion: ");
                eleccion = sc.nextInt();
                sc.nextLine();

                switch (eleccion) {
                    case 1:
                        System.out.print("Introduce la palabra que quieres buscar: ");
                        palabra = sc.nextLine();

                        if (diccionario.containsKey(palabra)) {
                            System.out.println("Traduccion: " + diccionario.get(palabra));
                        }

                        break;
                    case 2:

                        FileWriter arc = new FileWriter(args[0], true); // CORRECCIÓN 2: true para modo append
                        BufferedWriter bw = new BufferedWriter(arc);

                        System.out.print("Introduce la palabra que quieras añadir en español: ");
                        palabra = sc.nextLine();

                        if (diccionario.containsKey(palabra)) {
                            System.out.println("Esa palabra esta ya en el diccionario: ");
                        } else {
                            System.out.print("\nAñade tambien la traduccion: ");
                            traduccion = sc.nextLine();

                            bw.newLine();
                            bw.write(palabra + ":" + traduccion);
                            bw.close();

                            diccionario.put(palabra, traduccion);
                        }

                        break;
                    case 3:
                        System.out.println("Saliendo...");

                        break;

                    default:
                        break;
                }
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: el archivo indicado no existe");
        } catch (IOException ioe) {
            System.out.println("Error");
        }

    }
}