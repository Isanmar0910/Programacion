package Tema11.Ejer3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class busca {

    public static void main(String[] args) {
        try {
            String nomArc;
            String linea = "";

            Scanner sc = new Scanner(System.in);

            System.out.print("introduce el nombre completo del archivo que quieres copiar su contenido: ");
            nomArc = sc.nextLine();
            System.out.println("");

            FileReader archivo = new FileReader(nomArc);
            BufferedReader br = new BufferedReader(archivo);

            FileWriter destino = new FileWriter("destino.txt");
            BufferedWriter bw = new BufferedWriter(destino);

            while (linea != null) {

                //Lo escribe en el otro
                bw.write(linea);

                bw.newLine();

                //Lee  archivo inicial
                linea = br.readLine();

            }

            br.close();
            bw.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException ioe) {
            System.out.println("ha ocurridop un error");
        }
    }
}
