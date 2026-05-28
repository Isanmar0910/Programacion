package Tema10.Ejercicio17.clases;

import java.util.ArrayList;

public class Carrito {

    ArrayList<Elemento> producto = new ArrayList<>();

    public Carrito() {
    }

    public void agrega(Elemento e) {
        boolean encontrado = false;

        for (Elemento elemento : producto) {
            if (elemento.getNombre().equals(e.getNombre())) {
                elemento.setCantidad(elemento.getCantidad() + e.getCantidad());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            producto.add(e);
        }
    }

    public int numeroDeElementos() {
        int total = 0;
        for (Elemento e : producto) {
            total += e.getCantidad();
        }
        return total;
    }

    public double importeTotal() {
        double total = 0;

        for (Elemento e : producto) {
            total += e.getPrecio() * e.getCantidad();
        }

        return total;
    }

    @Override
    public String toString() {

        return "CONTENIDO DEL CARRITO\n ================\n" + producto;
    }
}
