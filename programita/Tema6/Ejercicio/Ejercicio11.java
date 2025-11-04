package Tema6.Ejercicio;

public class Ejercicio11 {
    public static void main(String[] args) {
        int n;

        for (int i=0; i<1000000000 ; i++) {
            n=(int)(Math.random()*95)+32;

            System.out.print("\033[32m" + (char)n);
        }
    }
}
