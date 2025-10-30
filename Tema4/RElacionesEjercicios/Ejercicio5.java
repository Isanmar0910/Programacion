package Tema4.RElacionesEjercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        final float G = 9.81f; 
        float h;
        
        System.out.println("Cálculo del tiempo de caída de un objeto");
        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        h = Float.parseFloat(System.console().readLine());
        float t = (float)(Math.sqrt((2*h)/G));
        
        if (h >= 0) {
            System.out.printf("El objeto tarda %.3f en caer", t);
        }else {
            System.out.println("No se puede hase");
        }
    }
}
