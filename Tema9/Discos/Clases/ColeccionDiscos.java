package Tema9.Discos.Clases;

import java.util.ArrayList;

public class ColeccionDiscos {

    private ArrayList<Disco> coleccion;

    public ColeccionDiscos() {
        coleccion = new ArrayList<>();
    }

    public void añadirDisco(Disco d) {
        coleccion.add(d);
    }

    public void mostrarDisco() {

        if (coleccion.isEmpty()) {
            System.out.println("No hay discos en la colección.");
            return;
        }

        System.out.println("LISTADO");
        System.out.println("=======");

        for (Disco d : coleccion) {
            System.out.println(d);
        }

        
    }

    public Disco buscarDisco(String codigo) {

        for (Disco d : coleccion) {
            if (d.getCodigo().equalsIgnoreCase(codigo)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDisco(String codigo) {

        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                coleccion.remove(i);
                return true;
            }
        }
        return false;
    }
}