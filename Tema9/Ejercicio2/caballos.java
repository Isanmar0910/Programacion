package Tema9.Ejercicio2;

public class caballos {

    String nombre;
    String sexo;
    String raza;

    double peso;
    int edad;

    public caballos(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre);
    }

    public void andar() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void relinchar() {
        System.out.println("Hiiiiiiieeeeee");
    }

    public void comer() {
        System.out.println("Ñam ñam ñam");
    }
}
