package Tema11.Ejer1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter archivo = new FileWriter("datos.txt");
            BufferedWriter bw = new BufferedWriter(archivo);

            bw.write("Hola, esto es un archivo de prueba\n");
            bw.write("Estamos aprendiendo a leer archivos en Java\n");
            bw.write("Cada linea representa un dato diferente\n");
            bw.write("Puedes aádir mas lineas para probar el programa\n");

            bw.close();
        
        } catch (IOException ioe) {
            System.out.println("Ha ocurrido un error con la creacion del archivo");
        }
    }
}
