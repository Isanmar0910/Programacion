package Tema9.Ejercicio19.Clases;

import Tema9.Ejercicio19.Clases.Publicacion.prestable;

public class Libro extends Publicacion implements prestable {

    private boolean prestado;
    private String estado = "No prestado";

    public Libro(String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.prestado = false; 

    }

    @Override
    public void presta() {
        if (prestado) {
            System.out.println("El libro ya esta prestado");
        } else {
            prestado = true;
            estado = "Prestado";
        }
    }

    @Override
    public void devuelve() {
        if (prestado) {
            prestado = false;
            estado = "No prestado";
        } else {
            System.out.println("Este libro no esta prestado");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + estado + " )";
    }

}
