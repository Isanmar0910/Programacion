package Tema6.Ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        

        int[] numeros = new int[15];


        for (int i = 0; i < 15; i++) {
            
            numeros[i] = (int)(Math.random()*501);

            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nArray cincuerizado:");
        for (int i = 0; i < 15; i++) {
            if (numeros[i]%5 == 0) {
                System.out.print(numeros[i] + " ");
            }else {
                do {
                    numeros[i] = numeros[i] + 1;
                } while (numeros[i]%5 != 0);
                i--;
            }
        }
    }
}
