package Tema11.Ejer18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("ERROR: debes introducir una palabra y un archivo");
        } else {

            try {

                String linea;
                int numLinea = 1;

                FileReader archivo = new FileReader(args[1]);
                BufferedReader br = new BufferedReader(archivo);

                while ((linea = br.readLine()) != null) {

                    if (linea.contains(args[0])) {
                        System.out.println("Línea " + numLinea + ": " + linea);
                    }

                    numLinea++;
                }

                br.close();

            } catch (IOException ioe) {
                System.out.println("ERROR: el archivo no existe o no se puede leer");
            }
        }
    }
}