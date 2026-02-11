package Tema9.Ejercicio9.Clases;

public class Terminal {

    private String telefono;
    private int tiempoLlamada;
    private String tarifa;

    public Terminal(String telefono) {
        this.telefono = telefono;
        this.tiempoLlamada = 0;
        this.tarifa = tarifa;

    }

    public void llama(Terminal t, int segundos) {
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
