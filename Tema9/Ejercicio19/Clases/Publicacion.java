package Tema9.Ejercicio19.Clases;

public class Publicacion {

   

    private String codigo;
    private String titulo;
    private int añoPublicacion;

    public interface prestable{
        void presta();
        void devuelve();
        boolean estaPrestado();
        
    }

    public Publicacion(String codigo, String titulo, int añoPublicacion) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;   
    }

    @Override
    public String toString(){
        return "ISBN: " + codigo + ",titulo: " + titulo + ",año de publicacion: " + añoPublicacion;
    }
    
}
