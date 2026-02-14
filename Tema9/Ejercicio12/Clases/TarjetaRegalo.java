package Tema9.Ejercicio12.Clases;

public class TarjetaRegalo {

    private int numIdentif;
    private double saldo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numIdentif = (int) (Math.random() * 100000);
    }

    public void gasta(double n) {
        if (n <= this.saldo) {
            this.saldo -= n;
        } else {
            System.out.println("No tiene suficiente saldo.");
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t1) {
        double total = this.saldo + t1.saldo;

        this.saldo = 0;
        t1.saldo = 0;

        return new TarjetaRegalo(total);
    }

    public String toString() {
        return "Tarjeta nº " + numIdentif + " - Saldo: " + saldo + " €";
    }
}
