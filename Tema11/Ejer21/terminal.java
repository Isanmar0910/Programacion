package Tema11.Ejer21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class terminal {
    public static void main(String[] args) {

        try {

            File f = new File(args[1]);

            FileWriter archivo = new FileWriter(args[1], true);
            BufferedWriter bw = new BufferedWriter(archivo);

            FileReader arc = new FileReader(args[1]);
            BufferedReader br = new BufferedReader(arc);

            String linea = "";

            switch (args[0]) {
                case "info":

                    if (f.exists()) {
                        System.out.println("[INFO] Nombre: " + f.getName());

                        if (f.isFile()) {
                            System.out.println("[INFO] Tipo: Archivo");
                        } else {
                            System.out.println("[INFO] Tipo: Directorio");
                        }

                        System.out.println("[INFO] Tamaño: " + f.length() + " bytes");

                        if (f.canWrite()) {
                            System.out.print("[INFO] Permisos: LECTURA (SI)");
                        } else {
                            System.out.print("[INFO] Permisos: LECTURA (NO)");
                        }

                        if (f.canRead()) {
                            System.out.print(" | Escritura (SI)");
                        } else {
                            System.out.print(" | Escritura (NO)");
                        }
                    } else {
                        System.out.println("[ERROR] La ruta especificada no existe");
                    }

                    break;

                case "creardir":

                    if (f.mkdir()) {
                        System.out.println("[EXITO] La carpeta se ha creado correctamente");
                    } else {
                        System.out.println("[FALLO] La carpeta no se ha podido crear");
                    }
                    break;
                
                case "escribir":
                    
                    bw.newLine();
                    bw.write(args[2]);
                    System.out.println("[EXITO] Texto añadido a " + args[2] + " añadido correctamente");
                    bw.close();

                    break;

                case "leer" :

                    System.out.println("--- CONTENIDO DE " + args[1] + " ---");

                    while (linea != null) {
                        linea = br.readLine();
                        System.out.println(linea);
                        
                    }
                    System.out.println("---------------------------------");
                    break;
                default:
                    break;
            }

        } catch (NullPointerException npe) {
            System.out.println("si");
        } catch (IOException ioe) {
            System.out.println("ERROR GARRAFAL");
        }

    }
}
