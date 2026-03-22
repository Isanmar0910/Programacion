package Tema11.Ejer2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leer {
    public static void main(String[] args) {
        try {
            String linea = "";

            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);

            do {
                System.out.println(linea);
                linea = br.readLine();
                
            } while (linea != null);

            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no se ha encontrado");
        }catch (IOException ioe){
            System.out.println("No se ha podido leer el archivo correctamente");
        }
    }
}
