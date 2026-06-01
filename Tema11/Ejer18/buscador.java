package Tema11.Ejer18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buscador {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Error: faltan argumentos");
        } else {
            String palabra = args[0];
            String archivo = args[1];
            String linea;
            boolean encontrado = false;

            try {
                BufferedReader br = new BufferedReader(new FileReader(archivo));

                while ((linea = br.readLine()) != null) {

                    if (linea.contains(palabra)) {
                        System.out.println(linea);
                        encontrado = true;
                    }
                }

                br.close();

                if (!encontrado) {
                    System.out.println("La palabra no está en el archivo");
                }

            } catch (IOException e) {
                System.out.println("Error al abrir el archivo");
            }
        }
    }
}