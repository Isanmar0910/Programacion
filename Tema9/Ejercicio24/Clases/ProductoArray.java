package Tema9.Ejercicio24.Clases;

import java.util.ArrayList;

public class ProductoArray {

    private ArrayList<Producto> productos;

    public ProductoArray() {
        productos = new ArrayList<>();
    }

    public void darAlta(Producto p) {
        productos.add(p);
    }

    public void darBaja(String codigo) {
        boolean encontrado = false;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equals(codigo)) {
                productos.remove(i); 
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("No hay ningún producto con ese código");
        }
    }

    public void modificar(){
        
    }
}
