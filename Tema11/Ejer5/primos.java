package Tema11.Ejer5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class primos {

    public static void main(String[] args) {
        try {
            boolean esPrimo;

            FileWriter archivo = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(archivo);

            for (int numero = 2; numero <= 500; numero++) {

                esPrimo = true;

                for (int divisor = 2; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        esPrimo = false;
                    }
                }

                if (esPrimo) {
                    bw.write(numero + "");
                    bw.newLine();
                }
            }

            bw.close();
            System.out.println("Archivo primos.dat generado correctamente");

        } catch (IOException ioe) {
            System.out.println("Ha ocurrido un error al escribir el archivo");
        }
    }
}
