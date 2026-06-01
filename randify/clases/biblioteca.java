package randify.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class biblioteca {

    private HashMap<Integer, cancion> catalogo;
    private String nombreArchivo;

    public biblioteca(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.catalogo = new HashMap<>();
    }

    public boolean leerCatalogo() {
        String[] parte;
        String linea;
        boolean resultado = true;

        try (BufferedReader br = new BufferedReader(new FileReader(this.nombreArchivo))) {

            linea = br.readLine();

            while (linea != null) {

                parte = linea.split(";");

                if (parte.length == 5) {
                    int id = Integer.parseInt(parte[0]);

                    catalogo.put(id, new cancion(
                            id,
                            parte[1],
                            parte[2],
                            parte[3],
                            Integer.parseInt(parte[4])));
                }

                linea = br.readLine();
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + nombreArchivo);
            resultado = false;
        } catch (IOException e) {
            resultado = false;
        }
        return resultado;
    }

    public boolean guardarCatalogo() {
        boolean resultado = true;

        try {
            FileWriter archivo = new FileWriter(this.nombreArchivo);
            BufferedWriter bw = new BufferedWriter(archivo);

            for (HashMap.Entry<Integer, cancion> i : catalogo.entrySet()) {
                cancion c = i.getValue();

                bw.write(i.getKey() + ";" + c.getTitulo() + ";" + c.getArtrista() + ";" + c.getGenero() + ";"
                        + c.getDuracion());
                bw.newLine();

            }

            bw.close();

        } catch (IOException ioe) {
            resultado = false;
        }

        return resultado;
    }

    public void nuevaCancion(String titulo, String artista, String genero, int duracion) {
        int id = catalogo.size() + 1;

        cancion c = new cancion(id, titulo, artista, genero, duracion);

        catalogo.put(id, c);

    }

    public void listarCatalogo() {

        for (HashMap.Entry<Integer, cancion> i : catalogo.entrySet()) {
            System.out.println(i.getValue());
        }

    }

    public void generarPlayList(String genero, int maxMinutos, String salida) {
        HashMap<Integer, cancion> playlist = new HashMap<>();
        ArrayList<cancion> seleccion = new ArrayList<>();
        int totalSegundos = 0;
        int maxSegundos = maxMinutos * 60;
        int duracionCan;
        int minutos;
        int segundos;

        for (cancion i : catalogo.values()) {
            if (i.getGenero().equalsIgnoreCase(genero)) {
                seleccion.add(i);
            }
        }

        Collections.shuffle(seleccion);

        for (cancion c : seleccion) {
            duracionCan = c.getDuracion();

            if ((duracionCan + totalSegundos) <= maxSegundos) {
                totalSegundos += duracionCan;
                playlist.put(c.getId(), c);
            }
        }

        try {
            FileWriter archivo = new FileWriter(salida);
            BufferedWriter bw = new BufferedWriter(archivo);

            bw.write("=== " + genero.toUpperCase());
            bw.newLine();

            for (HashMap.Entry<Integer, cancion> i : playlist.entrySet()) {
                cancion c = i.getValue();

                bw.write(c.toString());
                bw.newLine();

            }

            bw.write("====================================");
            bw.newLine();

            bw.write("Total canciones: " + playlist.size());
            bw.newLine();

            minutos = totalSegundos / 60;
            segundos = totalSegundos % 60;

            bw.write("Duracion total: " + minutos + " minutos y " + segundos + " segundos.");

            bw.close();

        } catch (IOException ioe) {
            System.out.println("Error garrafal");
        }
    }
}
