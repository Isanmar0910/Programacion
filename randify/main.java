package randify;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import randify.clases.biblioteca;

public class main {
    public static void main(String[] args) {

        String linea = "";
        
        try {
            FileReader archivo = new FileReader("randify/help.txt");
            BufferedReader br = new BufferedReader(archivo);

            if (args[0].equals("--help")) {

                linea = br.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }
            }else if (args[1].equals("--list") && args[0].endsWith(".csv")) {
                biblioteca b = new biblioteca(args[0]);

                if (b.leerCatalogo()) {
                    b.listarCatalogo();
                }else {
                    System.out.println("ERROR");
                }
            }else if (args[1].equals("--add") && args[0].endsWith(".csv") && args.length == 6) {
                biblioteca b = new biblioteca(args[0]);

                if (b.leerCatalogo() ) {
                    b.nuevaCancion(args[2], args[3], args[4], Integer.parseInt(args[5]));
                    b.guardarCatalogo();
                }
            }else if (args[1].equals("--generate") && args[0].endsWith(".csv") && args.length == 5) {
                biblioteca b = new biblioteca(args[0]);

                if (b.leerCatalogo()) {
                    b.generarPlayList(args[2], Integer.parseInt(args[3]), args[4]);
                }
            }


        } catch (FileNotFoundException fnfe) {
            System.out.println("error");
        } catch (IOException ioe) {
            System.out.println("Me peo");
        }

    }
}
