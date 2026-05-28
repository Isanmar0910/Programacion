package Tema10.Ejercicio17.clases;

public class Elemento {
    
    private String nombre;
    private double precio;
    private int cantidad;

    public Elemento(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCantidad(){
        return this.cantidad;
        
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecio(){
        return this.precio;
        
    }

    @Override
    public String toString() {
        return nombre + " | Cantidad: " + cantidad + " | Precio: " + String.format("%.2f", precio) + "€\n";
    }

}
