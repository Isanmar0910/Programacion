package Tema6.Ejercicio;

public class Ejercicio8 {
    public static void main(String[] args) {
        int n;
        int total=0;

        do {
            n = (int)(Math.random()*100)+1;
            total++;
            System.out.print(n + " ");
            
        } while (n != 24);
        
        System.out.println("\nSe han generado " + total + " numeros");


    }
}
