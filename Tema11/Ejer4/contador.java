package Tema11.Ejer4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class contador {

    public static void main(String[] args) {
        try {
            String linea = "";

            int totalLineas = 0;
            int totalPalabras = 0;
            int totalCaracteres = 0;

            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);
        
            
            while (linea != null) {
                totalLineas++;
                totalCaracteres += linea.length();

                String[] palabras = linea.split(" ");
                totalPalabras += palabras.length;

                linea = br.readLine();
            }

            br.close();

            System.out.println("Total líneas leídas: " + totalLineas);
            System.out.println("Total de palabras  : " + totalPalabras);
            System.out.println("Total de caracteres: " + totalCaracteres);


        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException ioe) {
            System.out.println("ha ocurridop un error");
        }
    }
}
