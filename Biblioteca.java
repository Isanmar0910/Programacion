import java.io.*;
import java.util.*;

public class Biblioteca {
    private HashMap<Integer, Cancion> catalogo;
    private String nombreArchivo;

    public Biblioteca(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.catalogo = new HashMap<>();
    }

    public boolean leerCatalogo() {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;
                String[] partes = linea.split(";");
                if (partes.length != 5) continue;
                int id = Integer.parseInt(partes[0].trim());
                String titulo = partes[1].trim();
                String artista = partes[2].trim();
                String genero = partes[3].trim();
                int duracion = Integer.parseInt(partes[4].trim());
                catalogo.put(id, new Cancion(id, titulo, artista, genero, duracion));
            }
            return true;
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return false;
        }
    }

    public boolean guardarCatalogo() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            // Ordenar por id para guardar de forma consistente
            List<Integer> ids = new ArrayList<>(catalogo.keySet());
            Collections.sort(ids);
            for (int id : ids) {
                Cancion c = catalogo.get(id);
                pw.println(c.getId() + ";" + c.getTitulo() + ";" + c.getArtista() + ";" + c.getGenero() + ";" + c.getDuracion());
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
            return false;
        }
    }

    public void nuevaCancion(String titulo, String artista, String genero, int duracion) {
        // Calcular el nuevo id (máximo actual + 1)
        int nuevoId = catalogo.isEmpty() ? 1 : Collections.max(catalogo.keySet()) + 1;
        Cancion c = new Cancion(nuevoId, titulo, artista, genero, duracion);
        catalogo.put(nuevoId, c);
    }

    public void listarCatalogo() {
        List<Integer> ids = new ArrayList<>(catalogo.keySet());
        Collections.sort(ids);
        for (int id : ids) {
            System.out.println(catalogo.get(id));
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Total: " + catalogo.size() + " canciones en la biblioteca.");
    }

    public void generarPlayList(String genero, int maxMinutos, String salida) {
        int maxSegundos = maxMinutos * 60;

        // 1. Filtrar por género (ignorando mayúsculas)
        List<Cancion> filtradas = new ArrayList<>();
        for (Cancion c : catalogo.values()) {
            if (c.getGenero().equalsIgnoreCase(genero)) {
                filtradas.add(c);
            }
        }

        // 2. Mezclar aleatoriamente
        Collections.shuffle(filtradas);

        // 3. Seleccionar canciones sin superar el tiempo máximo
        List<Cancion> playlist = new ArrayList<>();
        int totalSegundos = 0;
        for (Cancion c : filtradas) {
            if (totalSegundos + c.getDuracion() > maxSegundos) {
                break;
            }
            playlist.add(c);
            totalSegundos += c.getDuracion();
        }

        // 4. Guardar en archivo de salida
        try (PrintWriter pw = new PrintWriter(new FileWriter(salida))) {
            pw.println("=== " + genero.toUpperCase());
            for (int i = 0; i < playlist.size(); i++) {
                Cancion c = playlist.get(i);
                pw.println((i + 1) + ". [" + c.getTitulo() + "] - [" + c.getArtista() + "] (" + c.getDuracion() + "s)");
            }
            pw.println("=============================");
            int mins = totalSegundos / 60;
            int segs = totalSegundos % 60;
            pw.println("Total canciones: " + playlist.size());
            pw.println("Duración total: " + mins + " minutos y " + segs + " segundos.");
            System.out.println("Playlist generada en '" + salida + "' con " + playlist.size() + " canciones.");
        } catch (IOException e) {
            System.err.println("Error al guardar la playlist: " + e.getMessage());
        }
    }
}
