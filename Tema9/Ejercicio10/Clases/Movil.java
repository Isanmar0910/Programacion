package Tema9.Ejercicio10.Clases;

public class Movil {

    private String telefono;
    private int tiempoLlamada;
    private String tarifa;

    public Movil(String telefono, String tarifa) {
        this.telefono = telefono;
        this.tiempoLlamada = 0;
        this.tarifa = tarifa;

    }

    public void llama(Movil t, int segundos) {
        if (segundos > 0) {
            this.tiempoLlamada += segundos;
            t.tiempoLlamada += segundos;
        }
    }

    public enum tarifa{
        RATA, BISONTE, MONO
    }

    @Override
    public String toString() {
        return "No " + this.telefono + " - "
                + this.tiempoLlamada + "s de conversación";
    }
}
