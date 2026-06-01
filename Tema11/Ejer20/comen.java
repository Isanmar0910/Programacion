package Tema11.Ejer20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class comen {
    public static void main(String[] args) {

        try {
            String linea = "";

            String archivoOriginal = args[0];
            String archivoLimpio = args[1];

            BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoLimpio));

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}