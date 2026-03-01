package Tema9.Ejercicio19.Clases;

public class Revista extends Publicacion {

    private int nRevista;

    public Revista(String codigo, String titulo, int añoPublicacion, int nRevista) {
        super(codigo, titulo, añoPublicacion);

        this.nRevista = nRevista;

    }

    @Override
    public String toString(){
        return super.toString() + " Numero de revista: " + nRevista;
    }

    


}
