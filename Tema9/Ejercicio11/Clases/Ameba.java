package Tema9.Ejercicio11.Clases;

public class Ameba {

    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public void come(int n) {
        if (n > 0) {
            this.peso += (n - 1);
        }
    }

    public void come(Ameba amebaPresa) {
        if (amebaPresa != null && amebaPresa.peso > 0) {
            this.peso += (amebaPresa.peso - 1);
            amebaPresa.peso = 0;
        }
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos.";
    }
}
