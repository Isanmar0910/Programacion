package Tema6.Ejercicio;

public class Ejercicio1 {
    public static void main(String[] args) {
        int suma = 0;
        int tirada;


        for (int i=0 ; i<3 ; i++ ){
            tirada = (int)(Math.random() *6) +1;
            System.out.print(tirada + " ");
            suma += tirada;

        }

        System.out.printf("\nSuma: %d ", suma);

    }
    
    
}
