package Tema9.Ejercicio5.Clases;

public class Vehiculo {

    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    private int kmRecorridos;

    public Vehiculo() {
        this.kmRecorridos = 0;
        vehiculosCreados++;
    }

    public void moverse(int km) {
        this.kmRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }

    public int getKilometro() {
        return this.kmRecorridos;
    }

    public static int getKmTot() {
        return kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
}
