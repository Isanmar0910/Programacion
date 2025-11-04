package Tema6.Ejercicio;

import javax.print.attribute.standard.Media;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int minimo  = 199;
        int maximo = 100;
        int media = 0;
        for (int i=1; i <50 ; i++) {
            numero = (int)(Math.random()*100)+100;

            System.out.print(numero + " ");

            if (numero < minimo) {
                minimo = numero;
            }
            
            if (numero > maximo) {
                maximo = numero;
            }

            media += numero;
            
        }

        System.out.println("\n Minimo: " + minimo);
        System.out.println(" Maximo: " + maximo);
        System.out.println(" Media: " + media/50);

    }
}
