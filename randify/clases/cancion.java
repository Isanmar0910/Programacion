package randify.clases;

public class cancion {

    private int id;
    private String titulo;
    private String artrista;
    private String genero;
    private int duracion;

    public cancion(int id, String titulo, String artrista, String genero, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.artrista = artrista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getArtrista() {
        return artrista;
    }


    public void setArtrista(String artrista) {
        this.artrista = artrista;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getDuracion() {
        return duracion;
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return this.titulo + " - " + this.artrista + " (" + this.duracion + "s)";
    }
}
