package Tema9.Ejercicio20.Clases;

public class Gato {

    private int num;
    private String nombre;
    private String color;
    private String raza;

    public Gato(int num, String nombre, String color, String raza){
        this.num = num;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    
    @Override
    public String toString(){
        return "Gato no" + num +
               "\nNombre: " + nombre +
               "\nColor: " + color +
               "\nRaza: " + raza;
    }
}